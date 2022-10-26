package Controller;

import java.sql.Connection;
import java.util.ArrayList;

import Model.Certificados;
import Model.CertificadosDAO;
import Model.Conexao;

public class CertificadosController {
	
	public String cadastrarCertificados(String certificados, String cursos ) {
		String resultado;
		
		Certificados cer = new Certificados();
		Connection con = Conexao.abrirConexao();
		CertificadosDAO cerdao = new CertificadosDAO(con);
		cer.setCurso(cursos);
		cer.setDescricao(certificados);;
		
		resultado = cerdao.inserir(cer);
		Conexao.fecharConexao(con);
		return resultado;
		
	}
	
	public String alterarCertificados(int id, String certificados, String cursos ) {
String resultado;
		
		Certificados cer = new Certificados();
		Connection con = Conexao.abrirConexao();
		CertificadosDAO cerdao = new CertificadosDAO(con);
		cer.setIdCertificados(id);
		cer.setCurso(cursos);
		cer.setDescricao(certificados);;
		
		resultado = cerdao.alterar(cer);
		Conexao.fecharConexao(con);
		return resultado;
		
	}
	public String deletarCertificados(int id) {
		String resultado;		
				Certificados cer = new Certificados();
				Connection con = Conexao.abrirConexao();
				CertificadosDAO cerdao = new CertificadosDAO(con);
				cer.setIdCertificados(id);
				
				resultado = cerdao.excluir(cer);
				Conexao.fecharConexao(con);
				return resultado;			
			}
	public ArrayList<String> listarCertificados(int id) {
		ArrayList<String> resultado = new ArrayList<String>();
		Connection con = Conexao.abrirConexao();
		CertificadosDAO cerdao = new CertificadosDAO(con);
		resultado = cerdao.listar(id);
		Conexao.fecharConexao(con);
		if (resultado != null) {
			return resultado;
			
		}else {
			return null;
		}
		
		
		
	}

}
