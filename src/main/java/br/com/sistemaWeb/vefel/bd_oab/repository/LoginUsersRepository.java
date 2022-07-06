package br.com.sistemaWeb.vefel.bd_oab.repository;

import br.com.sistemaWeb.vefel.bd_oab.models.LoginUsers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginUsersRepository extends CrudRepository<LoginUsers, Long> {

    @Query("SELECT l FROM LoginUsers l "
            + "WHERE l.userID = ?1 AND l.password = ?2 "
            + "AND l.isActive = 'X'")
    Optional<LoginUsers> buscarUsuarioAutenticacao(String userid, String hashSHA512);

}
