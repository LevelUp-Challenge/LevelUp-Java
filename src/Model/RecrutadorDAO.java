package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RecrutadorDAO implements IDAO {
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
		String sql = "insert into t_lup_recrutador (id_recrutador, nm_recrutador,"
				+ "ds_login, ds_senha, ds_areas_recrutamento) values(SQ_LUP_RECRUTADOR.NEXTVAL,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			//ps.setInt(1, recrutador.getId());
			ps.setString(1, recrutador.getNome());
			ps.setString(2, recrutador.getLogin());
			ps.setString(3, recrutador.getSenha());
			ps.setString(4, recrutador.getAreas_recrutamento());

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
		String sql = "update t_lup_recrutador set nm_recrutador = ?,ds_login = ?, ds_senha = ?, ds_areas_recrutamento = ?";
		sql += "where id_recrutador=?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, recrutador.getNome());
			ps.setString(2, recrutador.getLogin());
			ps.setString(3, recrutador.getSenha());
			ps.setString(4, recrutador.getAreas_recrutamento());
			ps.setInt(5, recrutador.getId());

			if (ps.executeUpdate() > 0) {
				return "Alterado com sucesso!";
			} else {
				return "Erro ao Alterar!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String excluir(Object obj) {
		recrutador = (Recrutador) obj;
		String sql = "delete from t_lup_recrutador where id_recrutador = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, recrutador.getId());

			if (ps.executeUpdate() > 0) {
				return "deletado com sucesso!";
			} else {
				return "Erro ao deletar!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public ArrayList<String> listar(int id) {
		String sql = "select * from t_lup_recrutador where id_recrutador = ?";
		ArrayList<String> result = new ArrayList<String>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				result.add(rs.getString(1));
				result.add(rs.getString(2));		
				result.add(rs.getString(3));		
				result.add(rs.getString(4));		
				result.add(rs.getString(5));		
				return result;
		
			}else {
				return null;
			}
			
		} catch (SQLException e) {
			return null;
		}

	}

	

}
