package br.com.sistemaWeb.vefel.repository.bd_web;

import br.com.sistemaWeb.vefel.models.bd_web.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
