package br.com.sistemaWeb.vefel.controller;

import br.com.sistemaWeb.vefel.bd_casag.models.Servico;
import br.com.sistemaWeb.vefel.dto.ServicoDto;
import br.com.sistemaWeb.vefel.dto.UsuarioDTO;
import br.com.sistemaWeb.vefel.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@RestController
//public class CategoriaController {

//    @Autowired
//    private CategoriaService categoriaService;
//
//    @RequestMapping(value = "/categoria/servico", method = RequestMethod.POST)
//    public ModelAndView newService(@ModelAttribute("servico") ServicoDto servicoDto, BindingResult result) {
//        return categoriaService.newService(servicoDto, result);
//    }

//}
