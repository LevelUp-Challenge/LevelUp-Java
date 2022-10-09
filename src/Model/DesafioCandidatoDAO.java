package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DesafioCandidatoDAO implements IDAO {
	Connection con;
	DesafioCandidato dc;
	
	

	public DesafioCandidatoDAO(Connection con) {
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
		dc = (DesafioCandidato) obj;
		String sql = "insert into T_LUP_DESAFIO_CANDIDATO (id_teste_vaga, ds_aprovacao, ds_pontuacao, ds_tempo_aplicacao, ds_aprovado)"
				+ "values (?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, dc.getIdDesafioCandidato());
			ps.setString(2, dc.getAprovacao());
			ps.setInt(3, dc.getPontuacao());
			ps.setString(4, dc.getTempoAplicacao());
			ps.setString(5, dc.getStatus());
		
			if (ps.executeUpdate() > 0) {
				return "Desafio do Candidato inserido com sucesso!";
			} else {
				return "Erro ao inserir Desafio do Candidato!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String alterar(Object obj) {
		dc = (DesafioCandidato) obj;
		String sql = "update T_LUP_DESAFIO_CANDIDATO set ds_aprovacao = ?, ds_pontuacao = ?, ds_tempo_aplicacao =?, ds_aprovado=? "
				+ "where id_teste_vaga = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, dc.getAprovacao());
			ps.setInt(2, dc.getPontuacao());
			ps.setString(3, dc.getTempoAplicacao());
			ps.setString(4, dc.getStatus());
			ps.setInt(5, dc.getIdDesafioCandidato());


			if (ps.executeUpdate() > 0) {
				return "Desafio do candidato alterado com sucesso!";
			} else {
				return "Erro ao alterar o desafio do Candidato!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String excluir(Object obj) {
		dc = (DesafioCandidato) obj;
		String sql = "delete from T_LUP_DESAFIO_CANDIDATO where id_teste_vaga  = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, dc.getIdDesafioCandidato());
			if (ps.executeUpdate() > 0) {
				return "Desafio do candidato excluido com sucesso!";
			} else {
				return "Erro ao deletar o Desafio do Candidato!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	public ArrayList<String> listar(int id) {
		String sql = "select * from t_lup_desafio_candidato where id_teste_vaga= ?";
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
