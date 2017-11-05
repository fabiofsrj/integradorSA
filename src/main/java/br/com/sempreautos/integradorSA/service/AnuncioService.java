package br.com.sempreautos.integradorSA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.sempreautos.integradorSA.model.portal.Anuncio;
import br.com.sempreautos.integradorSA.repository.portal.AnuncioRepository;

@Service
public class AnuncioService {

	@Autowired
	AnuncioRepository anuncioRepository;
	
	@Transactional("portalTransactionManager")
	public Anuncio salvar(Anuncio anuncio){
		
		anuncioRepository.save(anuncio);
		return anuncio;
	}
	
}
