package br.com.renan.animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.renan.animais.model.Cachorro;
import br.com.renan.animais.model.Gato;

public class GatoDAO {

	private final Connection conn;	
	
	public GatoDAO(Connection con) {
		this.conn = con;
	}

	public boolean inserir(Gato gato) throws SQLException {
		String sql = "INSERT INTO GATO (ANI_CODIGO, ANI_NOME, ANI_COR, ANI_QTDPATAS, ANI_GRUPO, ANI_SOM) VALUES (SEQ_GATO.nextval, ?,?,?,?,?)";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, gato.getNome());
		statement.setString(2, gato.getCor());
		statement.setInt(3, gato.getQtdPatas());
		statement.setString(4, gato.getGrupo());
		
		return statement.executeUpdate() > 0;
	}

	public boolean alterar(Integer codigo, String nome) throws SQLException {
		String sql = "UPDATE GATO SET ANI_NOME = ? WHERE ANI_CODIGO = ?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, codigo);

		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(Integer codigo) throws SQLException {
		String sql = "DELETE GATO WHERE ANI_CODIGO = ?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);

		return statement.executeUpdate() > 0;
	}

	
	public List<Gato> lista() throws SQLException {
		List<Gato> lGato = new ArrayList<>();
		String sql = "Select * from GATO";
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
					Gato gato = new Gato(codigo, nome, cor, qtdPatas, grupo, som);
					lGato.add(gato);
					
				}
			}

		}
		return lGato;

	}

}
