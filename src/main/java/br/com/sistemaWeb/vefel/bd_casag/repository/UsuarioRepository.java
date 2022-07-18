package br.com.sistemaWeb.vefel.bd_casag.repository;

import br.com.sistemaWeb.vefel.bd_casag.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
