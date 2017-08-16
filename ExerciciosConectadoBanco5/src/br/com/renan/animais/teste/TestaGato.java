package br.com.renan.animais.teste;

import java.sql.Connection;
import java.util.List;

import br.com.renan.animais.dao.GatoDAO;
import br.com.renan.animais.jdbc.ConnectionPoolOracle;
import br.com.renan.animais.model.Gato;
import br.com.renan.animais.service.GatoService;

public class TestaGato {

	public static void main(String[] args) throws Exception {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			GatoService gatoservice = new GatoService();
			GatoDAO gatoDao = new GatoDAO(con);
			gatoDao.inserir("Mano", "Cinza", 4, "Gato");
			gatoDao.inserir("Branca", "Branca", 4, "Gato");
			gatoDao.inserir("Sofi", "Preto", 4, "Gato");

			List<Gato> lGato = gatoservice.listargatos();
			for (Gato gato : lGato) {
				System.out.println(gato.getNome());
			}
		}
	}
}