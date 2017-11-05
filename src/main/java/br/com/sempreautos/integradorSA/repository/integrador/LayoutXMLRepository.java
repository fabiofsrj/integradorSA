package br.com.sempreautos.integradorSA.repository.integrador;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sempreautos.integradorSA.model.integrador.LayoutXML;
import br.com.sempreautos.integradorSA.model.integrador.Usuario;

@Repository
public interface LayoutXMLRepository extends JpaRepository<LayoutXML, Long> {
	
	public Set<LayoutXML> findByUsuarios(Usuario usuario);
}
