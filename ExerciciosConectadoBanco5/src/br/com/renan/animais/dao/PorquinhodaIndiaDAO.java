package br.com.renan.animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.renan.animais.model.PorquinhodaIndia;

public class PorquinhodaIndiaDAO {

	private final Connection conn;

	public PorquinhodaIndiaDAO(Connection con) {
		this.conn = con;
	}

	public boolean inserir(PorquinhodaIndia PorquinhodaIndia) throws SQLException {
		String sql = "INSERT INTO PorquinhodaIndia (ANI_CODIGO, ANI_NOME, ANI_COR, ANI_QTDPATAS, ANI_GRUPO, ANI_SOM) VALUES (SEQ_PORQUINHODAINDIA.nextval, ?,?,?,?,?)";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, PorquinhodaIndia.getNome());
		statement.setString(2, PorquinhodaIndia.getCor());
		statement.setInt(3, PorquinhodaIndia.getQtdPatas());
		statement.setString(4, PorquinhodaIndia.getGrupo());

		return statement.executeUpdate() > 0;
	}

	public boolean alterar(Integer codigo, String nome) throws SQLException {
		String sql = "UPDATE ANI_NOME SET ANI_NOME = ? WHERE ANI_CODIGO = ?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, codigo);

		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(Integer codigo) throws SQLException{
		String sql = "DELETE PorquinhodaIndia WHERE ANI_CODIGO = ?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}

	public List<PorquinhodaIndia> lista() throws SQLException {
		List<PorquinhodaIndia> lPorquinhodaIndia = new ArrayList<>();
		String sql = "Select * from PorquinhodaIndia";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("ANI_CODIGO");
					String nome = rs.getString("ANI_NOME");
					String cor = rs.getString("ANI_COR");
					int qtdPatas = rs.getInt("ANI_QTDPATAS");
					String grupo = rs.getString("ANI_GRUPO");
					String som = rs.getString("ANI_SOM");
					lPorquinhodaIndia.add(new PorquinhodaIndia(codigo, nome, cor, qtdPatas, grupo, som));
				}
			}

		}
		return lPorquinhodaIndia;

	}

}
