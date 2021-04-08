package tn.windata.converter;

import java.util.stream.Collectors;

import tn.windata.dto.ClientDTO;
import tn.windata.gestibank.model.Client;

public class ClientConvertisseur {
	public static Client dtoToEntity(ClientDTO clientDto) {
		Client client = new Client();
		client.setId(clientDto.getId());
		client.setIdentifiant(clientDto.getIdentifiant());
		client.setRevenusMens(clientDto.getRevenusMens());
		client.setPiecesJustif(clientDto.getPiecesJustif());
		client.setRole(clientDto.getRole());
		client.setComptes(
				clientDto.getComptes().stream().map(CompteConverter::dtoToEntity).collect(Collectors.toList()));
		return client;
	}

	public static ClientDTO entityToDto(Client client) {
		ClientDTO clientDto = new ClientDTO();
		clientDto.setComptes(
				client.getComptes().stream().map(CompteConverter::entityToDto).collect(Collectors.toList()));
		return clientDto;
	}
}
