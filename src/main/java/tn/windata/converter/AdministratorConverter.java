package tn.windata.converter;

import java.util.stream.Collectors;

import tn.windata.dto.AdministrateurDTO;
import tn.windata.gestibank.model.Administrateur;

public class AdministratorConverter {
	public static Administrateur dtoToEntity(AdministrateurDTO administrateurDto) {
		Administrateur client = new Administrateur();
//		  client.setId(administrateurDto.getId());
//		  client.setIdentifiant(administrateurDto.getIdentifiant());
//		  client.setRevenusMens(administrateurDto.getRevenusMens());
//		  client.setPiecesJustif(administrateurDto.getPiecesJustif());
//		  client.setRole(administrateurDto.getRole());		  
//		  client.setComptes(administrateurDto.getComptes().stream().map(CompteConverter::dtoToEntity).collect(Collectors.toList()));
		return client;
	}

	public static AdministrateurDTO entityToDto(Administrateur administrateur) {
		AdministrateurDTO administrateurDTO = new AdministrateurDTO();
//			 administrateurDTO.setComptes(administrateur.getConseilliers().stream().map(CompteConverter::entityToDto).collect(Collectors.toList()));
		return administrateurDTO;
	}
}
