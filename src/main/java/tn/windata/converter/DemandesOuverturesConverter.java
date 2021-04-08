package tn.windata.converter;

import tn.windata.dto.ConseillierDTO;
import tn.windata.dto.DemandesOuverturesDTO;
import tn.windata.gestibank.model.Conseillier;
import tn.windata.gestibank.model.DemandesOuvertures;

public class DemandesOuverturesConverter {
	public static DemandesOuvertures dtoToEntity(DemandesOuverturesDTO demandesOuverturesDTO) {
		DemandesOuvertures demandesOuvertures = new DemandesOuvertures();
//		  client.setId(clientDto.getId());
//		  client.setIdentifiant(clientDto.getIdentifiant());
//		  client.setRevenusMens(clientDto.getRevenusMens());
//		  client.setPiecesJustif(clientDto.getPiecesJustif());
//		  client.setRole(clientDto.getRole());		  
//		  client.setComptes(clientDto.getComptes().stream().map(CompteConverter::dtoToEntity).collect(Collectors.toList()));
		return demandesOuvertures;
	}

	public static DemandesOuverturesDTO entityToDto(DemandesOuvertures demandesOuvertures) {
		DemandesOuverturesDTO demandesOuverturesDTO = new DemandesOuverturesDTO();
//			 clientDto.setComptes(client.getComptes().stream().map(CompteConverter::entityToDto).collect(Collectors.toList()));
		return demandesOuverturesDTO;
	}
}
