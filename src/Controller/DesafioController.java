package Controller;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.util.ArrayList;

import Model.Conexao;
import Model.ContatoRecrutadorDAO;
import Model.DesafioCandidato;
import Model.DesafioCandidatoDAO;

public class DesafioController {
	
	public String cadastroDesafio(int id,
			String dsAprovacao,
			int dsPontuacao,
			String tempo,
			String statusAprovacao) {
	String resultado;
	Connection con = Conexao.abrirConexao();
	DesafioCandidato dc = new DesafioCandidato();
	DesafioCandidatoDAO dcdao = new DesafioCandidatoDAO(con);
	dc.setIdDesafioCandidato(id);
	dc.setPontuacao(dsPontuacao);
	dc.setStatus(statusAprovacao);
	dc.setAprovacao(dsAprovacao);
	dc.setTempoAplicacao(tempo);
	
	resultado = dcdao.inserir(dc);
	Conexao.fecharConexao(con);
	return resultado;

	}
	public String alterarDesafio(int id,
	String dsAprovacao,
	int dsPontuacao,
	String tempo,
	String statusAprovacao) {
		String resultado;
		Connection con = Conexao.abrirConexao();
		DesafioCandidato dc = new DesafioCandidato();
		DesafioCandidatoDAO dcdao = new DesafioCandidatoDAO(con);
		dc.setIdDesafioCandidato(id);
		dc.setPontuacao(dsPontuacao);
		dc.setStatus(statusAprovacao);
		dc.setAprovacao(dsAprovacao);
		dc.setTempoAplicacao(tempo);
		
		resultado = dcdao.alterar(dc);
		Conexao.fecharConexao(con);
		return resultado;
		
	}
	public String deletarDesafio(int id) {
		String resultado;
		Connection con = Conexao.abrirConexao();
		DesafioCandidato dc = new DesafioCandidato();
		DesafioCandidatoDAO dcdao = new DesafioCandidatoDAO(con);
		dc.setIdDesafioCandidato(id);
		resultado = dcdao.excluir(dc);
		Conexao.fecharConexao(con);
		return resultado;
		
	}
	public ArrayList<String> listarDesafio(int id) {
		ArrayList<String> resultado = new ArrayList<String>();
		Connection con = Conexao.abrirConexao();
		DesafioCandidatoDAO dcdao = new DesafioCandidatoDAO(con);
		//resultado = dcdao.listar(id);
		Conexao.fecharConexao(con);
		if (resultado != null) {
			return resultado;
			
		}else {
			return null;
		}
	}
		
	}


