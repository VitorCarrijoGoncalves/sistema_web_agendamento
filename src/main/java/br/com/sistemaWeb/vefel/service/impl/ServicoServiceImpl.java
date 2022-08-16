package br.com.sistemaWeb.vefel.service.impl;

import br.com.sistemaWeb.vefel.bd_casag.models.Categoria;
import br.com.sistemaWeb.vefel.bd_casag.models.Servico;
import br.com.sistemaWeb.vefel.dto.ServicoDto;
import br.com.sistemaWeb.vefel.repository.ServicoRepository;
import br.com.sistemaWeb.vefel.service.CategoriaService;
import br.com.sistemaWeb.vefel.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

@Service
public class ServicoServiceImpl implements ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    @Autowired
    private CategoriaService categoriaService;

    @Override
    public ModelAndView newService(ServicoDto servicoDto, BindingResult result) {
        if (result.hasErrors()) {
            return new ModelAndView("redirect:" + "/categoria/servico");
        }

        Servico servico = new Servico(servicoDto.getDescricao(), categoriaService.findById(servicoDto.getIdCategoria()),
                servicoDto.getValor(), servicoDto.getTempo());

        save(servico);
        return new ModelAndView("redirect:" + "/categoria/servico");
    }

    @Override
    public Iterable<Categoria> getListOfCategorias() {
        return categoriaService.getListOfCategorias();
    }

    public void save(Servico servico) {
        servicoRepository.save(servico);
    }

}
