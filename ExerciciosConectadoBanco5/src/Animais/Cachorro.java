package Animais;

public class Cachorro extends Animal {

	public Cachorro(String nome, String cor, int qtdPatas) {
		super(nome, cor, qtdPatas);
		this.setRetornaSom("AuAu");
	}

}