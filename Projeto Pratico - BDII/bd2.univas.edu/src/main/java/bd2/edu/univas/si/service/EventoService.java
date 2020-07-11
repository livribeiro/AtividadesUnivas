package bd2.edu.univas.si.passageiro.service;

import java.util.List;

import bd2.edu.univas.si.palestrante.HibernateUtil;
import bd2.edu.univas.si.palestrante.dao.EventoDAO;
import bd2.edu.univas.si.palestrante.model.Evento;

public class EventoService {

    private EventoDAO dao;

    public EventoService() {
        this.dao = new EventoDAO(HibernateUtil.getEntityManager());
    }
    
    public void save(Evento evento) {
        dao.save(evento);
    }

    public void update(Evento evento){
        dao.update(evento);
    }

    public void delete(Evento evento) {
        dao.delete(evento);
    }

    public Evento getById(long id) {
        return dao.getById(id);
    }

    public List<Evento> getAll() {
        return dao.getAll();
    }

}
