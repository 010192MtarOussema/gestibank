package tn.windata.gestibank.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.windata.dto.ConseillierDTO;
import tn.windata.dto.DemandesOuverturesDTO;

@RestController
@RequestMapping("/conseiller")
public class ConseillerController {
	Logger logger = LogManager.getLogger(AdministrateurController.class);

	@GetMapping("/listes-conseillers")
	public ResponseEntity<List<ConseillierDTO>> getAllConseilliers() {
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

	@GetMapping("/demandes")
	public ResponseEntity<List<DemandesOuverturesDTO>> getAllDemandes() {
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

	
}
