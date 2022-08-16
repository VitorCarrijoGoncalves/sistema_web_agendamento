package br.com.sistemaWeb.vefel.service;

import br.com.sistemaWeb.vefel.bd_casag.models.Categoria;

public interface CategoriaService {

    Categoria findById(Long idCategoria);

    Iterable<Categoria> getListOfCategorias();

}
