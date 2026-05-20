package br.com.serratec.trab_grup2.model;

import jakarta.persistence.Entity;

@Entity
public class VendedorProfissional extends Vendedor{
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
