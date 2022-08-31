package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RecrutadorDAO {
	private Connection con;
	private Recrutador recrutador;
	
	
	public RecrutadorDAO(Connection con) {
		setCon(con);
	}


	public Connection getCon() {
		return con;
	}


	public void setCon(Connection con) {
		this.con = con;
	}
	
	public String inserir(Object obj) {
		recrutador = (Recrutador) obj;
		String sql = "insert into recrutador(id_recrutador,nm_recrutador"
				+ "ds_login, ds_senha, ds_ares_recrutamento, ds_ativo values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, recrutador.getId() );
			ps.setString(2, recrutador.getNome() );
			ps.setString(3, recrutador.getLogin());
			ps.setString(4, recrutador.getSenha());
			ps.setString(5, recrutador.getAreas_recrutamento());
			ps.setString(6, recrutador.getStatus());
			

			
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso!";
			} else {
				return "Erro ao Inserir!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}


public String alterar(Object obj) {
	recrutador = (Recrutador) obj;
	String sql = "update recrutador set nm_recrutador = ?,ds_login = ?, ds_senha = ?, ds_ares_recrutamento = ?, ds_ativo = ?";
	sql += "where id_recrutador=?";
	try {
		PreparedStatement ps = getCon().prepareStatement(sql);
		ps.setString(1, recrutador.getNome() );
		ps.setString(2, recrutador.getLogin());
		ps.setString(3, recrutador.getSenha());
		ps.setString(4, recrutador.getAreas_recrutamento());
		ps.setString(5, recrutador.getStatus());
		ps.setInt(6, recrutador.getId() );
		

		
		if (ps.executeUpdate() > 0) {
			return "Alterado com sucesso!";
		} else {
			return "Erro ao Alterar!";
		}
	} catch (SQLException e) {
		return e.getMessage();
	}
}


public String deletar(Object obj) {
	recrutador = (Recrutador) obj;
	String sql = "delete from recrutador where codigo = ?";
	sql += "where id_recrutador=?";
	try {
		PreparedStatement ps = getCon().prepareStatement(sql);
		ps.setInt(1, recrutador.getId() );
	
		

		
		if (ps.executeUpdate() > 0) {
			return "deletado com sucesso!";
		} else {
			return "Erro ao deletar!";
		}
	} catch (SQLException e) {
		return e.getMessage();
	}
}

}
