package br.com.sistemaWeb.vefel.service.impl;

import br.com.sistemaWeb.vefel.models.Usuario;
import br.com.sistemaWeb.vefel.repository.UsuarioRepository;
import br.com.sistemaWeb.vefel.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
