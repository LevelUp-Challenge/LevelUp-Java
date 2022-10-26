package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EnderecoCandidatoDAO implements IDAO {
	Connection con;
	EnderecoCandidato ecdao;

	public EnderecoCandidatoDAO(Connection con) {
		setCon(con);

	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public String inserir(Object obj) {
		ecdao = (EnderecoCandidato) obj;
		String sql = "insert into t_lup_endereco" + "(id_endereco," + " nm_bairro," + " ds_logradouro," + " nm_estado,"
				+ " nm_cidade," + " nr_cep," + " ds_complemento)" + " values(SQ_LUP_ENDERECO.NEXTVAL,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, ecdao.getBairro());
			ps.setString(2, ecdao.getLogradouro());
			ps.setString(3, ecdao.getEstado());
			ps.setString(4, ecdao.getCidade());
			ps.setInt(5, ecdao.getCep());
			ps.setString(6, ecdao.getComplemento());
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
		ecdao = (EnderecoCandidato) obj;
		String sql = "update t_lup_endereco set" + " nm_bairro =?," + " ds_logradouro=?," + " nm_estado=?,"
				+ " nm_cidade=?," + " nr_cep=?," + " ds_complemento=?";
		sql += "where id_endereco = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, ecdao.getBairro());
			ps.setString(2, ecdao.getLogradouro());
			ps.setString(3, ecdao.getEstado());
			ps.setString(4, ecdao.getCidade());
			ps.setInt(5, ecdao.getCep());
			ps.setString(6, ecdao.getComplemento());
			ps.setInt(10, ecdao.getId());
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
		ecdao = (EnderecoCandidato) obj;
		String sql = "delete from t_lup_endereco where id_endereco";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(10, ecdao.getId());

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
		String sql = "select * from t_lup_endereco where id_endereco = ?";
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

			} else {
				return null;
			}

		} catch (SQLException e) {
			return null;
		}

	}

}
