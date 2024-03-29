package br.com.sistemaWeb.vefel.dto;

public class UsuarioDTO {

    private String nome;

    private String username;

    private String password;

    public UsuarioDTO(String nome, String username, String password) {
        this.nome = nome;
        this.username = username;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
