package br.edu.ifnmg.webdev.telefone;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class TelefoneService implements TelefoneServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Telefone telefone) {
        em.persist(telefone);
    }

    @Override
    public List<Telefone> findAll() {
        Query q = em.createQuery("SELECT t FROM Telefone t");
        return (List<Telefone>) q.getResultList();
    }

    @Override
    public Telefone findById(Long id) {
        return em.find(Telefone.class, id);
    }

    @Override
    public void update(Telefone telefone) {
        em.merge(telefone);
    }
    
}
