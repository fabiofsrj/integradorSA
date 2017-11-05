package br.com.sempreautos.integradorSA.model.portal;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Converter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.sempreautos.integradorSA.model.converter.LocalDateConverter;
import br.com.sempreautos.integradorSA.model.converter.LocalDateTimeConverter;

@Entity
@Table(name="team", schema="tecniz")
public class Anuncio {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="user_id")
	private Integer idUsuario;
	
	@Column(name="user_type")
	private String tipoUsuario;
	
	@Column(name="title")
	private String tituloAnuncio;
	
	@Column(name="summary", columnDefinition="TEXT")
	private String resumoAnuncio;
	
	@Column(name="city_id")
	private Integer idCidadeAnuncio;
	
	@Column(name="group_id")
	private Integer idGrupoAnuncio;
	
	@Column(name="partner_id")
	private Integer idParceiroAnunciante;
	
	@Column(name="system", columnDefinition="enum('Y','N')")
	private String system;
	
	@Column(name="team_price")
	private Double valor;
	
	@Column(name="image")
	private String urlImagemPrincipal;
	
	@Column(name="image1")
	private String urlImagem1;
	
	@Column(name="image2")
	private String urlImagem2;
	
	@Column(name="team_type")
	private String tipoAviso;
	
	@Column(name="sort_order")
	private Integer ordem;
	
	@Column(name="expire_time")
	private Integer prazoExpiracao;
	
	@Column(name="begin_time")
	private Integer prazoInicio;
	
	@Column(name="end_time")
	private Integer prazoTermino;
	
	@Column(name="reach_time")
	private Integer prazoAlcance;
	
	@Column(name="gal_image1")
	private String imagemGaleria1;
	
	@Column(name="gal_image2")
	private String imagemGaleria2;
	
	@Column(name="gal_image3")
	private String imagemGaleria3;
	
	@Column(name="mostrarpreco")
	private String mostrarPreco;
	
	@Column(name="visualizados")
	private Integer qtdVisualiacoes;
	
	@Column(name="create_time")
	@Convert(converter=LocalDateConverter.class)
	private LocalDate dataCriacao;
	
	@Column(name="mostrarseguranca")
	private String mostrarSeguranca;
	
	@Column(name="clicados")
	private Integer qtdCliques;
	
	@Column(name="status")
	private Integer status;
	
	@Column(name="pago")
	private String pago;
	
	@Column(name="anunciogratis", columnDefinition="CHAR(10)")
	private String anuncioGratis;
	
	@Column(name="car_tipo")
	private String tipoCarro;
	
	@Column(name="car_fabricante")
	private String fabricanteCarro;
	
	@Column(name="car_modelo")
	private String carroModelo;
	
	@Column(name="car_ano")
	private Integer anoCarro;
	
	@Column(name="car_carroceria")
	private String carroceriaCarro;
	
	@Column(name="moto_estilo")
	private String estiloMoto;
	
	@Column(name="car_preco")
	private Double precoCarro;
	
	@Column(name="km")
	private String kmRodado;
	
	@Column(name="numero_portas")
	private String numeroPortas;
	
	@Column(name="cor")
	private String corCarro;
	
	@Column(name="combustivel")
	private String combustivelCarro;
	
	@Column(name="motor")
	private String motorCarro;
	
	@Column(name="transmissao")
	private String transmissaoCarro;
	
	@Column(name="cilindros")
	private String qtdCilindradas;
	
	@Column(name="tracao")
	private String tipoTracao;
	
	@Column(name="vea_caracter", columnDefinition="TEXT")
	private String veaCaracter;
	
	@Column(name="estadoVeiculo")
	private String estadoVeiculo;
	
	@Column(name="modelo_ano")
	private Integer modeloAno;
	
	@Column(name="uf")
	private String ufVeiculo;
	
	@Column(name="ehvitrine")
	private String vitrine;
	
	@Column(name="imgdestaque")
	private String imagemDestaque;
	
	@Column(name="usou_bonus")
	private String usouBonus;
	
	@Column(name="avisa")
	private String avisa;
	
	@Column(name="admineditou", columnDefinition="CHAR(1)")
	private String ineditado;
	
	@Column(name="partner_plano_id")
	private Integer planoParceitoAnunciante;
	
	@Column(name="desativado")
	private String desativado;
	
	@Column(name="contador")
	private Integer contador;
	
	@Column(name="renavam")
	private String renavam;
	
	@Column(name="ehdestaquebusca")
	private Integer destaqueBusca;
	
	@Column(name="placa")
	private String placaVeiculo;
	
	@Column(name="gal_image4")
	private String imagemGaleria4;
	
	@Column(name="gal_image5")
	private String imagemGaleria5;
	
	@Column(name="gal_image6")
	private String imagemGaleria6;
	
	@Column(name="gal_image9")
	private String imagemGaleria9;

	@Column(name="gal_image10")
	private String imagemGaleria10;

	@Column(name="video1")
	private String video1;

	@Column(name="video2")
	private String video2;
	
	@Column(name="promooutros", columnDefinition="TEXT")
	private String promoOutros;
	
	@Column(name="vea_promocoes", columnDefinition="TEXT")
	private String veaPromocoes;
	
	@Column(name="vea_necessidades", columnDefinition="TEXT")
	private String veaNecessidades;
	
	@Column(name="precorevendas")
	private Double precoRevenda;
	
	@Column(name="temprecoespecial", columnDefinition="CHAR(1)")
	private String temPrecoEspecial;
	
	@Column(name="gal_image7")
	private String imagemGaleria7;
	
	@Column(name="status_republicacao")
	private Integer statusRepublicacao;

	@Column(name="excluido")
	private Integer excluido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getTituloAnuncio() {
		return tituloAnuncio;
	}

	public void setTituloAnuncio(String tituloAnuncio) {
		this.tituloAnuncio = tituloAnuncio;
	}

	public String getResumoAnuncio() {
		return resumoAnuncio;
	}

	public void setResumoAnuncio(String resumoAnuncio) {
		this.resumoAnuncio = resumoAnuncio;
	}

	public Integer getIdCidadeAnuncio() {
		return idCidadeAnuncio;
	}

	public void setIdCidadeAnuncio(Integer idCidadeAnuncio) {
		this.idCidadeAnuncio = idCidadeAnuncio;
	}

	public Integer getIdGrupoAnuncio() {
		return idGrupoAnuncio;
	}

	public void setIdGrupoAnuncio(Integer idGrupoAnuncio) {
		this.idGrupoAnuncio = idGrupoAnuncio;
	}

	public Integer getIdParceiroAnunciante() {
		return idParceiroAnunciante;
	}

	public void setIdParceiroAnunciante(Integer idParceiroAnunciante) {
		this.idParceiroAnunciante = idParceiroAnunciante;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getUrlImagemPrincipal() {
		return urlImagemPrincipal;
	}

	public void setUrlImagemPrincipal(String urlImagemPrincipal) {
		this.urlImagemPrincipal = urlImagemPrincipal;
	}

	public String getUrlImagem1() {
		return urlImagem1;
	}

	public void setUrlImagem1(String urlImagem1) {
		this.urlImagem1 = urlImagem1;
	}

	public String getUrlImagem2() {
		return urlImagem2;
	}

	public void setUrlImagem2(String urlImagem2) {
		this.urlImagem2 = urlImagem2;
	}

	public String getTipoAviso() {
		return tipoAviso;
	}

	public void setTipoAviso(String tipoAviso) {
		this.tipoAviso = tipoAviso;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	public Integer getPrazoExpiracao() {
		return prazoExpiracao;
	}

	public void setPrazoExpiracao(Integer prazoExpiracao) {
		this.prazoExpiracao = prazoExpiracao;
	}

	public Integer getPrazoInicio() {
		return prazoInicio;
	}

	public void setPrazoInicio(Integer prazoInicio) {
		this.prazoInicio = prazoInicio;
	}

	public Integer getPrazoTermino() {
		return prazoTermino;
	}

	public void setPrazoTermino(Integer prazoTermino) {
		this.prazoTermino = prazoTermino;
	}

	public Integer getPrazoAlcance() {
		return prazoAlcance;
	}

	public void setPrazoAlcance(Integer prazoAlcance) {
		this.prazoAlcance = prazoAlcance;
	}

	public String getImagemGaleria1() {
		return imagemGaleria1;
	}

	public void setImagemGaleria1(String imagemGaleria1) {
		this.imagemGaleria1 = imagemGaleria1;
	}

	public String getImagemGaleria2() {
		return imagemGaleria2;
	}

	public void setImagemGaleria2(String imagemGaleria2) {
		this.imagemGaleria2 = imagemGaleria2;
	}

	public String getImagemGaleria3() {
		return imagemGaleria3;
	}

	public void setImagemGaleria3(String imagemGaleria3) {
		this.imagemGaleria3 = imagemGaleria3;
	}

	public String getMostrarPreco() {
		return mostrarPreco;
	}

	public void setMostrarPreco(String mostrarPreco) {
		this.mostrarPreco = mostrarPreco;
	}

	public Integer getQtdVisualiacoes() {
		return qtdVisualiacoes;
	}

	public void setQtdVisualiacoes(Integer qtdVisualiacoes) {
		this.qtdVisualiacoes = qtdVisualiacoes;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getMostrarSeguranca() {
		return mostrarSeguranca;
	}

	public void setMostrarSeguranca(String mostrarSeguranca) {
		this.mostrarSeguranca = mostrarSeguranca;
	}

	public Integer getQtdCliques() {
		return qtdCliques;
	}

	public void setQtdCliques(Integer qtdCliques) {
		this.qtdCliques = qtdCliques;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPago() {
		return pago;
	}

	public void setPago(String pago) {
		this.pago = pago;
	}

	public String getAnuncioGratis() {
		return anuncioGratis;
	}

	public void setAnuncioGratis(String anuncioGratis) {
		this.anuncioGratis = anuncioGratis;
	}

	public String getTipoCarro() {
		return tipoCarro;
	}

	public void setTipoCarro(String tipoCarro) {
		this.tipoCarro = tipoCarro;
	}

	public String getFabricanteCarro() {
		return fabricanteCarro;
	}

	public void setFabricanteCarro(String fabricanteCarro) {
		this.fabricanteCarro = fabricanteCarro;
	}

	public String getCarroModelo() {
		return carroModelo;
	}

	public void setCarroModelo(String carroModelo) {
		this.carroModelo = carroModelo;
	}

	public Integer getAnoCarro() {
		return anoCarro;
	}

	public void setAnoCarro(Integer anoCarro) {
		this.anoCarro = anoCarro;
	}

	public String getCarroceriaCarro() {
		return carroceriaCarro;
	}

	public void setCarroceriaCarro(String carroceriaCarro) {
		this.carroceriaCarro = carroceriaCarro;
	}

	public String getEstiloMoto() {
		return estiloMoto;
	}

	public void setEstiloMoto(String estiloMoto) {
		this.estiloMoto = estiloMoto;
	}

	public Double getPrecoCarro() {
		return precoCarro;
	}

	public void setPrecoCarro(Double precoCarro) {
		this.precoCarro = precoCarro;
	}

	public String getKmRodado() {
		return kmRodado;
	}

	public void setKmRodado(String kmRodado) {
		this.kmRodado = kmRodado;
	}

	public String getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(String numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public String getCorCarro() {
		return corCarro;
	}

	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}

	public String getCombustivelCarro() {
		return combustivelCarro;
	}

	public void setCombustivelCarro(String combustivelCarro) {
		this.combustivelCarro = combustivelCarro;
	}

	public String getMotorCarro() {
		return motorCarro;
	}

	public void setMotorCarro(String motorCarro) {
		this.motorCarro = motorCarro;
	}

	public String getTransmissaoCarro() {
		return transmissaoCarro;
	}

	public void setTransmissaoCarro(String transmissaoCarro) {
		this.transmissaoCarro = transmissaoCarro;
	}

	public String getQtdCilindradas() {
		return qtdCilindradas;
	}

	public void setQtdCilindradas(String qtdCilindradas) {
		this.qtdCilindradas = qtdCilindradas;
	}

	public String getTipoTracao() {
		return tipoTracao;
	}

	public void setTipoTracao(String tipoTracao) {
		this.tipoTracao = tipoTracao;
	}

	public String getVeaCaracter() {
		return veaCaracter;
	}

	public void setVeaCaracter(String veaCaracter) {
		this.veaCaracter = veaCaracter;
	}

	public String getEstadoVeiculo() {
		return estadoVeiculo;
	}

	public void setEstadoVeiculo(String estadoVeiculo) {
		this.estadoVeiculo = estadoVeiculo;
	}

	public Integer getModeloAno() {
		return modeloAno;
	}

	public void setModeloAno(Integer modeloAno) {
		this.modeloAno = modeloAno;
	}

	public String getUfVeiculo() {
		return ufVeiculo;
	}

	public void setUfVeiculo(String ufVeiculo) {
		this.ufVeiculo = ufVeiculo;
	}

	public String getVitrine() {
		return vitrine;
	}

	public void setVitrine(String vitrine) {
		this.vitrine = vitrine;
	}

	public String getImagemDestaque() {
		return imagemDestaque;
	}

	public void setImagemDestaque(String imagemDestaque) {
		this.imagemDestaque = imagemDestaque;
	}

	public String getUsouBonus() {
		return usouBonus;
	}

	public void setUsouBonus(String usouBonus) {
		this.usouBonus = usouBonus;
	}

	public String getAvisa() {
		return avisa;
	}

	public void setAvisa(String avisa) {
		this.avisa = avisa;
	}

	public String getIneditado() {
		return ineditado;
	}

	public void setIneditado(String ineditado) {
		this.ineditado = ineditado;
	}

	public Integer getPlanoParceitoAnunciante() {
		return planoParceitoAnunciante;
	}

	public void setPlanoParceitoAnunciante(Integer planoParceitoAnunciante) {
		this.planoParceitoAnunciante = planoParceitoAnunciante;
	}

	public String getDesativado() {
		return desativado;
	}

	public void setDesativado(String desativado) {
		this.desativado = desativado;
	}

	public Integer getContador() {
		return contador;
	}

	public void setContador(Integer contador) {
		this.contador = contador;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public Integer getDestaqueBusca() {
		return destaqueBusca;
	}

	public void setDestaqueBusca(Integer destaqueBusca) {
		this.destaqueBusca = destaqueBusca;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public String getImagemGaleria4() {
		return imagemGaleria4;
	}

	public void setImagemGaleria4(String imagemGaleria4) {
		this.imagemGaleria4 = imagemGaleria4;
	}

	public String getImagemGaleria5() {
		return imagemGaleria5;
	}

	public void setImagemGaleria5(String imagemGaleria5) {
		this.imagemGaleria5 = imagemGaleria5;
	}

	public String getImagemGaleria6() {
		return imagemGaleria6;
	}

	public void setImagemGaleria6(String imagemGaleria6) {
		this.imagemGaleria6 = imagemGaleria6;
	}

	public String getImagemGaleria9() {
		return imagemGaleria9;
	}

	public void setImagemGaleria9(String imagemGaleria9) {
		this.imagemGaleria9 = imagemGaleria9;
	}

	public String getImagemGaleria10() {
		return imagemGaleria10;
	}

	public void setImagemGaleria10(String imagemGaleria10) {
		this.imagemGaleria10 = imagemGaleria10;
	}

	public String getVideo1() {
		return video1;
	}

	public void setVideo1(String video1) {
		this.video1 = video1;
	}

	public String getVideo2() {
		return video2;
	}

	public void setVideo2(String video2) {
		this.video2 = video2;
	}

	public String getPromoOutros() {
		return promoOutros;
	}

	public void setPromoOutros(String promoOutros) {
		this.promoOutros = promoOutros;
	}

	public String getVeaPromocoes() {
		return veaPromocoes;
	}

	public void setVeaPromocoes(String veaPromocoes) {
		this.veaPromocoes = veaPromocoes;
	}

	public String getVeaNecessidades() {
		return veaNecessidades;
	}

	public void setVeaNecessidades(String veaNecessidades) {
		this.veaNecessidades = veaNecessidades;
	}

	public Double getPrecoRevenda() {
		return precoRevenda;
	}

	public void setPrecoRevenda(Double precoRevenda) {
		this.precoRevenda = precoRevenda;
	}

	public String getTemPrecoEspecial() {
		return temPrecoEspecial;
	}

	public void setTemPrecoEspecial(String temPrecoEspecial) {
		this.temPrecoEspecial = temPrecoEspecial;
	}

	public String getImagemGaleria7() {
		return imagemGaleria7;
	}

	public void setImagemGaleria7(String imagemGaleria7) {
		this.imagemGaleria7 = imagemGaleria7;
	}

	public Integer getStatusRepublicacao() {
		return statusRepublicacao;
	}

	public void setStatusRepublicacao(Integer statusRepublicacao) {
		this.statusRepublicacao = statusRepublicacao;
	}

	public Integer getExcluido() {
		return excluido;
	}

	public void setExcluido(Integer excluido) {
		this.excluido = excluido;
	}


}
