package br.com.sempreautos.integradorSA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView importacao(){
        
		ModelAndView mv = new ModelAndView("/importacao");
        mv.addObject("importacoes", importacaoService.findAll());
        mv.addObject("layouts", layoutXMLService.findByUsuario(usuarioService.getUsuarioAutenticado()));
        return mv;		
	}
	
	@GetMapping("/importacao/nova")
	public ModelAndView novaImportacao(){
		ModelAndView mv = new ModelAndView("/novaImportacao");
        return mv;		
	}
	
	@PostMapping("importacao/importar")
	public ModelAndView importar(){
		return importacao();
	}

}
