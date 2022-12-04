package br.edu.ifnmg.webdev.acai;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class AcaiService implements AcaiServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Acai acai) {
        em.persist(acai);
    }

    @Override
    public List<Acai> findAll() {
        Query q = em.createQuery("SELECT a FROM Acai a");
        return (List<Acai>) q.getResultList();
    }

    @Override
    public Acai findById(Long id) {
        return em.find(Acai.class, id);
    }

    @Override
    public void update(Acai acai) {
        em.merge(acai);
    }

    @Override
    public void delete(Long id) {
        Acai acai = findById(id);
        em.remove(acai);
    }
    
}
