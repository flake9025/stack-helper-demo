package fr.vvlabs.stackhelper.demo.dto;

import java.util.List;

import fr.vvlabs.stackhelper.dto.AbstractDto;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=true)
@ToString
public class PetDTO extends AbstractDto<Integer> {
	
	private static final long serialVersionUID = -485360954338618283L;

	// ===========================================================
	// Constructors
	// ===========================================================
	
	@Builder
	private PetDTO(Integer id){
		super(id);
	}
	 
	// ===========================================================
	// Fields
	// ===========================================================

	private String name;
	private int age;
	private boolean male;
	@Singular
	private List<String> friends;
}