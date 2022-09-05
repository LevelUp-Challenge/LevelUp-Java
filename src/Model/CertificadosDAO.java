package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CertificadosDAO implements IDAO {
	
	Connection con;
	Certificados c;
	
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}

	public String inserir(Object obj) {
		c = (Certificados) obj;
		String sql = "insert into T_LUP_CERTIFICADOS (ds_descricao, nm_curso)"
				+ "values (?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, c.getDescricao());
			ps.setString(2, c.getCurso());
			if (ps.executeUpdate() > 0) {
				return "Certificado inserido com sucesso!";
			} else {
				return "Erro ao inserir o certificado!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}


	public String alterar(Object obj) {
		c = (Certificados) obj;
		String sql = "update T_LUP_CERTIFICADOS set ds_descricao = ?"
				+ "where nm_curso = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, c.getDescricao());
			ps.setString(2, c.getCurso());
			if (ps.executeUpdate() > 0) {
				return "Descrição do certificado alterado com sucesso!";
			} else {
				return "Erro ao atualizar a descrição do certificado!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}


	public String excluir(Object obj) {
		c = (Certificados) obj;
		String sql = "delete from T_LUP_CERTIFICADOS where nm_curso = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, c.getCurso());
			if (ps.executeUpdate() > 0) {
				return "Certificado excluido com sucesso!";	
			} else {
				return "Erro ao excluir o certificado!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}


	public String listarTodos() {
		String sql = "select * from T_LUP_CERTIFICADOS";
		String lista = "Lista de Certificados:\n\n";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					lista += "Nome do curso: " + rs.getString(1) +".\n";
					lista += "Descrição do curso: " + rs.getString(2) + ".\n";
					lista += "-------------\n";
				}
				return lista;
			}else {
				return "Não há nenhum certificado cadastrado!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

}
