package br.com.sempreautos.integradorSA.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.sempreautos.integradorSA.model.Usuario;
import br.com.sempreautos.integradorSA.service.LayoutXMLService;
import br.com.sempreautos.integradorSA.service.UsuarioService;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    
    @Autowired
    private LayoutXMLService layoutXMLService;
    
    @GetMapping("/usuario")
    public ModelAndView findAll() {
         
        ModelAndView mv = new ModelAndView("/usuarios");
        mv.addObject("usuarios", usuarioService.findAll());
         
        return mv;
    }
     
    @GetMapping("/usuario/cadastrar")
    public ModelAndView add(Usuario usuario) {
         
        ModelAndView mv = new ModelAndView("/cadastrarUsuario");

        mv.addObject("usuario", usuario);
        mv.addObject("layouts", layoutXMLService.findAll());
         
        return mv;
    }
     
    @GetMapping("/usuario/alterar/{id}")
    public ModelAndView edit(@PathVariable("id") Long id) {
         
    	ModelAndView mv = new ModelAndView("/cadastrarUsuario");
    	mv.addObject("usuario", usuarioService.findOne(id));
    	mv.addObject("layouts", layoutXMLService.findAll());
    	
    	return mv;
    }
     
    @GetMapping("/usuario/excluir/{id}")
    public ModelAndView delete(@PathVariable("id") Long id) {
         
        usuarioService.delete(id);
         
        return findAll();
    }
 
    @PostMapping("/usuario/salvar")
    public ModelAndView save(@Valid Usuario usuario, BindingResult result) {
         
        if(result.hasErrors()) {
            return add(usuario);
        }
         
        usuarioService.save(usuario);
         
        return findAll();
    }
}
