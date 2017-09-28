package br.com.sempreautos.integradorSA.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import org.springframework.data.annotation.Transient;

@Entity
@Table(name="tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nome")
	@NotEmpty(message="Nome do usuário obrigatório.")
	private String nome;
	
	@Column(name="login")
	@NotEmpty(message="Login do usuário obrigatório.")
	private String login;
	
	@Column(name="senha")
	@NotEmpty(message="Senha do usuário obrigatória.")
	@Transient
	private String senha;

	@Column(name="ativo")
	private Integer ativo;
		
	@ManyToMany(cascade=CascadeType.REMOVE)
	@JoinTable(name="tb_perfis_usuario", joinColumns=@JoinColumn(name="id_usuario"), inverseJoinColumns=@JoinColumn(name="id_perfil"))
	private Set<Perfil> perfis;
	
	@ManyToMany(cascade=CascadeType.REMOVE, fetch=FetchType.EAGER)
	@JoinTable(name="tb_layouts_usuario", joinColumns=@JoinColumn(name="id_usuario"), inverseJoinColumns=@JoinColumn(name="id_layout_xml"))
	private Set<LayoutXML> layoutsXML;

	
	public Set<LayoutXML> getLayoutsXML() {
		return layoutsXML;
	}

	public void setLayoutsXML(Set<LayoutXML> layoutsXML) {
		this.layoutsXML = layoutsXML;
	}

	public Set<Perfil> getPerfis() {
		return perfis;
	}

	public void setPerfis(Set<Perfil> perfis) {
		this.perfis = perfis;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public Long getId() {
		return id;
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
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getAtivo() {
		return ativo;
	}

	public void isAtivo(Integer ativo) {
		this.ativo = ativo;
	}
	
	
}
