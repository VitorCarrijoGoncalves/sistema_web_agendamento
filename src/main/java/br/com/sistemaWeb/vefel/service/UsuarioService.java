package br.com.sistemaWeb.vefel.service;

import br.com.sistemaWeb.vefel.bd_casag.models.Pessoa;
import br.com.sistemaWeb.vefel.bd_casag.models.Usuario;
import br.com.sistemaWeb.vefel.dto.UsuarioDTO;
import br.com.sistemaWeb.vefel.enums.PerfilEnum;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

public interface UsuarioService {

    Usuario save(Usuario usuario);

    Usuario findById(Long id);

    Usuario alterarStatus(Usuario usuario);

    Boolean validarStatus(Usuario usuario);

    Usuario findbyUsername(String username);

    ModelAndView createUser(UsuarioDTO usuarioDTO, BindingResult result);

    ModelAndView authenticate(UsuarioDTO usuarioDTO, BindingResult result);

    Optional<Usuario> verificarExisteUsuario(UsuarioDTO usuarioDTO);

}
