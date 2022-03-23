package com.spring.codebblog.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
/*@ENTITY é pra dizer que vai ser uma tabela no banco e o @table é pra dar o nome a tabela*/
@Entity
@Table(name="TB_POST")
public class Post {
	/*atributos da tabela*/
	/*Coloco o @Id pra dizer que ele é um id da tabela e o @generatedvalue pra ele gerar altomaticamente o id*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	private String titulo;
	private String autor;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern= "dd-MM-yyyy")
	private LocalDate data;
	
	@Lob
	private String texto;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}

	
}
