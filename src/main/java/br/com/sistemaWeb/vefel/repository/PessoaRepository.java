package br.com.sistemaWeb.vefel.repository;

import br.com.sistemaWeb.vefel.bd_casag.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
}