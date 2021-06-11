package ec.edu.ups.ejb;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class AbstractFacade<T> {
	private Class<T> entityClass;

	public AbstractFacade(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	protected abstract EntityManager getEntityManager();

	public void create(T entity) {
        System.out.println("Metodo Crear Entidad...");
	getEntityManager().persist(entity);
    }

	public void edit(T entity) {
		getEntityManager().merge(entity);
	}

	public void remove(T entity) {
		getEntityManager().remove(getEntityManager().merge(entity));
	}

	public T find(String cedula) {
		return getEntityManager().find(entityClass, cedula);
	}

	public List<T> findAll() {
		javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));
		System.out.println(getEntityManager().createQuery(cq).getResultList());
		return   getEntityManager().createQuery(cq).getResultList();
	}
}
