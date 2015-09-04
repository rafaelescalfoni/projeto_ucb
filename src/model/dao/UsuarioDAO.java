package model.dao;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import model.entities.Usuario;

@Component
public class UsuarioDAO extends DAOGenerico<Usuario>  {

	public UsuarioDAO(EntityManager em, Class<Usuario> classe) {
		super(em, classe);
	}

	public Usuario autenticar(String login, String senha){
		String strQuery = "SELECT u FROM Usuario u "
						+ " WHERE u.email = :email "
						+ "	AND u.senha = :senha";
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("email", login);
		param.put("senha", senha);
		return super.get(strQuery, param);
	}
}
