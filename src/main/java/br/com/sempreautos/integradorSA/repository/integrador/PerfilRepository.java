package br.com.sempreautos.integradorSA.repository.integrador;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sempreautos.integradorSA.model.integrador.Perfil;
import br.com.sempreautos.integradorSA.model.integrador.Usuario;

public interface PerfilRepository extends JpaRepository<Perfil, Long>{
	public Perfil findByNome(String nome);
	
	public Set<Perfil> findByUsuarios(Usuario usuario);
}
