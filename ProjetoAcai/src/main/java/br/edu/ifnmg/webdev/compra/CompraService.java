package br.edu.ifnmg.webdev.compra;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class CompraService implements CompraServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Compra compra) {
        em.persist(compra);
    }

    @Override
    public List<Compra> findAll() {
        Query q = em.createQuery("SELECT c FROM Compra c");
        return (List<Compra>) q.getResultList();
    }

    @Override
    public Compra findById(Long id) {
        return em.find(Compra.class, id);
    }

    @Override
    public void update(Compra compra) {
        em.merge(compra);
    }

    @Override
    public void delete(Long id) {
        Compra compra = findById(id);
        em.remove(compra);
    }
    
}
