package controller;

import java.util.ArrayList;
import java.util.List;

import model.dao.DAOFactory;
import model.dao.UsuarioDAO;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class IndexController {
	private List<String> lista = new ArrayList<String>();
	private final Result result;
	private DAOFactory daoFactory;
	
	public IndexController(Result result, DAOFactory daoFactory){
		this.result = result;
		this.daoFactory = daoFactory;
		
		lista.add("Agnaldo");
		lista.add("Felipe");
		lista.add("Valeria");
		lista.add("Luciano");
	}
	
	
	public void adiciona(String nomeAluno){
		System.out.println("entrou no metodo adiciona");
		lista.add(nomeAluno);
		result.forwardTo(this).home();
	}
	
	public void autentica(String login, String senha) {
		if (daoFactory.getUsuarioDAO().autenticar(login, senha) != null) {
			System.out.println("usuario identificado");
		} else {
			System.out.println("usuario não identificado");
		}

	}
	
	public void home(){
		System.out.println("\nalo mundo");
		
		
		String msg = "alo mundo, turma de guadalupe";
		result.include("msg", msg);
		result.include("alunos", lista);
	}
}
