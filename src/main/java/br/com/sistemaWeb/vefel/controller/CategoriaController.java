package br.com.sistemaWeb.vefel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController(value = "/categoria")
public class CategoriaController {

    @RequestMapping(value = "/barbearia", method = RequestMethod.GET)
    public ModelAndView getBarber() {
        ModelAndView mv = new ModelAndView("servicos");
        return mv;
    }

}
