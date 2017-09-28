package br.com.sempreautos.integradorSA.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="tb_perfil")
public class Perfil {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nome")
	@NotEmpty(message="Informe o nome do perfil.")
	private String nome;

	@ManyToMany(mappedBy="perfis")
	private Set<Usuario> usuarios;	
	
	public Long getId() {
		return id;
	}

	public Set<Usuario> getUsuario() {
		return usuarios;
	}

	public void setUsuario(Set<Usuario> usuario) {
		this.usuarios = usuario;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
