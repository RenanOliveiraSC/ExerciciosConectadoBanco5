package br.com.renan.animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.renan.animais.model.PorquinhodaIndia;

public class PorquinhodaIndiaDAO {

	private Connection con;

	public PorquinhodaIndiaDAO(Connection con2) {
		// TODO Auto-generated constructor stub
	}

	public void Animal(Connection con) {
		this.con = con;
	}

	public boolean inserir(String nome, String cor, int qtdpatas, String grupo) throws SQLException {
		String sql = "INSERT INTO ANIMAL (ANI_CODIGO, ANI_NOME, ANI_COR, ANI_QTDPATAS, ANI_GRUPO, ANI_SOM) VALUES (SEQ_PORQUINHODAINDIA.nextval, ?,?,?,?)";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setString(2, cor);
		statement.setInt(3, qtdpatas);
		statement.setString(4, grupo);

		return statement.executeUpdate() > 0;
	}

	public List<PorquinhodaIndia> lista() throws SQLException {
		List<PorquinhodaIndia> lPorquinhodaIndia = new ArrayList<>();
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
					lPorquinhodaIndia.add(new PorquinhodaIndia(codigo, nome, cor, qtdPatas, grupo, retornaSom));
				}
			}

		}
		return lPorquinhodaIndia;

	}

}
