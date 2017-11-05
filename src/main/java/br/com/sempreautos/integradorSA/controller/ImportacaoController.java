package br.com.sempreautos.integradorSA.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.com.sempreautos.integradorSA.model.integrador.Importacao;
import br.com.sempreautos.integradorSA.model.integrador.ImportacaoArquivo;
import br.com.sempreautos.integradorSA.service.ImportacaoService;
import br.com.sempreautos.integradorSA.service.LayoutXMLService;
import br.com.sempreautos.integradorSA.service.UsuarioService;

@Controller
public class ImportacaoController {

	@Autowired
	ImportacaoService importacaoService;
	
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	LayoutXMLService layoutXMLService;
	
	@GetMapping("/importacao")
	@Transactional("integradorTransactManager")
	public ModelAndView importacao(){
        
		ModelAndView mv = new ModelAndView("/importacao");
        mv.addObject("importacoes", importacaoService.findAll());
        mv.addObject("layouts", layoutXMLService.findByUsuario(usuarioService.getUsuarioAutenticado()));
        return mv;		
	}
	
	@PostMapping("/importacao/importar")
	@Transactional("integradorTransactManager")
	public ModelAndView importar(@RequestParam("arquivoImportacao") MultipartFile arquivoImportacao,
			@RequestParam("layouts") long layouts) {
		try {
			ByteArrayInputStream stream = new   ByteArrayInputStream(arquivoImportacao.getBytes());
			String conteudo = IOUtils.toString(stream, "UTF-8");			
			
			System.out.println("Arquivo selecionado: " + arquivoImportacao.getOriginalFilename());
			System.out.println("Conteudo: " + conteudo);
			System.out.println("Layout selecionado: " + layouts);
			
			Importacao importacao = new Importacao();
			ImportacaoArquivo arquivo = new ImportacaoArquivo();
			
			arquivo.setArquivo(conteudo);
			
			importacao.setDataHora(LocalDateTime.now());
			importacao.setLayoutArquivo(layoutXMLService.findOne(layouts));
			importacao.setNomeArquivo(arquivoImportacao.getOriginalFilename());
			importacao.setMensagemResultado("Arquivo Importado com Sucesso");
			importacao.setResultado(0);
			importacao.setArquivo(arquivo);
			
			importacaoService.save(importacao);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		return importacao();
	}
}
