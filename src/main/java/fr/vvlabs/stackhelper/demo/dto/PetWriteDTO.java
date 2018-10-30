package fr.vvlabs.stackhelper.demo.dto;

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
public class PetWriteDTO extends AbstractDto<Integer> {
	
	private static final long serialVersionUID = 7024460882422573494L;
	
	private String name;
	private List<Integer> friendsIds;
}
