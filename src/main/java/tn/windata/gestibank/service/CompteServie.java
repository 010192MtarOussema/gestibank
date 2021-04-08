package tn.windata.gestibank.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.windata.converter.CompteConverter;
import tn.windata.dto.CompteDTO;
import tn.windata.gestibank.repository.CompteRepository;
@Service
public class CompteServie implements IcompteService {

	@Autowired
	CompteRepository compteService ; 
	

	@Override
	public List<CompteDTO> getAllComptes() {
		// TODO Auto-generated method stub
		return  compteService.findAll().stream().map(CompteConverter::entityToDto).collect(Collectors.toList());
	}
	@Override
	public void createCompte(CompteDTO compteDTO) {
		compteService.save(CompteConverter.dtoToEntity(compteDTO));
	}

}
