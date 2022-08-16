package br.com.sistemaWeb.vefel.service.impl;

import br.com.sistemaWeb.vefel.bd_casag.models.Categoria;
import br.com.sistemaWeb.vefel.bd_casag.models.Servico;
import br.com.sistemaWeb.vefel.bd_casag.models.Usuario;
import br.com.sistemaWeb.vefel.dto.ServicoDto;
import br.com.sistemaWeb.vefel.enums.PerfilEnum;
import br.com.sistemaWeb.vefel.repository.CategoriaRepository;
import br.com.sistemaWeb.vefel.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria findById(Long idCategoria) {
        return categoriaRepository.findById(idCategoria).get();
    }

    @Override
    public Iterable<Categoria> getListOfCategorias() {
        return categoriaRepository.findAll();
    }
}
