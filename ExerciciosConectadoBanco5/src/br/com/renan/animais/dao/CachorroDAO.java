package br.com.renan.animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.renan.animais.model.Cachorro;

public class CachorroDAO {

	private final Connection con;

	public CachorroDAO(Connection con) {
		this.con = con;

	}

	public boolean inserir(Cachorro cachorro) throws SQLException {
		String sql = "INSERT INTO CACHORRO (ANI_CODIGO, ANI_NOME, ANI_COR, ANI_QTDPATAS, ANI_GRUPO, ANI_SOM) VALUES (SEQ_CACHORRO.nextval, ?,?,?,?,?)";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, cachorro.getNome());
		statement.setString(2, cachorro.getCor());
		statement.setInt(3, cachorro.getQtdPatas());
		statement.setString(4, cachorro.getGrupo());
		statement.setString(4, cachorro.getSom());
		
		return statement.executeUpdate() > 0;
	}

	public boolean alterar(Integer codigo, String nome) throws SQLException{
		String sql = "UPDATE CACHORRO SET CAC_NOME = ? WHERE CAC_CODIGO = ?";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, codigo);
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(Integer codigo) throws SQLException{
		String sql = "DELETE CACHORRO WHERE CAC_CODIGO = ?";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}
	
	public List<Cachorro> lista() throws SQLException {
		List<Cachorro> lCachorro = new ArrayList<>();
		String sql = "Select * from CACHORRO";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("ANI_CODIGO");
					String nome = rs.getString("ANI_NOME");
					String cor = rs.getString("ANI_COR");
					int qtdPatas = rs.getInt("ANI_QTDPATAS");
					String grupo = rs.getString("ANI_GRUPO");
					String retornaSom = rs.getString("ANI_SOM");
					lCachorro.add(new Cachorro(codigo, nome, cor, qtdPatas, grupo, retornaSom));
				}
			}

		}
		return lCachorro;
	}
}