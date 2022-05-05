package model.dao;

import model.entidades.Usuario;
import model.sgbd.Oracle;

public class DaoUsuario {
	private long id;
	private String email;
	private String senha;
	private Usuario usuario[];
	private Oracle oracle;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Usuario[] getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario[] usuario) {
		this.usuario = usuario;
	}
	public Oracle getOracle() {
		return oracle;
	}
	public void setOracle(Oracle oracle) {
		this.oracle = oracle;
	}
}
