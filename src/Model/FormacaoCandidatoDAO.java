package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FormacaoCandidatoDAO implements IDAO {
	
	private Connection con;
	private FormacaoCandidato fc;
	
	
	
	public FormacaoCandidatoDAO(Connection con) {
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
		fc = (FormacaoCandidato) obj;
		String sql = "insert into T_LUP_FORMACAO_CANDIDATO (id_formacao_candidato, tp_formacao, ds_status_formacao)"
				+ "values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, fc.getIdFormacao());
			ps.setString(2, fc.getTpFormacao());
			ps.setString(3, fc.getStatus());
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
		
		return null;
	}
	public String excluir(Object obj) {

		return null;
	}
	public String listarTodos() {

		return null;
	}

}
