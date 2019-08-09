package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.resource.ClienteTO;

public class Testes {
	
	
	public static void main(String[] args) {
		EntityManagerFactory fabrica =  Persistence.createEntityManagerFactory("AutoComplete");		
		 EntityManager em = fabrica.createEntityManager();
		
		ClienteTO a = new ClienteTO();
		a.setNome("Josueh das Pazes");
		
		
		ClienteTO b = new ClienteTO();
		b.setNome("Joaum das Claras");
		
		
		ClienteTO c = new ClienteTO();
		c.setNome("Jonaz de Porto");
		
		
		
		ClienteDAO dao = new ClienteDAOImpl(em);

	
		try {
			dao.cadastrar(a);
			dao.cadastrar(b);
			dao.cadastrar(c);			
			dao.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
