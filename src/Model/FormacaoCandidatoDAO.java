package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FormacaoCandidatoDAO implements IDAO {
	
	private Connection con;
	private FormacaoCandidato fc;
	
	
	
	public FormacaoCandidatoDAO(Connection con) {
		super();
		this.con = con;
	}
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}	
	
	public String inserir(Object obj) {
		fc = (FormacaoCandidato) obj;
		String sql = "insert into T_LUP_FORMACAO_CANDIDATO (id_formacao_candidato, tp_formacao, ds_status_formacao)"
				+ "values (SQ_LUP_FORMACAO_CANDIDATO.NEXTVAL,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			//ps.setInt(1, fc.getIdFormacao());
			ps.setString(1, fc.getTpFormacao());
			ps.setString(2, fc.getStatus());
			if (ps.executeUpdate() > 0) {
				return "inserido com sucesso!";
			} else {
				return "Erro ao inserir!";
			}
			
			
			
		} catch (SQLException e) {
			return e.getMessage();
		}

	}
	public String alterar(Object obj) {
		fc = (FormacaoCandidato) obj;
		String sql = "update T_LUP_FORMACAO_CANDIDATO set tp_formacao =?, ds_status_formacao =?";
		sql+= "where id_formacao_candidato =?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, fc.getTpFormacao());
			ps.setString(2, fc.getStatus());
			ps.setInt(3, fc.getIdFormacao());
			if (ps.executeUpdate() > 0) {
				return "inserido com sucesso!";
			} else {
				return "Erro ao inserir!";
			}
			
			
		} catch (SQLException e) {
			return e.getMessage();
		}

		
		
	}
	public String excluir(Object obj) {
		fc = (FormacaoCandidato) obj;
		String sql = "delete from T_LUP_FORMACAO_CANDIDATO where id_formacao_candidato = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, fc.getIdFormacao());
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
		String sql = "select * from T_LUP_FORMACAO_CANDIDATO where id_formacao_candidato = ?";
		ArrayList<String> result = new ArrayList<String>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				result.add(rs.getString(1));
				result.add(rs.getString(2));		
				result.add(rs.getString(3));		
				return result;
		
			}else {
				return null;
			}
			
		} catch (SQLException e) {
			return null;
		}

	}
	

}
