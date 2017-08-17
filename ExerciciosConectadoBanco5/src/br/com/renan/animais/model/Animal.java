package br.com.renan.animais.model;

import java.sql.Connection;

public class Animal {

	private int codigo;
	private String nome;
	private String cor;
	private int qtdPatas;
	private String grupo;
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
 
	private String som;

	public Animal(Integer codigo, String nome, String cor, Integer qtdPatas, String grupo, String som) {
		this.codigo = codigo;
		this.nome = nome;
		this.cor = cor;
		this.qtdPatas = qtdPatas;
		this.grupo = grupo;
		this.som = som;
	}
	
	public Animal(String nome, String cor, Integer qtdPatas,String grupo, String som) {
		this.nome = nome;
		this.cor = cor;
		this.qtdPatas = qtdPatas;
		this.grupo = grupo;
		this.som = som;
	}

		public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtdPatas() {
		return qtdPatas;
	}

	public void setQtdPatas(int qtdPatas) {
		this.qtdPatas = qtdPatas;
	}

	public String getsom() {
		return som;
	}

	public void setsom(String som) {
		this.som = som;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
}
