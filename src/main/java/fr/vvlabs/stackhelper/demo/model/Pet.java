package fr.vvlabs.stackhelper.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import fr.vvlabs.stackhelper.model.AbstractModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString
public class Pet extends AbstractModel<Integer> {

	// ===========================================================
	// Fields
	// ===========================================================

	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "pet_friends", joinColumns = @JoinColumn(name = "pet_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "friend_id", referencedColumnName = "id"))
	private List<Pet> friends;
	
	// ===========================================================
	// Methods
	// ===========================================================
	
	/**
	 * Adds the friend.
	 *
	 * @param friend the friend
	 */
	public void addFriend(Pet friend) {
		if(friends == null) {
			friends = new ArrayList<>();
		}
		friends.add(friend);
	}
	
	/**
	 * Removes the friend.
	 *
	 * @param friend the friend
	 */
	public void removeFriend(Pet friend) {
		if(friends == null) {
			friends = new ArrayList<>();
		}
		friends.remove(friend);
	}
}
