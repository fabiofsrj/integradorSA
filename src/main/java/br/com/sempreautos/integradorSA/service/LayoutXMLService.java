package br.com.sempreautos.integradorSA.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sempreautos.integradorSA.model.integrador.LayoutXML;
import br.com.sempreautos.integradorSA.model.integrador.Usuario;
import br.com.sempreautos.integradorSA.repository.integrador.LayoutXMLRepository;


@Service
public class LayoutXMLService {

	   @Autowired
	   private LayoutXMLRepository repository;
	    
	   public List<LayoutXML> findAll() {
	       return repository.findAll();
	   }
	    
	   public LayoutXML findOne(Long id) {
	       return repository.findOne(id);
	   }
	    
	   public LayoutXML save(LayoutXML importacao) {
	       return repository.saveAndFlush(importacao);
	   }
	    
	   public void delete(Long id) {
	       repository.delete(id);
	   }

	public Set<LayoutXML> findByUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return repository.findByUsuarios(usuario);
	}	
	
}
