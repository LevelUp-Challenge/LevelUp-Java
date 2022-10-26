package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CertificadosDAO implements IDAO {
	
	Connection con;
	Certificados c;
	
	public CertificadosDAO(Connection con) {
		setCon(con);

	}
	
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}

	public String inserir(Object obj) {
		c = (Certificados) obj;
		String sql = "insert into T_LUP_CERTIFICADOS (id_certificados, ds_certificados, ds_cursos)"
				+ "values (SQ_LUP_CERTIFICADOS.NEXTVAL,?,?)";
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
		String sql = "update T_LUP_CERTIFICADOS set ds_certificados = ?, ds_cursos = ?"
				+ "where id_certificados = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, c.getDescricao());
			ps.setString(2, c.getCurso());
			ps.setInt(3, c.getIdCertificados());
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
		String sql = "delete from T_LUP_CERTIFICADOS where id_certificados = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, c.getIdCertificados());
			if (ps.executeUpdate() > 0) {
				return "Certificado excluido com sucesso!";	
			} else {
				return "Erro ao excluir o certificado!";
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
				return result;
		
			}else {
				return null;
			}
			
		} catch (SQLException e) {
			return null;
		}

	}

}
