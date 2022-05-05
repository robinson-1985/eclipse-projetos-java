package controller;

import model.dao.DaoUsuario;
import model.entidades.Usuario;

public class ControllerUsuario {
	private String sessao;
	private String request;
	private String response;
	private DaoUsuario daousuario;
	private Usuario usuario[];
	
	public String getSessao() {
		return sessao;
	}
	public void setSessao(String sessao) {
		this.sessao = sessao;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public DaoUsuario getDaousuario() {
		return daousuario;
	}
	public void setDaousuario(DaoUsuario daousuario) {
		this.daousuario = daousuario;
	}
	public Usuario[] getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario[] usuario) {
		this.usuario = usuario;
	}
}
