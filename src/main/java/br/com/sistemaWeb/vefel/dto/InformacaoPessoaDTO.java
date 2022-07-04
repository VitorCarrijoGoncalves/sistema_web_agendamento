package br.com.sistemaWeb.vefel.dto;

import java.io.Serializable;

//@JacksonXmlRootElement(localName = "usuario")
public class InformacaoPessoaDTO implements Serializable {

    private static final long serialVersionUID = 7821560259660163284L;

    private Long id;

    private String nome;

    private String email;

    private String message;

    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
