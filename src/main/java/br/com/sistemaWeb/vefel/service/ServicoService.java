package br.com.sistemaWeb.vefel.service;

import br.com.sistemaWeb.vefel.dto.ServicoDto;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

public interface ServicoService {

    ModelAndView newService(ServicoDto servicoDto, BindingResult result);

}
