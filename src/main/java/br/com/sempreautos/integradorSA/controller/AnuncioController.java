package br.com.sempreautos.integradorSA.controller;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.sempreautos.integradorSA.model.portal.Anuncio;
import br.com.sempreautos.integradorSA.service.AnuncioService;

@Controller
public class AnuncioController {

	@Autowired
	AnuncioService anuncioService;
	
	/**
	 * @return
	 */
	@GetMapping("/anuncio/salvar")
	public ModelAndView salvarAnuncio(){
		
		Anuncio anuncio = new Anuncio();
		
		anuncio.setIdUsuario(1);
		anuncio.setTipoUsuario("Revenda");
		anuncio.setTituloAnuncio("lamborghini spyder v10 5.2 2010");
		anuncio.setResumoAnuncio("spyder veiculo extremamente exclusivo e lindo!!! motor 5.2l v10 de 560 cv., cambio egear de 6 marchas, tracao integral, lifting system, farois bi xenon com leds, interior em couro preto e branco, ar condicionado digital, sistema de som com tela central, dvd, entradas para ipod, sd card e conexao via bluetooth, camera de re, capota de lona preta com acionamento eletrico!!! ***este veiculo encontrase em nossa loja da rua jovino do rosario, 965, no bairro boa vista a uma quadra do terminal boa vista, ou se preferir ligue 41 3023 9737 e agende sua visita com um de nossos vendedores que tera a maior satisfacao em atendelo, para mais detalhes acesse, www.shiftcar.com.br e confira nosso estoque. lembrando que temos as melhores taxas de financiamento de veiculos novos e usados.");
		anuncio.setIdCidadeAnuncio(8807);
		anuncio.setIdGrupoAnuncio(0);
		anuncio.setIdParceiroAnunciante(47);
		anuncio.setSystem("Y");
		anuncio.setValor(new Double(778000.00));
		anuncio.setUrlImagem1("http://s3.carro57.com.br.s3.amazonaws.com/FC/2384/788062_2_G_b9e536f357.jpg");
		anuncio.setUrlImagem2("http://s3.carro57.com.br.s3.amazonaws.com/FC/2384/788062_10_G_713ea7ebf7.jpg");
		anuncio.setTipoAviso("normal");
		anuncio.setOrdem(0);
		anuncio.setPrazoExpiracao(0);
		anuncio.setPrazoInicio(0);
		anuncio.setPrazoTermino(0);
		anuncio.setPrazoAlcance(0);
		anuncio.setImagemGaleria1("http://s3.carro57.com.br.s3.amazonaws.com/FC/2384/788062_2_G_b9e536f357.jpg");
		anuncio.setImagemGaleria2("http://s3.carro57.com.br.s3.amazonaws.com/FC/2384/788062_10_G_713ea7ebf7.jpg");
		anuncio.setImagemGaleria3("http://s3.carro57.com.br.s3.amazonaws.com/FC/2384/788062_0_G_27afbe0d0f.jpg");
		anuncio.setImagemGaleria3("http://s3.carro57.com.br.s3.amazonaws.com/FC/2384/788062_1_G_a8928381c9.jpg");		
		anuncio.setMostrarPreco("1");
		anuncio.setQtdVisualiacoes(0);
		anuncio.setDataCriacao(LocalDate.now());
		anuncio.setMostrarSeguranca("1");
		anuncio.setQtdCliques(0);
		anuncio.setStatus(1);
		anuncio.setPago("não");
		anuncio.setAnuncioGratis(null);
		anuncio.setTipoCarro("Carro");
		anuncio.setFabricanteCarro("171");
		anuncio.setCarroModelo("078007-3");
		anuncio.setAnoCarro(2010);
		anuncio.setCarroceriaCarro("Esportivo");
		anuncio.setEstiloMoto("");
		anuncio.setPrecoCarro(new Double(778000.00));
		anuncio.setKmRodado("13000");
		anuncio.setNumeroPortas("2");
		anuncio.setCorCarro("branco");
		anuncio.setCombustivelCarro("Gasolina");
		anuncio.setMotorCarro(null);
		anuncio.setTransmissaoCarro("Automatica");
		anuncio.setQtdCilindradas(null);
		anuncio.setTipoTracao(null);
		anuncio.setVeaCaracter(null);
		anuncio.setEstadoVeiculo("Usado");
		anuncio.setModeloAno(2010);
		anuncio.setUfVeiculo("PR");
		anuncio.setVitrine("Y");
		anuncio.setImagemDestaque("http://s3.carro57.com.br.s3.amazonaws.com/FC/2384/788062_2_G_b9e536f357.jpg");
		anuncio.setUsouBonus(null);
		anuncio.setAvisa("Y");
		anuncio.setIneditado("N");
		anuncio.setPlanoParceitoAnunciante(103);
		anuncio.setDesativado("N");
		anuncio.setContador(1);
		anuncio.setRenavam(null);
		anuncio.setDestaqueBusca(1);
		anuncio.setPlacaVeiculo("eds8881");
		anuncio.setImagemGaleria4("http://s3.carro57.com.br.s3.amazonaws.com/FC/2384/788062_5_G_31f9f341da.jpg");
		anuncio.setImagemGaleria5("http://s3.carro57.com.br.s3.amazonaws.com/FC/2384/788062_4_G_e96bd6175c.jpg");
		anuncio.setImagemGaleria6("http://s3.carro57.com.br.s3.amazonaws.com/FC/2384/788062_7_G_20a67ccbc3.jpg");		
		anuncio.setImagemGaleria9("http://s3.carro57.com.br.s3.amazonaws.com/FC/2384/788062_7_G_20a67ccbc3.jpg");
		anuncio.setImagemGaleria10("http://s3.carro57.com.br.s3.amazonaws.com/FC/2384/788062_3_G_cf3d116c4f.jpg");
		anuncio.setVideo1(null);
		anuncio.setVideo2(null);
		anuncio.setPromoOutros(null);
		anuncio.setVeaPromocoes(null);
		anuncio.setVeaNecessidades(null);
		anuncio.setPrecoRevenda(new Double(778000.00));
		anuncio.setTemPrecoEspecial("N");
		anuncio.setImagemGaleria7("http://s3.carro57.com.br.s3.amazonaws.com/FC/2384/788062_8_G_3bded25d01.jpg");
		anuncio.setStatusRepublicacao(null);
		anuncio.setExcluido(0);
		
		anuncioService.salvar(anuncio);
		return null;
	}
	
}
