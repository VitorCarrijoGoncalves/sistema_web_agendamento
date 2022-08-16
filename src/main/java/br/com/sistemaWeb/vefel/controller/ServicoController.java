package br.com.sistemaWeb.vefel.controller;

import br.com.sistemaWeb.vefel.bd_casag.models.Categoria;
import br.com.sistemaWeb.vefel.dto.ServicoDto;
import br.com.sistemaWeb.vefel.service.CategoriaService;
import br.com.sistemaWeb.vefel.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @RequestMapping(value = "/servico/novo", method = RequestMethod.POST)
    public ModelAndView newService(@ModelAttribute("servicoDto") ServicoDto servicoDto, BindingResult result) {
        return servicoService.newService(servicoDto, result);
    }

}
