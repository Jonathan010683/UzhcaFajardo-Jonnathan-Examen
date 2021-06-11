package ec.edu.ups.ejb;

import java.util.Iterator;
import java.util.Random;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.eclipse.persistence.internal.libraries.antlr.runtime.IntStream;

import ec.edu.ups.entidad.Comida;

@Stateless
public class ComidaFacade extends AbstractFacade<Comida>{
	
	@PersistenceContext(name="UzhcaFajardo-Jonnathan-Examen")
	private EntityManager em;

	public ComidaFacade() {
		super(Comida.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
	public int generarCodigo() {
		// Instanciar clase Random
		Random random = new Random();

		// Obtener IntStream. El IntStream tendrá 10 números aleatorios
		// entre 1 y 7, excluido el 7. Vaya, la típica tirada de dados del 1 al 6.
		IntStream intStream = (IntStream) random.ints(10, 1, 7);

		// Iterador para ir obteniendo los números
		Iterator iterator = ((java.util.stream.IntStream) intStream).iterator();

		// Sacamos los números aleatorios por pantalla, en un bucle.
		
		  return (Integer) iterator.next();
		
	}

}
