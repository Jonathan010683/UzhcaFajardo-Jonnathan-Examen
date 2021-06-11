package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.Pedido;
@Stateless
public class PedidoFacade extends AbstractFacade<Pedido>{

	
	@PersistenceContext(name="UzhcaFajardo-Jonnathan-Examen")
	private EntityManager em;
	
	public PedidoFacade() {
		super(Pedido.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
