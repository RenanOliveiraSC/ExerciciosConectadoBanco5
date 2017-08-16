package br.com.renan.animais.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.renan.animais.dao.GatoDAO;
import br.com.renan.animais.jdbc.ConnectionPoolOracle;
import br.com.renan.animais.model.Gato;
import br.com.renan.animais.service.GatoService;

public class TestaGato {

	public static void main(String[] args) throws SQLException {
		GatoService gatoService = new GatoService();

		List<Gato> lGatos = gatoService.listarGatos();
		for (Gato cat : lGatos) {
			imprimirGato(cat);
		}
		// Inserir um novo
		Gato gato = new Gato("Mano", "Cinza", 4, "Gato");
		gatoService.inserir(gato);

		// Alterar o nome de um gato
		// gatoService.alterar(codigo, "Pluto");

		// Remover um gato
		// gatoService.excluir(codigo);

		System.out.println();

		System.out.println("*******Lista Atualizada**********");

		// Listagem dos Gatos
		List<Gato> lGatos2 = gatoService.listarGatos();
		for (Gato cat : lGatos) {
			imprimirGato(cat);
		}
	}

	private static void imprimirGato(Gato cat) {
		System.out.println("Nome: "+ cat.getNome() + ", Som: "+cat.getSom());
	}
}