package bd2.edu.univas.si.evento.dao;

import javax.persistence.EntityManager;

import br.edu.univas.evento.model.Evento;

public class EventoDAO extends GenericDAO<Evento, Long> {

    public EventoDAO(EntityManager entityManager) {
        super(entityManager);
    }
}
