package tn.windata.gestibank.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.windata.gestibank.model.Client;
import tn.windata.gestibank.service.ClientService;

@RestController
@RequestMapping("/api")
public class ClientController {
	Logger logger = LogManager.getLogger(ClientController.class);
	
	@Autowired
	private ClientService clientService;

	@GetMapping("/clients")
	public ResponseEntity<List<Client>> getAllClients(@RequestParam(required = false) String role) {
		try {
			List<Client> clients = new ArrayList<Client>();

			if (role == null) {
				logger.warn("role non saisi!");
				clientService.findAll().forEach(clients::add);
			}
			else {
				logger.info("recherche selon le role ... ");
				clientService.findByRoleContaining(role).forEach(clients::add);
			}

			if (clients.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(clients, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/client/{id}/{newName}")
	public ResponseEntity<Client> modifyClient(@PathVariable Long id, @PathVariable String newName) {
		try {
			Client client = clientService.findOne(id);

			client.setNom(newName);
			clientService.persist(client);

			return new ResponseEntity<>(client, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
