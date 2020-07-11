package package bd2.edu.univas.si.palestrante.dao;

import javax.persistence.EntityManager;

import br.edu.univas.palestrante.model.Reserva;

public class PalestranteDAO extends GenericDAO<Palestrante, Long> {

    public PalestranteDAO(EntityManager entityManager) {
        super(entityManager);
    }

}
