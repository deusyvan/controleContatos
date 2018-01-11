package com.dfsweb.controles.model;

public enum PostoGradEnum {

	/**
	 * Classe define os postos e graduacoes do exercito
	 * Criado por: 2º Sgt Deusyvan
	 * Data: 28Abr16
	 */
	GEN_EXERCITO("1","Gen Ex"),
	GEN_DIVISAO("2","Gen Div"),
	GEN_BRIGADA("3","Gen Bda"),
	CEL("4","Cel"),
	TC("5","Ten Cel"),
	MAJ("6","Maj"),
	CAP("7","Cap"),
	TEN_1("8","1º Ten"),
	TEN_2("9","2º Ten"),
	ASP("10","Asp"),
	CAD("11","Cad"),
	ST("12","S Ten"),
	SGT_1("13","1º Sgt"),
	SGT_2("14","2º Sgt"),
	SGT_3("15","3º Sgt"),
	T_MOR("16","T Mor"),
	CB("17","Cb"),
	SD("18","Sd"),
	CIVIL("19","");

	private String valor;
	private String descricao;

	PostoGradEnum(String valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}

	public String getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public static String getDescricao(String valor) {
		for (PostoGradEnum item : values()) {
			if (item.getValor() == valor) {
				return item.getDescricao();
			}
		}
		return null;
	}

}
