package br.com.sistemaWeb.vefel.models.bd_web;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

//import lombok.Getter;
//import lombok.Setter;

@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@NotNull
	@Column(name = "descricao")
	private String descricao;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
	private List<Servico> servicos;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
	private List<Profissional> profissionais;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public List<Profissional> getProfissionais() {
		return profissionais;
	}

	public void setProfissionais(List<Profissional> profissionais) {
		this.profissionais = profissionais;
	}
}