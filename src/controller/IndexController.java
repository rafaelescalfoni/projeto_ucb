package controller;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class IndexController {
	private List<String> lista = new ArrayList<String>();
	private final Result result;
	
	public IndexController(Result result){
		this.result = result;
		
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
	
	public void home(){
		System.out.println("\nalo mundo");
		
		
		String msg = "alo mundo, turma de guadalupe";
		result.include("msg", msg);
		result.include("alunos", lista);
	}
}
