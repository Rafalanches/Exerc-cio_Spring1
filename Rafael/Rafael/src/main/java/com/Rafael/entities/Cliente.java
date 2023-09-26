package com.Rafael.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Os_Clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name = "Cliente")
	private String Ncliente;
	
	@Column(name = "N° de Telephone")
	private String fone;
	
	public Long getId() {
		return idcCliente;
	}
	
	public void setId(Long idcCliente) {
		this.idcCliente = idcCliente;	
	}
	
	public String getNcliente() {
		return Ncliente;
	}
	
	public void setNcliente(String Ncliente) {
		this.Ncliente = Ncliente;	
	}
	
	public String getFone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;	
	}
}
