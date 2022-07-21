package br.com.sistemaWeb.vefel.repository;

import br.com.sistemaWeb.vefel.bd_casag.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}