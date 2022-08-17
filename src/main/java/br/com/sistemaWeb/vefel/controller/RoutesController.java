package br.com.sistemaWeb.vefel.controller;

import br.com.sistemaWeb.vefel.dto.ServicoDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RoutesController {

    @RequestMapping(value = "/categoria/barbearia", method = RequestMethod.GET)
    public ModelAndView getBarber() {
        ModelAndView mv = new ModelAndView("categorias");
        return mv;
    }

    @RequestMapping(value = "/novo/servico", method = RequestMethod.GET)
    public ModelAndView getNewService(@ModelAttribute("servicoDto") ServicoDto servicoDto) {
        ModelAndView mv = new ModelAndView("cadastro-servico");
        return mv;
    }

}
