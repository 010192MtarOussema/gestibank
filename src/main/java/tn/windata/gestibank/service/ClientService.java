package tn.windata.gestibank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.windata.gestibank.model.Client;
import tn.windata.gestibank.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;

	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	public Iterable<Client> findByRoleContaining(String role) {
		return clientRepository.findByRoleContaining(role);
	}

	public Client findOne(Long id) {
		return clientRepository.findById(id).get();
	}

	public void persist(Client client) {
		clientRepository.saveAndFlush(client);
	}
}
