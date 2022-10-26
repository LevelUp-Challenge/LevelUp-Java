package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProcessoSeletivoDAO implements IDAO {
	
	Connection con;
	ProcessoSeletivo pcsl;
	
	
	
	public ProcessoSeletivoDAO(Connection con) {
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
		pcsl = (ProcessoSeletivo) obj;
		String sql = "insert into T_LUP_PROCESSO_SELETIVO (id_vaga, ds_nome_vaga, ds_area_vaga, ds_salario, "
				+ "ds_beneficios_vaga, "
				+ "pcd_aplicavel, ts_desafio, qt_inscritos, md_sexo_inscritos)"
				+ "values (SQ_LUP_PROCESSO_SELETIVO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
	//		ps.setInt(1, pcsl.getId());
			ps.setString(1, pcsl.getNomeVaga());
			ps.setString(2, pcsl.getAreaVaga());
			ps.setDouble(3, pcsl.getSalario());
			ps.setString(4, pcsl.getBeneficiosVaga());
			ps.setString(5, pcsl.getPcdAplicavel());
			ps.setString(6, pcsl.getDesafio());
			ps.setInt(7, pcsl.getInscritos());
			ps.setString(8, pcsl.getMediaInscritos());
			if (ps.executeUpdate() > 0) {
				return "Processo seletivo inserido com sucesso!";
			} else {
				return "Erro ao inserir o processo seletivo!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String alterar(Object obj) {
		pcsl = (ProcessoSeletivo) obj;
		String sql = "update T_LUP_PROCESSO_SELETIVO set ds_nome_vaga =?, ds_area_vaga=?, ds_salario=?,"
				+ "ds_beneficios=?, "
				+ "pcd_aplicavel=?, ts_desafio=?, qt_inscritos=?, md_sexo_inscritos=?"
				+ "where id_vaga = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, pcsl.getNomeVaga());
			ps.setString(2, pcsl.getAreaVaga());
			ps.setDouble(3, pcsl.getSalario());
			ps.setString(4, pcsl.getBeneficiosVaga());
			ps.setString(5, pcsl.getPcdAplicavel());
			ps.setString(6, pcsl.getDesafio());
			ps.setInt(7, pcsl.getInscritos());
			ps.setString(8, pcsl.getMediaInscritos());
			ps.setInt(9, pcsl.getId());

			if (ps.executeUpdate() > 0) {
				return "Processo seletivo alterado com sucesso!";
			} else {
				return "Erro ao alterar o processo seletivo!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String excluir(Object obj) {
		pcsl = (ProcessoSeletivo) obj;
		String sql = "delete from T_LUP_PROCESSO_SELETIVO where id_vaga = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, pcsl.getId());
			if (ps.executeUpdate() > 0) {
				return "Processo Seletivo excluido com sucesso!";	
			} else {
				return "Processo Seletivo ao excluir o certificado!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String ListarTodos() {
		String sql = "select * from T_LUP_PROCESSO_SELETIVO ";
		String listaVagas = new String();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				 while (rs.next()) {
					 
				listaVagas += "Id Vaga: " + rs.getString(1) + "\n\n";
				listaVagas += "Nome Vaga: " + rs.getString(2) + "\n\n";
				listaVagas += "Area Vaga: " + rs.getString(3) + "\n\n";
				listaVagas += "Salario Vaga: " + rs.getString(4) + "\n\n";
				listaVagas += "Beneficios Vaga: " + rs.getString(5) + "\n\n";
				listaVagas += "PCD Vaga: " + rs.getString(6) + "\n\n";
				listaVagas += "Desafio Vaga: " + rs.getString(7) + "\n\n";
				listaVagas += "Quantidade de inscritos: " + rs.getString(8) + "\n\n";
				listaVagas += "Media de sexo: " + rs.getString(9) + "\n\n";
				 }
				 return listaVagas;
				
				
			
		
			}else {
				return null;
			}
			
		} catch (SQLException e) {
			return null;
		}
		
	}


}
