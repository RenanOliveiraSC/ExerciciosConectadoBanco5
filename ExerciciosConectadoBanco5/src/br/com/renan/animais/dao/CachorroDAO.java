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

	public boolean inserir(String nome, String cor, int qtdpatas, String grupo) throws SQLException {
		String sql = "INSERT INTO ANIMAL (ANI_CODIGO, ANI_NOME, ANI_COR, ANI_QTDPATAS, ANI_GRUPO, ANI_SOM) VALUES (SEQ_CACHORRO.nextval, ?,?,?,?)";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setString(2, cor);
		statement.setInt(3, qtdpatas);
		statement.setString(4, grupo);

		return statement.executeUpdate() > 0;
	}

	public List<Cachorro> lista() throws SQLException {
		List<Cachorro> lCachorro = new ArrayList<>();
		String sql = "Select * from ANIMAL";
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