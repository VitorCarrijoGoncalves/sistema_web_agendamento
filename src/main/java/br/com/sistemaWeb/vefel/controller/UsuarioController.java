package br.com.sistemaWeb.vefel.controller;

import br.com.sistemaWeb.vefel.dto.UsuarioDTO;
import br.com.sistemaWeb.vefel.enums.PerfilEnum;
import br.com.sistemaWeb.vefel.bd_casag.models.Usuario;
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
public class UsuarioController {

	@Autowired
    private UsuarioServiceImpl usuarioService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getLogin(@ModelAttribute UsuarioDTO usuarioDTO) {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

	@RequestMapping(value = "/login/usuario", method = RequestMethod.GET)
	public ModelAndView getCadastro (UsuarioDTO usuarioDTO) {
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView saveUsuario (@Validated UsuarioDTO usuarioDTO, BindingResult result) {
		return usuarioService.createUser(usuarioDTO, result);

	}

	@RequestMapping(value = "/login/authenticate", method = RequestMethod.POST)
	public ModelAndView logar (@Validated UsuarioDTO usuarioDTO, BindingResult result, RedirectAttributes attributes) {
		return usuarioService.authenticate(usuarioDTO, result);
	}

}
