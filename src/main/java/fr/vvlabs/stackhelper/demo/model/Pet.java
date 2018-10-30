package fr.vvlabs.stackhelper.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import fr.vvlabs.stackhelper.model.AbstractModelGenereatedId;
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
public class Pet extends AbstractModelGenereatedId<Integer> {

	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "pet_friends", joinColumns = @JoinColumn(name = "pet_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "friend_id", referencedColumnName = "id"))
	private List<Pet> friends;
}
