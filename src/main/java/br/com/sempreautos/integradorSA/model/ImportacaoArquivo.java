package br.com.sempreautos.integradorSA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_importacao_arquivo")
public class ImportacaoArquivo {
	
	@Id
	@GeneratedValue()
	private Long id;
	
	@Column(name="arquivo")
	private String arquivo;

}
