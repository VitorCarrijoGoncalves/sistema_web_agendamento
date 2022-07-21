package br.com.sistemaWeb.vefel.repository;

import br.com.sistemaWeb.vefel.bd_casag.models.Usuario;
import br.com.sistemaWeb.vefel.dto.UsuarioDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByUsername(String username);

    @Query(value = "SELECT nome, senha FROM usuario u WHERE u.nome = ?1 AND senha = ?2", nativeQuery = true)
    Optional<Usuario> findByNomeAndSenha(UsuarioDTO usuarioDTO);

}
