package br.com.sistemaWeb.vefel.controller;

import br.com.sistemaWeb.vefel.dto.UsuarioDTO;
import br.com.sistemaWeb.vefel.enums.PerfilEnum;
import br.com.sistemaWeb.vefel.models.bd_web.Usuario;
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
	public ModelAndView getCadastro (UsuarioDTO usuarioDTO) {
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String saveUsuario (@Validated UsuarioDTO usuarioDTO, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			if (usuarioService.findbyUsername(usuarioDTO.getUsername()) != null) {
				return "redirect:/login/usuario";
			}
		}

		Usuario usuario = new Usuario(usuarioDTO.getNome(), usuarioDTO.getUsername(),
				usuarioDTO.getPassword(), PerfilEnum.USER, true);

		usuarioService.save(usuario);
		return "/login";

	}

	@RequestMapping(value = "/login/authenticate", method = RequestMethod.POST)
	public String logar (@Validated UsuarioDTO usuarioDTO, BindingResult result, RedirectAttributes attributes) {
		return null;

	}

}
