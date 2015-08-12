package controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class MusicaController {
	private final Result result;
	
	public MusicaController(Result result) {
		this.result = result;
	}
	
	public void index(){
		
	}
}
