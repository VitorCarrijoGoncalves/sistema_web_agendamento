package br.com.sistemaWeb.vefel.service;

import br.com.sistemaWeb.vefel.bd_casag.models.Usuario;

public interface UsuarioService {

    Usuario save (Usuario usuario);

    Usuario findById(Long id);

    Usuario alterarStatus (Usuario usuario);

    Boolean validarStatus(Usuario usuario);

    Usuario findbyUsername(String username);

}
