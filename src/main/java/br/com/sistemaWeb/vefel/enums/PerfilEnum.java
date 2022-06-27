package br.com.sistemaWeb.vefel.enums;

public enum PerfilEnum {

	USER("USER"),
	ADMIN("ADMIN");

	private String descricao;

	PerfilEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
