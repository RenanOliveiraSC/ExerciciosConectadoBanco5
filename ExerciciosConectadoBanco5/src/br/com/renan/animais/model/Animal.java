package br.com.renan.animais.model;

import java.sql.Connection;

public class Animal {

	private int codigo;
	private String nome;
	private String cor;
	private int qtdPatas;
	private String grupo;
	private String retornaSom;

	public Animal(int codigo, String nome, String cor, int qtdPatas, String grupo, String som) {
		this.codigo = codigo;
		this.nome = nome;
		this.cor = cor;
		this.qtdPatas = qtdPatas;
		this.grupo = grupo;
		this.retornaSom = som;
	}
	
		public Animal(Connection con) {
		// TODO Auto-generated constructor stub
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

	public String getRetornaSom() {
		return retornaSom;
	}

	public void setRetornaSom(String retornaSom) {
		this.retornaSom = retornaSom;
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
