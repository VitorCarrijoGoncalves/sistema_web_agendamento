package br.com.sistemaWeb.vefel.controller;

import br.com.sistemaWeb.vefel.models.Usuario;
import br.com.sistemaWeb.vefel.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
public class UsuarioController {

	@Autowired
    private UsuarioService usuarioService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getLogin() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

	@RequestMapping(value = "/login/usuario", method = RequestMethod.GET)
	public ModelAndView getCadastro () {
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}

	@RequestMapping(value = "/login/usuario/novo", method = RequestMethod.POST)
	public String saveUsuario (@Validated Usuario usuario, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			if (usuarioService.findById(usuario.getId()) != null) {
				return "redirect:/login/usuario";
			}
		}


		usuarioService.save(usuario);
		return "redirect:/login";

	}

}
