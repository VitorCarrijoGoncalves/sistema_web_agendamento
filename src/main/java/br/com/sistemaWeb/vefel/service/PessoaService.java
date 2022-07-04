package br.com.sistemaWeb.vefel.service;

import br.com.sistemaWeb.vefel.models.bd_web.Pessoa;

public interface PessoaService {

    Pessoa save (Pessoa pessoa);

    Pessoa findById(Long id);

    Pessoa findbyUsername(String username);

}
