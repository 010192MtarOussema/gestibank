package tn.windata.converter;

import tn.windata.dto.ClientPotentielDTO;
import tn.windata.gestibank.model.ClientPotentiel;

public class ClientPotentielConverter {
	public static ClientPotentiel dtoToEntity(ClientPotentielDTO clientPotentielDto) {
		ClientPotentiel clientPotentiel = new ClientPotentiel();
//		  client.setId(administrateurDto.getId());
//		  client.setIdentifiant(administrateurDto.getIdentifiant());
//		  client.setRevenusMens(administrateurDto.getRevenusMens());
//		  client.setPiecesJustif(administrateurDto.getPiecesJustif());
//		  client.setRole(administrateurDto.getRole());		  
//		  client.setComptes(administrateurDto.getComptes().stream().map(CompteConverter::dtoToEntity).collect(Collectors.toList()));
		return clientPotentiel;
	}

	public static ClientPotentielDTO entityToDto(ClientPotentiel clientPotentiel) {
		ClientPotentielDTO clientPotentielDTO = new ClientPotentielDTO();
//			 administrateurDTO.setComptes(administrateur.getConseilliers().stream().map(CompteConverter::entityToDto).collect(Collectors.toList()));
		return clientPotentielDTO;
	}
}
