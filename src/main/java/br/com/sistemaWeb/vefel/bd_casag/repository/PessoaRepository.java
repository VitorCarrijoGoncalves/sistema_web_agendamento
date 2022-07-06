package br.com.sistemaWeb.vefel.bd_casag.repository;

import br.com.sistemaWeb.vefel.bd_casag.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}