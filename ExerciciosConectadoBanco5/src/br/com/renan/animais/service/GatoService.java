package br.com.renan.animais.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.renan.animais.dao.GatoDAO;
import br.com.renan.animais.jdbc.ConnectionPoolOracle;
import br.com.renan.animais.model.Gato;

public class GatoService {
	
	public void inserir(Gato gato) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new GatoDAO(con).inserir(gato);
		}
	}
	
	public void alterar(Integer codigo, String nome) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new GatoDAO(con).alterar(codigo, nome);
		}
	}
	
	public void excluir(Integer codigo) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new GatoDAO(con).excluir(codigo);
		}
	}
	
	public List<Gato> listarGatos() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new GatoDAO(con).lista();
		}
	}
	
}
