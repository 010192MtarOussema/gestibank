package tn.windata.converter;


import tn.windata.dto.CompteDTO;
import tn.windata.gestibank.model.Compte;

public class CompteConverter {
	public static Compte dtoToEntity(CompteDTO compteDto) {
		  Compte compte = new Compte();
		  compte.setId(compteDto.getId());
		  compte.setNumeroDeCompte(compteDto.getNumeroDeCompte());
		  compte.setRib(compte.getRib());
		  compte.setSolde(compteDto.getSolde());
		  compte.setDecouvert(compteDto.getDecouvert());
		  compte.setMontantAgios(compteDto.getMontantAgios());
		  compte.setMontantRenumeration(compteDto.getMontantRenumeration());
		  
		  return compte;
		 }

		 public static CompteDTO entityToDto(Compte compte) {
			  return new CompteDTO(compte.getId(), compte.getNumeroDeCompte(),
					  compte.getRib(),compte.getSolde(),compte.getDecouvert(),compte.getMontantAgios(),
					  compte.getMontantRenumeration());

		 }
}
