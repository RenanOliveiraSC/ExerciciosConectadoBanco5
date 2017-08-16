package br.com.renan.animais.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


import br.com.renan.animais.dao.PorquinhodaIndiaDAO;
import br.com.renan.animais.jdbc.ConnectionPoolOracle;
import br.com.renan.animais.model.PorquinhodaIndia;

public class PorquinhodaIndiaService {

	public void inserir(PorquinhodaIndia PorquinhodaIndia) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new PorquinhodaIndiaDAO(con).inserir(PorquinhodaIndia);
		}
	}
	
	public void alterar(Integer codigo, String nome) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new PorquinhodaIndiaDAO(con).alterar(codigo, nome);
		}
	}
	
	public void excluir(Integer codigo) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new PorquinhodaIndiaDAO(con).excluir(codigo);
		}
	}
	
	public List<PorquinhodaIndia> listarPorquinhosDaIndia() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new PorquinhodaIndiaDAO(con).lista();
		}
	}
	
}

