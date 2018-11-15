package fr.vvlabs.stackhelper.demo.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import fr.vvlabs.stackhelper.demo.dto.PetDTO;
import fr.vvlabs.stackhelper.demo.model.Pet;
import fr.vvlabs.stackhelper.mapper.AbstractMapper;

@Component
public class PetMapperImpl implements AbstractMapper<Pet, Integer, PetDTO> {

	@Override
	public PetDTO mapToDto(Pet model){
		
		List<String> friends = model.getFriends().stream().map(Pet::getName).collect(Collectors.toList());
		
		PetDTO dto = new PetDTO();
		dto.setId(model.getId());
		dto.setName(model.getName());
		dto.setAge(model.getAge());
		dto.setMale(model.isMale());
		dto.setFriends(friends);
		return dto;
	}
}
