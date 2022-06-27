package br.com.sistemaWeb.vefel.service;

import br.com.sistemaWeb.vefel.models.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioService {

    Usuario save (Usuario usuario);

    Usuario findById(Long id);

    Usuario alterarStatus (Usuario usuario);

    Boolean validarStatus(Usuario usuario);

}
