package tn.windata.converter;

import tn.windata.dto.NotificationDTO;
import tn.windata.gestibank.model.Notification;

public class NotificationConverter {
	public static Notification dtoToEntity(NotificationDTO notificationDTO) {
		Notification notification = new Notification();
//		  client.setId(clientDto.getId());
//		  client.setIdentifiant(clientDto.getIdentifiant());
//		  client.setRevenusMens(clientDto.getRevenusMens());
//		  client.setPiecesJustif(clientDto.getPiecesJustif());
//		  client.setRole(clientDto.getRole());		  
//		  client.setComptes(clientDto.getComptes().stream().map(CompteConverter::dtoToEntity).collect(Collectors.toList()));
		return notification;
	}

	public static NotificationDTO entityToDto(Notification notification) {
		NotificationDTO notificationDTO = new NotificationDTO();
//			 clientDto.setComptes(client.getComptes().stream().map(CompteConverter::entityToDto).collect(Collectors.toList()));
		return notificationDTO;
	}
}
