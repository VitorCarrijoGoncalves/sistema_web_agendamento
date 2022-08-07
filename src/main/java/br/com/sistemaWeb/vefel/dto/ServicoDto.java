package br.com.sistemaWeb.vefel.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ServicoDto implements Serializable {

    private final String descricao;
    private final long valor;
    private final Date tempo;
    private final long idCategoria;

    public ServicoDto(String descricao, long valor, Date tempo, long idCategoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.tempo = tempo;
        this.idCategoria = idCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public long getValor() {
        return valor;
    }

    public Date getTempo() {
        return tempo;
    }

    public long getIdCategoria() {
        return idCategoria;
    }
}
