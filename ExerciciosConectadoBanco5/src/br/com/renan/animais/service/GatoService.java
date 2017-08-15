package br.com.renan.animais.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.renan.animais.dao.GatoDAO;
import br.com.renan.animais.jdbc.ConnectionPoolOracle;
import br.com.renan.animais.model.Gato;

public class GatoService {
	public List<Gato> listargatos() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new GatoDAO(con).lista();
		}
	
	}
}