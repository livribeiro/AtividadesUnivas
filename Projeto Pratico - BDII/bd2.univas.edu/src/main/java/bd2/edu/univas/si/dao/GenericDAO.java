package bd2.edu.univas.si.palestrante.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class GenericDAO<T, PK> {

    protected EntityManager entityManager;

    public GenericDAO(EntityManager em) {
        this.entityManager = em;
    }

    public void save(T entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    public void update(T entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    public void delete(T entity) {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    @SuppressWarnings("unchecked")
    public T getById(PK id) {
        return (T) entityManager.find(getTypeClass(), id);
    }

    @SuppressWarnings("unchecked")
    public List<T> getAll() {
        Query q = entityManager.createQuery(" from " + getTypeClass().getName(),
                getTypeClass());
        return q.getResultList();
    }

    private Class<?> getTypeClass() {
        return (Class<?>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }
}