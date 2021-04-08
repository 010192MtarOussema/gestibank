package tn.windata.converter;

import tn.windata.dto.ConseillierDTO;
import tn.windata.gestibank.model.Conseillier;

public class ConseillierConverter {
	public static Conseillier dtoToEntity(ConseillierDTO conseillierDTO) {
		Conseillier conseillier = new Conseillier();
//		  client.setId(clientDto.getId());
//		  client.setIdentifiant(clientDto.getIdentifiant());
//		  client.setRevenusMens(clientDto.getRevenusMens());
//		  client.setPiecesJustif(clientDto.getPiecesJustif());
//		  client.setRole(clientDto.getRole());		  
//		  client.setComptes(clientDto.getComptes().stream().map(CompteConverter::dtoToEntity).collect(Collectors.toList()));
		return conseillier;
	}

	public static ConseillierDTO entityToDto(Conseillier conseillier) {
		ConseillierDTO conseillierDTO = new ConseillierDTO();
//			 clientDto.setComptes(client.getComptes().stream().map(CompteConverter::entityToDto).collect(Collectors.toList()));
		return conseillierDTO;
	}
}
