package fr.vvlabs.stackhelper.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import fr.vvlabs.stackhelper.demo.dao.PetDao;
import fr.vvlabs.stackhelper.demo.dto.PetDTO;
import fr.vvlabs.stackhelper.demo.dto.PetWriteDTO;
import fr.vvlabs.stackhelper.demo.model.Pet;
import fr.vvlabs.stackhelper.service.AbstractService;

@Service
public class PetService extends AbstractService<Pet, Integer, PetDTO, PetWriteDTO> {

	@Autowired
	private PetDao petDao;
	
	@Override
	protected void updateModel(Pet model, PetWriteDTO dto) {
		// update id ?
		if(dto.getId() != null) {
			model.setId(dto.getId());
		}
		// check name, should be unique !
		if(!dto.getName().isEmpty() && petDao.findByName(dto.getName()) == null) {
			model.setName(dto.getName());
		}
		// check friends
		if(!CollectionUtils.isEmpty(dto.getFriendsIds())) {
			for(Integer friendId : dto.getFriendsIds()){
				// pet friend should exists !
				if(petDao.existsById(friendId)){
					model.addFriend(petDao.findById(friendId).get());
				}
			}
		}
	}
}
