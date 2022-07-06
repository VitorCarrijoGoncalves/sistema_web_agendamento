package br.com.sistemaWeb.vefel.bd_casag.models;

import br.com.sistemaWeb.vefel.enums.PerfilEnum;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
//import lombok.Getter;
//import lombok.Setter;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@NotNull
	@Column(name = "nome")
	private String nome;
	
	@NotNull
	@Column(name = "username")
	private String username;

	@NotNull
	@Column(name = "senha")
	private String senha;

	@NotNull
	@Column(name = "perfil")
	private PerfilEnum perfilEnum;

	@NotNull
	@Column(name = "ativo")
	private Boolean isAtivo;

	public Usuario() {
	}

	public Usuario(String nome, String username, String senha, PerfilEnum perfilEnum, Boolean isAtivo) {
		this.nome = nome;
		this.username = username;
		this.senha = senha;
		this.perfilEnum = perfilEnum;
		this.isAtivo = isAtivo;
	}

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public PerfilEnum getPerfilEnum() {
		return perfilEnum;
	}

	public void setPerfilEnum(PerfilEnum perfilEnum) {
		this.perfilEnum = perfilEnum;
	}

	public Boolean getAtivo() {
		return isAtivo;
	}

	public void setAtivo(Boolean ativo) {
		isAtivo = ativo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Usuario usuario = (Usuario) o;
		return Objects.equals(id, usuario.id) && Objects.equals(nome, usuario.nome) && Objects.equals(username, usuario.username) && Objects.equals(senha, usuario.senha) && perfilEnum == usuario.perfilEnum && Objects.equals(isAtivo, usuario.isAtivo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, username, senha, perfilEnum, isAtivo);
	}
}
