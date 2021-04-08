package tn.windata.gestibank.service;

import java.util.List;

import tn.windata.dto.CompteDTO;

public interface IcompteService {
	 List <CompteDTO> getAllComptes();
	 void createCompte(CompteDTO compteDTO);


}
