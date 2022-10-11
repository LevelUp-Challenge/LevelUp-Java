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
		String sql = "insert into T_LUP_PROCESSO_SELETIVO (id_vaga, ds_nome_vaga, ds_descricao_vaga, ds_area_vaga, ds_salario, "
				+ "ds_beneficios_vaga, "
				+ "ds_modalidade_vaga, pcd_aplicavel, ts_desafio, qt_inscritos, md_sexo_inscritos)"
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, pcsl.getId());
			ps.setString(2, pcsl.getNomeVaga());
			ps.setString(3, pcsl.getDescricaoVaga());
			ps.setString(4, pcsl.getAreaVaga());
			ps.setDouble(5, pcsl.getSalario());
			ps.setString(6, pcsl.getBeneficiosVaga());
			ps.setString(7, pcsl.getModalidadeVaga());
			ps.setString(8, pcsl.getPcdAplicavel());
			ps.setString(9, pcsl.getDesafio());
			ps.setInt(10, pcsl.getInscritos());
			ps.setString(11, pcsl.getMediaInscritos());
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
		String sql = "update T_LUP_PROCESSO_SELETIVO set ds_nome_vaga =?, ds_descricao_vaga=?, ds_area_vaga=?, ds_salario=?,"
				+ "ds_beneficios_vaga=?, "
				+ "ds_modalidade_vaga=?, pcd_aplicavel=?, ts_desafio=?, qt_inscritos=?, md_sexo_inscritos=?"
				+ "where id_vaga = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, pcsl.getNomeVaga());
			ps.setString(2, pcsl.getDescricaoVaga());
			ps.setString(3, pcsl.getAreaVaga());
			ps.setDouble(4, pcsl.getSalario());
			ps.setString(5, pcsl.getBeneficiosVaga());
			ps.setString(6, pcsl.getModalidadeVaga());
			ps.setString(7, pcsl.getPcdAplicavel());
			ps.setString(8, pcsl.getDesafio());
			ps.setInt(9, pcsl.getInscritos());
			ps.setString(10, pcsl.getMediaInscritos());
			ps.setInt(11, pcsl.getId());

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
//					 listaVagas.add(rs.getString(1));
//					 listaVagas.add(rs.getString(2));
//					 listaVagas.add(rs.getString(3));
//					 listaVagas.add(rs.getString(4));
//					 listaVagas.add(rs.getString(5));
//					 listaVagas.add(rs.getString(6));
//					 listaVagas.add(rs.getString(7));
//					 listaVagas.add(rs.getString(8));
//					 listaVagas.add(rs.getString(9));
//					 listaVagas.add(rs.getString(10));
//					 listaVagas.add(rs.getString(11));
					 
				listaVagas += "Id Vaga: " + rs.getString(1) + "\n\n";
				listaVagas += "Nome Vaga: " + rs.getString(2) + "\n\n";
				listaVagas += "Descricao Vaga: " + rs.getString(3) + "\n\n";
				listaVagas += "Area Vaga: " + rs.getString(4) + "\n\n";
				listaVagas += "Salario Vaga: " + rs.getString(5) + "\n\n";
				listaVagas += "Beneficios Vaga: " + rs.getString(6) + "\n\n";
				listaVagas += "Modalidade Vaga: " + rs.getString(7) + "\n\n";
				listaVagas += "PCD Vaga: " + rs.getString(8) + "\n\n";
				listaVagas += "Desafio Vaga: " + rs.getString(9) + "\n\n";
				listaVagas += "Quantidade inscritos Vaga: " + rs.getString(10) + "\n\n";
				listaVagas += "Media de inscritos Vaga: " + rs.getString(1) + "\n\n";
				 }
				 return listaVagas;
				
				
			
		
			}else {
				return null;
			}
			
		} catch (SQLException e) {
			return null;
		}
		
	}

	public ArrayList<String> listar(int id) {
		String sql = "select * from T_LUP_PROCESSO_SELETIVO where id_vaga = ?";
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
				result.add(rs.getString(7));		
				result.add(rs.getString(8));		
				result.add(rs.getString(9));		
				result.add(rs.getString(10));		
				result.add(rs.getString(11));		
				return result;
		
			}else {
				return null;
			}
			
		} catch (SQLException e) {
			return null;
		}

	}

}
