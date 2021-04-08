package tn.windata.converter;

import tn.windata.dto.TransactionDTO;
import tn.windata.gestibank.model.Transaction;

public class TransactionConverter {
	public static Transaction dtoToEntity(TransactionDTO transactionDTO) {
		Transaction transaction = new Transaction();
//		  client.setId(clientDto.getId());
//		  client.setIdentifiant(clientDto.getIdentifiant());
//		  client.setRevenusMens(clientDto.getRevenusMens());
//		  client.setPiecesJustif(clientDto.getPiecesJustif());
//		  client.setRole(clientDto.getRole());		  
//		  client.setComptes(clientDto.getComptes().stream().map(CompteConverter::dtoToEntity).collect(Collectors.toList()));
		return transaction;
	}

	public static TransactionDTO entityToDto(Transaction transaction) {
		TransactionDTO transactionDTO = new TransactionDTO();
//			 clientDto.setComptes(client.getComptes().stream().map(CompteConverter::entityToDto).collect(Collectors.toList()));
		return transactionDTO;
	}
}
