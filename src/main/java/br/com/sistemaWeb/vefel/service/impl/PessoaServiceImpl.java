package br.com.sistemaWeb.vefel.service.impl;

import br.com.sistemaWeb.vefel.bd_casag.models.Pessoa;
import br.com.sistemaWeb.vefel.bd_casag.repository.PessoaRepository;
import br.com.sistemaWeb.vefel.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImpl implements PessoaService {

	@Autowired
	PessoaRepository pessoaRepository;

	@Override
	public Pessoa save(Pessoa pessoa) {
		return null;
	}

	@Override
	public Pessoa findById(Long id) {
		return null;
	}

	@Override
	public Pessoa findbyUsername(String username) {
		return null;
	}
}
