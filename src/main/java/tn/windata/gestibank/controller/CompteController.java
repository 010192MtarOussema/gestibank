package tn.windata.gestibank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.windata.dto.CompteDTO;
import tn.windata.gestibank.service.CompteServie;

@RestController
@RequestMapping("/getCompte")
public class CompteController {

	@Autowired
	CompteServie compteServie;

	@GetMapping("/comptes")
	public ResponseEntity<List<CompteDTO>> getAllComptes() {
		return new ResponseEntity<>(compteServie.getAllUsers(), HttpStatus.OK);
	}

}
