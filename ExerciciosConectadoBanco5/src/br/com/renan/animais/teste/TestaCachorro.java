package br.com.renan.animais.teste;

import java.sql.Connection;
import java.util.List;

import br.com.renan.animais.dao.CachorroDAO;
import br.com.renan.animais.jdbc.ConnectionPoolOracle;
import br.com.renan.animais.model.Cachorro;
import br.com.renan.animais.service.CachorroService;

public class TestaCachorro {

	public static void main(String[] args) throws Exception {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			//CachorroService cachorroService = new CachorroService();
			CachorroDAO cachorroDao = new CachorroDAO(con);
			cachorroDao.inserir("Marvin", "Marron", 4, "Cachorro");
			cachorroDao.inserir("Bob", "Branco", 2, "Cachorro");
			cachorroDao.inserir("Mel", "Cinza", 4, "Cachorro");
			cachorroDao.inserir("Belinha", "Preta", 4, "Cachorro");

			List<Cachorro> lcachorro = cachorroService.listarcachorros();
			for (Cachorro cachorro : lcachorro) {
				System.out.println(cachorro.getNome());

			}
		}

	}
}
