package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CandidatoDAO implements IDAO {
	private Connection con;
	private Candidato candidato;
	
	
	public CandidatoDAO(Connection con) {
		setCon(con);

	}
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	
	public String inserir(Object obj) {
		candidato = (Candidato) obj;
		String sql = "insert into t_lup_candidato(id_candidato,nm_candidato,sx_candidato,dt_nascimento"
				+ "ds_email,nr_telefone,ds_login,ds_cpf,st_login,ds_senha,ds_perfil_candidato"
				+ "ds_biografia,ds_interesses) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, candidato.getId());
			ps.setString(2, candidato.getNome() );
			ps.setString(3, candidato.getSexo() );
			ps.setString(4, candidato.getIdade());
			ps.setString(5, candidato.getEmail());
			ps.setString(6, candidato.getTelefone());
			ps.setString(7, candidato.getLogin());
			ps.setInt(8, candidato.getCpf());
			ps.setString(9, candidato.getStatus());
			ps.setString(10, candidato.getSenha());
			ps.setString(11, candidato.getDadosPerfilCandidato());
			ps.setString(12, candidato.getBiografia());
			ps.setString(13, candidato.getInteressesCandidato());
			
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
		candidato = (Candidato) obj;

		String sql = "update t_lup_candidato set nm_candidato =?,sx_candidato=?,dt_nascimento=?"
				+ "ds_email =?,nr_telefone =?,ds_login =?,ds_cpf =?,st_login =?,ds_senha =?,ds_perfil_candidato =?"
				+ "ds_biografia,ds_intereses =?";
		sql += "where id_candidato = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, candidato.getNome() );
			ps.setString(2, candidato.getSexo() );
			ps.setString(3, candidato.getIdade());
			ps.setString(4, candidato.getEmail());
			ps.setString(5, candidato.getTelefone());
			ps.setInt(8, candidato.getCpf());
			ps.setString(7, candidato.getLogin());
			ps.setString(8, candidato.getSenha());
			ps.setString(9, candidato.getStatus());
			ps.setString(10, candidato.getDadosPerfilCandidato());
			ps.setString(11, candidato.getBiografia());
			ps.setString(12, candidato.getInteressesCandidato());
			ps.setInt(13, candidato.getId() );
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
		candidato = (Candidato) obj;

		String sql = "delete from t_lup_candidato where id_candidato = ?";

		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, candidato.getId() );
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso!";
			} else {
				return "Erro ao Deletar!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public ArrayList<String> listar(int id) {
		String sql = "select * from t_lup_certificados where id_certificados = ?";
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
				result.add(rs.getString(7));		
				result.add(rs.getString(8));		
				result.add(rs.getString(9));		
				result.add(rs.getString(10));		
				result.add(rs.getString(11));		
				result.add(rs.getString(12));		
				result.add(rs.getString(13));		
				return result;
		
			}else {
				return null;
			}
			
		} catch (SQLException e) {
			return null;
		}

	}
	
	
	
	

}
