package br.com.renan.animais.model;

public class PorquinhodaIndia extends Animal {

	public PorquinhodaIndia(Integer  codigo, String nome, String cor, Integer qtdPatas, String grupo,String som ) {
		super(codigo ,nome, cor, qtdPatas, grupo, som);
		
	}

	public PorquinhodaIndia(String nome, String cor, Integer qtdPatas, String grupo) {
		super(nome, cor, qtdPatas, grupo, "Miau");
	}
	
}
