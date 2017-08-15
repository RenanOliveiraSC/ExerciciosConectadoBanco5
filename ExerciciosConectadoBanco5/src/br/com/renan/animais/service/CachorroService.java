package br.com.renan.animais.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.renan.animais.dao.CachorroDAO;
import br.com.renan.animais.jdbc.ConnectionPoolOracle;
import br.com.renan.animais.model.Cachorro;

public class CachorroService {

	public List<Cachorro> listarcachorros() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new CachorroDAO(con).lista();
		}

	}
}