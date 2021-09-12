package com.empresa.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "medicamento")
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMedicamento;
	private String nombre;
	private String precio;
	private String stock;
	private String laboratorio;
	public int getIdMedicamento() {
		return idMedicamento;
	}
	public void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	 
}
