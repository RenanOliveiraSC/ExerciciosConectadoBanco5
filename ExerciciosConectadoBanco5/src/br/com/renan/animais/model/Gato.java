package br.com.renan.animais.model;

public class Gato extends Animal {

	public Gato(Integer  codigo, String nome, String cor, Integer qtdPatas, String grupo,String som ) {
		super(codigo ,nome, cor, qtdPatas, grupo, som);
		
	}

	public Gato(String nome, String cor, Integer qtdPatas, String grupo) {
		super(nome, cor, qtdPatas, grupo, "Miau");
	}
	
}
