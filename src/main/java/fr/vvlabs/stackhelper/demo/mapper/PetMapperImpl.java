package fr.vvlabs.stackhelper.demo.mapper;

import org.springframework.stereotype.Component;

import fr.vvlabs.stackhelper.demo.dto.PetDTO;
import fr.vvlabs.stackhelper.demo.model.Pet;
import fr.vvlabs.stackhelper.mapper.AbstractMapper;

@Component
public class PetMapperImpl implements AbstractMapper<Pet, Integer, PetDTO> {

	@Override
	public PetDTO mapToDto(Pet model){
		PetDTO dto = new PetDTO();
		dto.setId(model.getId());
		dto.setName(model.getName());
		for(Pet pet : model.getFriends()){
			dto.addFriend(mapToDto(pet));
		}
		return dto;
	}
}
