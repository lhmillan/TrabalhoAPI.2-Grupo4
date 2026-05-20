package br.com.serratec.trab_grup2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	@NotBlank(message = "Nome nao pode estar vazio")
	protected String nome;
	@NotBlank(message = "Email nao pode estar vazio")
	@Email(message = "Email invalido")
	protected String email;
	@Size(max = 1621, message = "insira um valor acima do salario minimo")
	protected Double salario;
	
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
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
