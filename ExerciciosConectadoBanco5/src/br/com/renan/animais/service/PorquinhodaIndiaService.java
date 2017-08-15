package br.com.renan.animais.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


import br.com.renan.animais.dao.PorquinhodaIndiaDAO;
import br.com.renan.animais.jdbc.ConnectionPoolOracle;
import br.com.renan.animais.model.PorquinhodaIndia;

public class PorquinhodaIndiaService {

	public static List<PorquinhodaIndia> listarPorquinhodaIndia() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new PorquinhodaIndiaDAO(con).lista();
		}

	
	}

	public List<PorquinhodaIndia> listar() {
		// TODO Auto-generated method stub
		return null;
	}
}
