package tn.windata.gestibank.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.windata.dto.ConseillierDTO;
import tn.windata.dto.DemandesOuverturesDTO;

@RestController
@RequestMapping("/admin")
public class AdministrateurController {
	
	
	Logger logger = LogManager.getLogger(AdministrateurController.class);
	

	@PostMapping("/demandes")
	public ResponseEntity<List<DemandesOuverturesDTO>> createConseiller(){
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
	@DeleteMapping("/demandes")
	public ResponseEntity<List<DemandesOuverturesDTO>> supprimerConseiller(ConseillierDTO conseillerDto){
		logger.info("I'm in Admin Controller{}") ; 
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
	public ResponseEntity<List<DemandesOuverturesDTO>> reafectationClient() {
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

	public ResponseEntity<List<DemandesOuverturesDTO>> affectationDemandesOuvertures(
			DemandesOuverturesDTO demandesOuverturesDTO, ConseillierDTO conseillierDTO) {
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

}
