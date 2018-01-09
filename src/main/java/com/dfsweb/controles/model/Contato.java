package com.dfsweb.controles.model;

import javax.persistence.Entity;

@Entity
public class Contato {

	private Long id;
	private String nome;
	private String email;
	private Endereco endereco;
	private PostoGradEnum postGrad;
	private Telefone telefone;
	
}
