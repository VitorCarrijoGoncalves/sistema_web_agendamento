package br.com.sistemaWeb.vefel.repository;

import br.com.sistemaWeb.vefel.bd_casag.models.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria, Long> {
}
