package br.com.sistemaWeb.vefel.service.impl;

import br.com.sistemaWeb.vefel.dto.UsuarioDTO;
import br.com.sistemaWeb.vefel.enums.PerfilEnum;
import br.com.sistemaWeb.vefel.models.bd_web.Usuario;
import br.com.sistemaWeb.vefel.repository.bd_web.UsuarioRepository;
import br.com.sistemaWeb.vefel.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

	public String authenticate(UsuarioDTO usuarioDTO, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return "redirect:/login/usuario";
		}

		//Pessoa pessoa = find

		Usuario usuario = new Usuario(usuarioDTO.getNome(), usuarioDTO.getUsername(),
				usuarioDTO.getPassword(), PerfilEnum.USER, true);

		//usuarioService.save(usuario);
		return "/login";
	}
}
