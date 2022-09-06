package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProcessoSeletivoDAO implements IDAO {
	
	Connection con;
	ProcessoSeletivo pcsl;
	
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}


	public String inserir(Object obj) {
		pcsl = (ProcessoSeletivo) obj;
		String sql = "insert into T_LUP_PROCESSO_SELETIVO (ds_nome_vaga, ds_descricao_vaga, ds_area_vaga, ds_salario, "
				+ "ds_beneficios_vaga"
				+ "ds_modalidade_vaga, pcd_aplicavel, ts_desafio, qt_inscritos, md_sexo_inscritos)"
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, pcsl.getNomeVaga());
			ps.setString(2, pcsl.getDescricaoVaga());
			ps.setDouble(3, pcsl.getSalario());
			ps.setString(4, pcsl.getBeneficiosVaga());
			ps.setString(5, pcsl.getModalidadeVaga());
			ps.setString(6, pcsl.getPcdAplicavel());
			ps.setString(7, pcsl.getDesafio());
			ps.setInt(8, pcsl.getInscritos());
			ps.setString(9, pcsl.getMediaInscritos());
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
		String sql = "update T_LUP_PROCESSO_SELETIVO set ds_descricao_vaga = ?, ds_salario = ?, ds_beneficios_vaga = ?,"
				+ "ds_modalidade_vaga = ?, pcd_aplicavel = ?, ts_desafio = ?, qt_inscritos = ?, md_sexo_inscritos"
				+ "where id_vaga = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, pcsl.getDescricaoVaga());
			ps.setDouble(2, pcsl.getSalario());
			ps.setString(3, pcsl.getBeneficiosVaga());
			ps.setString(4, pcsl.getModalidadeVaga());
			ps.setString(5, pcsl.getPcdAplicavel());
			ps.setString(6, pcsl.getDesafio());
			ps.setInt(7, pcsl.getInscritos());
			ps.setString(8, pcsl.getNomeVaga());
			ps.setString(9, pcsl.getMediaInscritos());

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
			ps.setString(1, pcsl.getNomeVaga());
			if (ps.executeUpdate() > 0) {
				return "Processo Seletivo excluido com sucesso!";	
			} else {
				return "Processo Seletivo ao excluir o certificado!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String listarTodos() {
		String sql = "select * from T_LUP_PROCESSO_SELETIVO";
		String lista = "Lista de Processos Seletivos:\n\n";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					lista += "Nome da vaga: " + rs.getString(1) +".\n";
					lista += "Descrição da vaga: " + rs.getString(2) + ".\n";
					lista += "Salário: " + rs.getString(3) + ".\n";
					lista += "Beneficios: "  + rs.getString(4) + ".\n";
					lista += "Modalidade: " + rs.getString(5) + ".\n";
					lista += "PCD Aplicável: " + rs.getString(6) + ".\n";
					lista += "Desafio: "  + rs.getString(7) + ".\n";
					lista += "Quantidade de inscritos: "  + rs.getString(8) + ".\n";
					lista += "Media sexo inscritos: "  + rs.getString(9) + ".\n";
					lista += "-------------\n";
				}
				return lista;
			}else {
				return "Não há nenhum processo seletivo cadastrado!";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

}
