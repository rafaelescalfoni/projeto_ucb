package model.dao;

import javax.persistence.EntityManager;

import model.entities.Usuario;
import br.com.caelum.vraptor.ioc.Component;


@Component
public class DAOFactory {

	private EntityManager em;

	public DAOFactory(EntityManager em) {
		this.em = em;
	}
	
	public UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAO(this.em, Usuario.class);
	}

	
}
