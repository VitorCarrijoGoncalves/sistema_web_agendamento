package br.com.sistemaWeb.vefel.service;

import br.com.sistemaWeb.vefel.bd_casag.models.Pessoa;

public interface PessoaService {

    Pessoa save (Pessoa pessoa);

    Pessoa findById(Long id);

    Pessoa findbyUsername(String username);

}
