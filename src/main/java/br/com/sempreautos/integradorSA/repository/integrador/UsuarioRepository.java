package br.com.sempreautos.integradorSA.repository.integrador;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sempreautos.integradorSA.model.integrador.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findByLogin(String login);
	
}
