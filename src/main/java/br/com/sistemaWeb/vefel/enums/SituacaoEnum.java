package br.com.sistemaWeb.vefel.enums;

public enum SituacaoEnum {
	
	AINICIAR("A Iniciar"),
	EMANDAMENTO("Em Andamento"),
	EMVOTACAO("Em Votação"),
	FINALIZADA("Finalizada");
	
	private String descricao;

	SituacaoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
