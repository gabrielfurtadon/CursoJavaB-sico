package com.br.DTO.aluno;

import com.br.interfaces.PermitirAcesso;
import com.br.view.main.Pessoa;

public class Diretor extends Pessoa implements PermitirAcesso{
	
	//private String login, senha; USE THIS ONLY WHEN IMPLEMENTS INTERFACE WITHOUT PARAMETERS, BUT CAN CAUSE BUGS WITH HIBERNATE FOR EXEMPLE, WHEN CREATES AT DATABASE
	
	@Override
	public double mesada() {
		
		return 8000;
	}
	
	
	// METODO OBRIGATORIO PELA INTERFACE, SEM PARAMETROS 
//	@Override
//	public boolean autenticar() { 
//		// AQUI DENTRO OCORRERIA A CONSULKTA A BANCO DE DADOS, SERVIDORES, ETC
//		if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	@Override
	public boolean autenticar(String login, String senha) {
		if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
			return true;
		} else {
			return false;
		}
	}


//	public String getLogin() {
//		return login;
//	}
//
//	public void setLogin(String login) {
//		this.login = login;
//	}
//
//	public String getSenha() {
//		return senha;
//	}
//
//	public void setSenha(String senha) {
//		this.senha = senha;
//	}
 
}
	
