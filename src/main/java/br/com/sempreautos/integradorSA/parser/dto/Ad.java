package br.com.sempreautos.integradorSA.parser.dto;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Ad {

	@XmlElement(name="ID")
	private int idCliente;
	
	@XmlElement(name="DATE")
	private Date dataAnuncio; 
	
	@XmlElement(name="TITLE")
	private String titulo;
	
	@XmlElement(name="CATEGORY")
	private String categoria;
	
	@XmlElement(name="DESCRIPTION")
	private String descricao;
	
	@XmlElement(name="ACCESSORIES")
	private String acessorios;
	
	@XmlElement(name="YEAR")
	private Integer ano;

	@XmlElement(name="FABRIC_YEAR")
	private Integer anoFabricacao;

	@XmlElement(name="CONDITION")
	private String condicao;

	@XmlElement(name="MILEAGE")
	private Integer kmRodado;

	@XmlElement(name="GEAR")
	private String cambio;

	@XmlElement(name="PLATE")
	private String motor;

	@XmlElement(name="DOORS")
	private Integer qtdPortas;

	@XmlElement(name="COLOR")
	private String cor;

	@XmlElement(name="PRICE")
	private BigInteger preco;

	@XmlElement(name="SELLER")
	private BigInteger vendedor;

	@XmlElement(name="PHONE")
	private String telefone;

	@XmlElement(name="LOCATION_COUNTR")
	private String paisLocalizacao;

	@XmlElement(name="LOCATION_STATE")
	private String ufLocalizacao;

	@XmlElement(name="LOCATION_CITY")
	private String cidadeLocalizacao;

	@XmlElement(name="ZIP_CODE")
	private String cep;

	@XmlElement(name="NEIGHBORHOOD")
	private String referencia;

	@XmlElement(name="IMAGE_URL", type=String.class)
	private List<String> imagens;

	@XmlElement(name="VIDEO")
	private String video;
	
}
