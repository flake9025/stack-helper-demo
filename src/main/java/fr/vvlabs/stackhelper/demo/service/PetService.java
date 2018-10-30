package fr.vvlabs.stackhelper.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	protected Pet updateModel(final Pet model, final PetWriteDTO dto) {
		// check name
		if(dto.getName().isEmpty()) {
			// pet name should be unique !
			if(petDao.findByName(dto.getName()) == null){
				model.setName(dto.getName());
			}
		}
		// check friends
		for(Integer friendId : dto.getFriendsIds()){
			// pet friend should exists !
			if(petDao.existsById(friendId)){
				model.getFriends().add(petDao.findById(friendId).get());
			}
		}
		return model;
	}
}
