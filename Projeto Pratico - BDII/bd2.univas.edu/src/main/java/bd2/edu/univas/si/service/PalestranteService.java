package bd2.edu.univas.si.palestrante.service;

import java.util.List;

import bd2.edu.univas.si.palestrante.HibernateUtil;
import bd2.edu.univas.si.palestrante.dao.PalestranteDAO;
import bd2.edu.univas.si.palestrante.model.Palestrante;

public class PalestranteService {

    private PalestranteDAO dao;

    public PalestranteService() {
        this.dao = new DAO(HibernateUtil.getEntityManager());
    }

    public void save(Palestrante palestrante) {
        dao.save(palestrante);
    }

    public void update(Palestrante palestrante) {
        dao.update(palestrante);
    }

    public void delete(Palestrante palestrante) {
        dao.delete(palestrante);
    }

    public Palestrante getById(long id) {
        return dao.getById(id);
    }

    public List<Palestrante> getAll() {
        return dao.getAll();
    }
}
