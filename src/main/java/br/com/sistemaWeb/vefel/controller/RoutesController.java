package br.com.sistemaWeb.vefel.controller;

import org.springframework.stereotype.Controller;
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

}
