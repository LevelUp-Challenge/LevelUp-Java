package Controller;

import java.sql.Connection;

import Model.Conexao;
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
}
