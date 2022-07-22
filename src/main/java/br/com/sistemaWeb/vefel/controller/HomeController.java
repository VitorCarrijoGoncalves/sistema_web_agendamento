package br.com.sistemaWeb.vefel.controller;

import br.com.sistemaWeb.vefel.dto.UsuarioDTO;
import br.com.sistemaWeb.vefel.service.impl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
public class HomeController {

	@Autowired
    private UsuarioServiceImpl usuarioService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView getHome() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}

}
