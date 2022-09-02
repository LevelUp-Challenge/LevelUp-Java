package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
				+ "ds_email, nr_telefone, ds_cpf, ds_login, ds_senha, ds_ativo, ds_perfil_candidato"
				+ "ds_biografia, ds_interesses) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, candidato.getId() );
			ps.setString(2, candidato.getNome() );
			ps.setString(3, candidato.getSexo() );
			ps.setString(4, candidato.getIdade());
			ps.setString(5, candidato.getEmail());
			ps.setInt(6, candidato.getTelefone());
			ps.setInt(7, candidato.getCpf());
			ps.setString(8, candidato.getLogin());
			ps.setString(8, candidato.getSenha());
			ps.setString(9, candidato.getStatus());
			ps.setString(10, candidato.getDadosPerfilCandidato());
			ps.setString(11, candidato.getBiografia());
			ps.setString(12, candidato.getInteressesCandidato());
			
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

		String sql = "update candidato set nm_candidato = ?,sx_candidato = ?,dt_nascimento = ?,"
				+ "ds_email = ?, nr_telefone = ?, ds_cpf = ?, ds_login = ?, ds_senha = ?,"
				+ " ds_ativo = ?, ds_perfil_candidato = ?, ds_biografia, ds_interesses = ?";
		sql += "where id_candidato = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, candidato.getNome() );
			ps.setString(2, candidato.getSexo() );
			ps.setString(3, candidato.getIdade());
			ps.setString(4, candidato.getEmail());
			ps.setInt(5, candidato.getTelefone());
			ps.setInt(6, candidato.getCpf());
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

		String sql = "delete from candidato where id_candidato = ?";

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
	
	public String listarTodos() {
		String sql = "select * from candidato";
		String listacandidato = "Lista dos Candidatos\n\n";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {

					listacandidato += "id candidato: " + rs.getInt(1) + "\n";
					listacandidato += "Nome candidato: " + rs.getString(2) + "\n";
					listacandidato += "Sexo candidato: " + rs.getString(3) + "\n";
					listacandidato += "Data de Nascimento: " + rs.getString(4) + "\n";
					listacandidato += "Email: " + rs.getString(5) + "\n";
					listacandidato += "Telefone: " + rs.getInt(6) + "\n";
					listacandidato += "CPF: " + rs.getInt(7) + "\n";
					listacandidato += "Login: " + rs.getString(8) + "\n";
					listacandidato += "Senha: " + rs.getString(9) + "\n";
					listacandidato += "Status: " + rs.getString(10) + "\n";
					listacandidato += "Dados complementares perfil: " + rs.getString(11) + "\n";
					listacandidato += "Dados biografia: " + rs.getString(12) + "\n";
					listacandidato += "Dados Interesses: " + rs.getString(13) + "\n";
					listacandidato += "\n--------------------------------------\n";

				}
				return listacandidato;

			} else {
				return null;
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	

}
