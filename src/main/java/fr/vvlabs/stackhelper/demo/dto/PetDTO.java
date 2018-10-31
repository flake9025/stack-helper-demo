package fr.vvlabs.stackhelper.demo.dto;

import java.util.ArrayList;
import java.util.List;

import fr.vvlabs.stackhelper.dto.AbstractDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper=true)
@ToString
public class PetDTO extends AbstractDto<Integer> {
	
	private static final long serialVersionUID = -485360954338618283L;

	// ===========================================================
	// Fields
	// ===========================================================

	private String name;
	private List<PetDTO> friends;
	
	// ===========================================================
	// Methods
	// ===========================================================
	
	/**
	 * Adds the friend.
	 *
	 * @param friend the friend
	 */
	public void addFriend(PetDTO friend) {
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
	public void removeFriend(PetDTO friend) {
		if(friends == null) {
			friends = new ArrayList<>();
		}
		friends.remove(friend);
	}
}