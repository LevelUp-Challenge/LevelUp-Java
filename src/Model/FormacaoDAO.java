package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class FormacaoDAO implements IDAO {
	private Connection con;
	Formacao fc = new Formacao();
	

	public FormacaoDAO(Connection con) {
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
		fc = (Formacao) obj;
		String sql = "insert into T_LUP_FORMACAO (id_curriculo, ds_grau_formacao, "
				+ "dt_conclusao, dt_inicio, nm_formacao, nm_instituicao)"
				+ "values (SQ_LUP_FORMACAO.NEXTVAL,?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			//ps.setInt(1, fc.getId());
			ps.setString(1, fc.getGrauFormacao());
			ps.setString(2, fc.getDtTermino());
			ps.setString(3, fc.getDtInicio());
			ps.setString(4, fc.getNmFormacao());
			ps.setString(5, fc.getNmInstituicao());
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
		fc = (Formacao) obj;
		String sql = "update T_LUP_FORMACAO set ds_grau_formacao =?, "
				+ "dt_conclusao =?, dt_inicio =?, nm_formacao =?, nm_instituicao =?";
		sql += "where id_curriculo =?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, fc.getGrauFormacao());
			ps.setString(2, fc.getDtTermino());
			ps.setString(3, fc.getDtInicio());
			ps.setString(4, fc.getNmFormacao());
			ps.setString(5, fc.getNmInstituicao());
			ps.setInt(6, fc.getId());
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
		String sql = "delete T_LUP_FORMACAO where id_curriculo =?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, fc.getId());
			if (ps.executeUpdate() > 0) {
				return "inserido com sucesso!";
			} else {
				return "Erro ao inserir!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
		
	}
	public ArrayList<String> listar(int id) {
		String sql = "select * from T_LUP_FORMACAO where id_curriculo =?";
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
				result.add(rs.getString(6));		
				return result;
		
			}else {
				return null;
			}
			
		} catch (SQLException e) {
			return null;
		}

	}
	
	
	
	

}
