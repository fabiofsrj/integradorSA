package br.com.sempreautos.integradorSA.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.sempreautos.integradorSA.model.integrador.Perfil;
import br.com.sempreautos.integradorSA.model.integrador.Usuario;
import br.com.sempreautos.integradorSA.repository.integrador.PerfilRepository;
import br.com.sempreautos.integradorSA.repository.integrador.UsuarioRepository;

@Service
public class UsuarioService {
    
   @Autowired
   private UsuarioRepository usuarioRepository;
    
   @Autowired
   private PerfilRepository perfilReposiroty;
   
   @Autowired
   private BCryptPasswordEncoder bCryptPasswordEncoder;
   
   public List<Usuario> findAll() {
       return usuarioRepository.findAll();
   }
    
   public Usuario findOne(Long id) {
       return usuarioRepository.findOne(id);
   }
    
   public Usuario save(Usuario usuario) {
	   usuario.setSenha(bCryptPasswordEncoder.encode(usuario.getSenha()));
	   
	   if (usuario.getId().equals(null)) {
		   usuario.setAtivo(1);
		   Perfil perfilUsuario = perfilReposiroty.findByNome("ROLE_USER");
		   usuario.setPerfis(new HashSet<Perfil>(Arrays.asList(perfilUsuario)));
	   } else {
		   usuario.setPerfis(perfilReposiroty.findByUsuarios(usuario));
	   }

	   return usuarioRepository.saveAndFlush(usuario);
   }
    
   public void delete(Long id) {
       usuarioRepository.delete(id);
   }
   
   public Usuario findUsuarioByLogin(String login) {
	   return usuarioRepository.findByLogin(login);
   }
   
   public Usuario getUsuarioAutenticado() {
	   
	   final Authentication auth = SecurityContextHolder.getContext().getAuthentication();

	   if (auth != null && auth.isAuthenticated() && !(auth instanceof AnonymousAuthenticationToken)) {
	    	return usuarioRepository.findByLogin(auth.getName());
	   }
	   
	   return null;
   }

}
