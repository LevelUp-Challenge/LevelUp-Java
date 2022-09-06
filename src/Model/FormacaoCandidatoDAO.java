package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FormacaoCandidatoDAO implements IDAO {
	
	private Connection con;
	private FormacaoCandidato fc;
	
	
	
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}	
	
	public String inserir(Object obj) {
		fc = (FormacaoCandidato) obj;
		String sql = "insert into T_LUP_FORMACAO_CANDIDATO (nm_formacao, ds_grau_formacao, dt_conclusao, dt_inicio)"
				+ "values (?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, fc.getNomeFormacao());
			ps.setString(2, fc.getGrauFormacao());
		} catch (SQLException e) {
			return e.getMessage();
		}
		return null;
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
