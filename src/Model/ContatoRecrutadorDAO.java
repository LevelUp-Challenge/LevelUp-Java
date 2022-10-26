package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContatoRecrutadorDAO implements IDAO {
	Connection con;
	ContatoRecrutador crdao;
	
	public ContatoRecrutadorDAO(Connection con) {
		setCon(con);

	}
	
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	
	public String inserir(Object obj) {
	crdao = (ContatoRecrutador) obj;

	String select = "SELECT SQ_LUP_RECRUTADOR.NEXTVAL FROM DUAL ";

	String sql = "insert into t_lup_contato_recrutador"
			+ "(id_contato, ds_emails, ds_telefone, ds_ddd, ds_ddi, id_recrutador) values(SQ_LUP_CONTATO_RECRUTADOR.NEXTVAL,?,?,?,?)";
			try {
				PreparedStatement ps = getCon().prepareStatement(select);				
				ps = getCon().prepareStatement(sql);
				ps.setString(1, crdao.getEmail() );
				ps.setInt(2, crdao.getTelefone());
				ps.setInt(3, crdao.getDdd());
				ps.setInt(4, crdao.getDdi());
				
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
		crdao = (ContatoRecrutador) obj;
		String sql = "update t_lup_contato_recrutador "
				+ "set ds_emails = ?, ds_telefone= ?, ds_ddd = ?, ds_ddi= ? ";
		sql += "where id_contato = ?";
		
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, crdao.getEmail() );
			ps.setInt(2, crdao.getTelefone());
			ps.setInt(3, crdao.getDdd());
			ps.setInt(4, crdao.getDdi());
			ps.setInt(5, crdao.getIdRecrutador());
			
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
		crdao = (ContatoRecrutador) obj;
		String sql = "delete from t_lup_contato_recrutador where id_contato = ?";

		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, crdao.getIdRecrutador());
			
			if (ps.executeUpdate() > 0) {
				return "Exluido com sucesso!";
			} else {
				return "Excluido ao Alterar!";
			}
			
			
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	public ArrayList<String> listar(int id) {
		String sql = "select * from t_lup_contato_recrutador where id_contato = ?";
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
	
	

