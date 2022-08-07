package br.com.sistemaWeb.vefel.repository;

import br.com.sistemaWeb.vefel.bd_casag.models.Pessoa;
import br.com.sistemaWeb.vefel.bd_casag.models.Servico;
import org.springframework.data.repository.CrudRepository;

public interface ServicoRepository extends CrudRepository<Servico, Long> {
}
