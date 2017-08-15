package br.com.renan.animais.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.renan.animais.model.Gato;
import br.com.renan.animais.service.GatoService;

public class TestaGato {

	public static void main(String[] args) throws Exception {
		GatoService gatoservice = new GatoService();
		
		List<Gato> lGato = gatoservice.listargatos();
		for (Gato gato : lGato) {
			System.out.println(gato.getNome());
		}
	}
}
