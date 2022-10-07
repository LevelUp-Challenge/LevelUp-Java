package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class FormacaoDAO {
	private Connection con;
	Formacao fc = new Formacao();
	

	public FormacaoDAO(Connection con) {
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

			
		fc = (Formacao) obj;
		String sql = "insert into T_LUP_FORMACAO (id_curriculo, ds_grau_formacao, "
				+ "dt_conclusao, dt_inicio, nm_formacao, nm_instituicao)"
				+ "values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, fc.getId());
			ps.setString(2, fc.getGrauFormacao());
			ps.setString(3, fc.getDtTermino());
			ps.setString(4, fc.getDtInicio());
			ps.setString(5, fc.getNmFormacao());
			ps.setString(6, fc.getNmInstituicao());
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
