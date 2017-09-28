package br.com.sempreautos.integradorSA.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sempreautos.integradorSA.model.Perfil;
import br.com.sempreautos.integradorSA.model.Usuario;

public interface PerfilRepository extends JpaRepository<Perfil, Long>{
	public Perfil findByNome(String nome);
	
	public Set<Perfil> findByUsuarios(Usuario usuario);
}
