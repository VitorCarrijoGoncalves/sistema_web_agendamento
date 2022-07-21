package br.com.sistemaWeb.vefel.service.impl;

import br.com.sistemaWeb.vefel.dto.UsuarioDTO;
import br.com.sistemaWeb.vefel.enums.PerfilEnum;
import br.com.sistemaWeb.vefel.bd_casag.models.Usuario;
import br.com.sistemaWeb.vefel.repository.UsuarioRepository;
import br.com.sistemaWeb.vefel.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuario findById(Long id) {
		return usuarioRepository.findById(id).get();
	}

	@Override
	public Usuario alterarStatus(Usuario usuario) {
		return null;
	}

	@Override
	public Boolean validarStatus(Usuario usuario) {
		return null;
	}

	@Override
	public Usuario findbyUsername(String username) {
		return usuarioRepository.findByUsername(username);
	}

	@Override
	public ModelAndView createUser(UsuarioDTO usuarioDTO, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("redirect:" + "/login/usuario");
		}

		Usuario usuario = new Usuario(usuarioDTO.getNome(), usuarioDTO.getUsername(),
				usuarioDTO.getPassword(), PerfilEnum.USER, true);

		save(usuario);
		return new ModelAndView("redirect:" + "/login");
	}
	@Override
	public ModelAndView authenticate(UsuarioDTO usuarioDTO, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("redirect:" + "/login");
		}

		Optional<Usuario> usuario = verificarExisteUsuario(usuarioDTO);

		if (!usuario.isPresent()) {
			FieldError fieldError = new FieldError("fieldError",
					"fieldError","Dados inválidos informados");
			result.addError(fieldError);
			return new ModelAndView("redirect:" + "/login");
		}

		return new ModelAndView("redirect:" + "/home");

	}

	@Override
	public Optional<Usuario> verificarExisteUsuario(UsuarioDTO usuarioDTO) {
		return usuarioRepository.findByNomeAndSenha(usuarioDTO);
	}

}
