package fr.vvlabs.stackhelper.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import fr.vvlabs.stackhelper.controller.AbstractRestController;
import fr.vvlabs.stackhelper.demo.dto.PetDTO;
import fr.vvlabs.stackhelper.demo.dto.PetWriteDTO;
import fr.vvlabs.stackhelper.demo.model.Pet;
import fr.vvlabs.stackhelper.demo.service.PetService;

@RestController
@RequestMapping("/pets")
//@Api
public class PetController extends AbstractRestController<Pet, Integer, PetDTO, PetWriteDTO> {
	// crud endpoints are already defined !
	// add only new services

	@GetMapping(value = "pets/filter/{id}", params = "fields")
    public ResponseEntity<MappingJacksonValue> getUser(@PathVariable("id") Integer id,
                                                       @RequestParam("fields") String fields) {
        
		PetDTO myPet = service.findById(id);
        MappingJacksonValue wrapper = new MappingJacksonValue(myPet);
        
        wrapper.setFilters(new SimpleFilterProvider()
                                   .addFilter("petFilter",
                                              SimpleBeanPropertyFilter.filterOutAllExcept(fields.split(","))));
        return ResponseEntity.ok(wrapper);
    }
}