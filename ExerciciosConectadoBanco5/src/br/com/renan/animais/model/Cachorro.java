package br.com.renan.animais.model;

public class Cachorro extends Animal {

	public Cachorro(Integer codigo, String nome, String cor, int qtdPatas, String grupo, String som) {
		super(codigo,nome, cor, qtdPatas, grupo, som);
	}

	public Cachorro(String nome, String cor, Integer qtdPatas, String grupo) {
		super(nome, cor, qtdPatas,grupo, "AuAu");

	}
}