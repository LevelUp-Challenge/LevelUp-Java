package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnderecoCandidatoDAO {
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
		String sql = "insert into t_lup_endereco" + "(id_endereco, ds_bairro, ds_logradouro, ds_cidade, ds_cep"
				+ "ds_ponto_ref, nm_estado, sg_estado, nr_logradouro, "
				+ "ds_complemento_numero) values(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, ecdao.getIdEnderecoCandidato());
			ps.setString(2, ecdao.getDsBairro());
			ps.setString(3, ecdao.getDsLogradouro());
			ps.setString(4, ecdao.getDsCidade());
			ps.setInt(5, ecdao.getCep());
			ps.setString(6, ecdao.getPontoRef());
			ps.setString(7, ecdao.getEstado());
			ps.setString(8, ecdao.getSgEstado());
			ps.setInt(9, ecdao.getNrLogradouro());
			ps.setString(10, ecdao.getComplemento());
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
		String sql = "update t_lup_endereco set" + " ds_bairro = ?, ds_logradouro = ?, ds_cidade = ?, ds_cep = ?"
				+ "ds_ponto_ref = ?, nm_estado = ?, sg_estado = ?, nr_logradouro = ?, " + "ds_complemento_numero = ? ";
		sql += "where id_endereco = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, ecdao.getDsBairro());
			ps.setString(2, ecdao.getDsLogradouro());
			ps.setString(3, ecdao.getDsCidade());
			ps.setInt(4, ecdao.getCep());
			ps.setString(5, ecdao.getPontoRef());
			ps.setString(6, ecdao.getEstado());
			ps.setString(7, ecdao.getSgEstado());
			ps.setInt(8, ecdao.getNrLogradouro());
			ps.setString(9, ecdao.getComplemento());
			ps.setInt(10, ecdao.getIdEnderecoCandidato());
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
			ps.setInt(1, ecdao.getIdEnderecoCandidato());

			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso!";
			} else {
				return "Erro ao Deletar!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String listarTodos() {
		String sql = "select * from t_lup_endereco";
		String listaendcandidato = "Lista dos Endereços candidato:\n\n";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {

					listaendcandidato += "id candidato: " + rs.getInt(1) + "\n";
					listaendcandidato += "Bairro: " + rs.getString(2) + "\n";
					listaendcandidato += "Logradouro: " + rs.getString(3) + "\n";
					listaendcandidato += "Cidade: " + rs.getString(4) + "\n";
					listaendcandidato += "Cep: " + rs.getString(5) + "\n";
					listaendcandidato += "Ponto de referencia: " + rs.getString(6) + "\n";
					listaendcandidato += "Estado: " + rs.getString(7) + "\n";
					listaendcandidato += "Sigla estado: " + rs.getString(8) + "\n";
					listaendcandidato += "Logradouro: " + rs.getInt(9) + "\n";
					listaendcandidato += "Complemento: " + rs.getString(10) + "\n";
					listaendcandidato += "\n--------------------------------------\n";

				}
				return listaendcandidato;

			} else {
				return null;
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
}
