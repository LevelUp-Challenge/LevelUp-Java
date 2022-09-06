package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DesafioCandidatoDAO implements IDAO {
	Connection con;
	DesafioCandidato dc;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public String inserir(Object obj) {
		dc = (DesafioCandidato) obj;
		String sql = "insert into T_LUP_DESAFIO_CANDIDATO (ds_aprovacao, ds_pontuacao, ds_tempo_aplicacao)"
				+ "values (?, ?, ?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, dc.getStatus());
			ps.setInt(2, dc.getPontuacao());
			ps.setString(3, dc.getTempoAplicacao());
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
		String sql = "update T_LUP_DESAFIO_CANDIDATO set ds_aprovacao = ?, ds_tempo_aplicacao = ? "
				+ "where ds_pontuacao = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, dc.getStatus());
			ps.setString(2, dc.getTempoAplicacao());
			ps.setInt(3, dc.getPontuacao());
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
		String sql = "delete from T_LUP_DESAFIO_CANDIDATO where ds_pontuacao = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, dc.getPontuacao());
			if (ps.executeUpdate() > 0) {
				return "Desafio do candidato excluido com sucesso!";
			} else {
				return "Erro ao deletar o Desafio do Candidato!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String listarTodos() {
		String lista = "Lista de Certificados:\\n\\n";
		String sql = "select * from T_LUP_DESAFIO_CANDIDATO";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					lista += "Status: " + rs.getString(1) + ".\n";
					lista += "Pontuação: " + rs.getInt(2) + ".\n";
					lista += "Tempo de duração" + rs.getString(3) +".\n";
					lista += "-------------\n";
				}
				return lista;
			} else {
				return lista + "Nenhum dado encontrado!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

}
