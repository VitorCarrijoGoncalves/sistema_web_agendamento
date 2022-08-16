package br.com.sistemaWeb.vefel.service;

import br.com.sistemaWeb.vefel.bd_casag.models.Categoria;
import br.com.sistemaWeb.vefel.dto.ServicoDto;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

public interface ServicoService {

    ModelAndView newService(ServicoDto servicoDto, BindingResult result);

    Iterable<Categoria> getListOfCategorias();

}
