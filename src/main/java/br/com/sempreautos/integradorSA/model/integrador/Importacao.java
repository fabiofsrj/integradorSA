package br.com.sempreautos.integradorSA.model.integrador;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.sempreautos.integradorSA.model.converter.LocalDateTimeConverter;

@Entity
@Table(name="tb_importacao", schema="integradorSA")
public class Importacao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3812028070748377475L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="data_hora_importacao")
	@Convert(converter=LocalDateTimeConverter.class)
	private LocalDateTime dataHora;
	
	@Column(name="nome_arquivo")
	private String nomeArquivo;
	
	@ManyToOne
	@JoinColumn(name="id_layout_xml")
	private LayoutXML layoutArquivo; 
	
	@Column(name="resultado")
	private int resultado;
	
	@Column(name="mensagem_resultado", length=1000)
	private String mensagemResultado;
	
	@OneToOne(fetch=FetchType.LAZY, optional=true, cascade=CascadeType.ALL)
	@JoinColumn(name="id_arquivo")
	private ImportacaoArquivo arquivo; 
	
	public ImportacaoArquivo getArquivo() {
		return arquivo;
	}
	public void setArquivo(ImportacaoArquivo arquivo) {
		this.arquivo = arquivo;
	}

	public String getMensagemResultado() {
		return mensagemResultado;
	}
	public void setMensagemResultado(String mensagemResultado) {
		this.mensagemResultado = mensagemResultado;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	public LayoutXML getLayoutArquivo() {
		return layoutArquivo;
	}
	public void setLayoutArquivo(LayoutXML layoutArquivo) {
		this.layoutArquivo = layoutArquivo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
}
