package fr.vvlabs.stackhelper.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.vvlabs.stackhelper.demo.model.Pet;

@Repository
public interface PetDao extends JpaRepository<Pet, Integer> {

	/**
	 * Find by name.
	 *
	 * @param name the name
	 * @return the pet
	 */
	public Pet findByName(String name);
}
