package br.com.sempreautos.integradorSA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sempreautos.integradorSA.model.integrador.Importacao;
import br.com.sempreautos.integradorSA.repository.integrador.ImportacaoRepository;

@Service
public class ImportacaoService {

	   @Autowired
	   private ImportacaoRepository repository;
	    
	   public List<Importacao> findAll() {
	       return repository.findAll();
	   }
	    
	   public Importacao findOne(Long id) {
	       return repository.findOne(id);
	   }
	    
	   public Importacao save(Importacao importacao) {
	       return repository.saveAndFlush(importacao);
	   }
	    
	   public void delete(Long id) {
	       repository.delete(id);
	   }	
	
}
