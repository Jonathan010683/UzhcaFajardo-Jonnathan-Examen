package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.TarjetaCredito;
@Stateless
public class TarjetaCreditoFacade  extends AbstractFacade<TarjetaCredito>{

	
	
	@PersistenceContext(name="UzhcaFajardo-Jonnathan-Examen")
	private EntityManager em;
	
	public TarjetaCreditoFacade() {
		super(TarjetaCredito.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
