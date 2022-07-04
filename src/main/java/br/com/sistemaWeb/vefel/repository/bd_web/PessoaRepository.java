package br.com.sistemaWeb.vefel.repository.bd_web;

import br.com.sistemaWeb.vefel.models.bd_web.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}