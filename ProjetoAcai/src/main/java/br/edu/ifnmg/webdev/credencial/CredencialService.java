package br.edu.ifnmg.webdev.credencial;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class CredencialService implements CredencialServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Credencial credencial) {
        em.persist(credencial);
    }

    @Override
    public List<Credencial> findAll() {
        Query q = em.createQuery("SELECT c FROM Credencial c");
        return (List<Credencial>) q.getResultList();
    }

    @Override
    public Credencial findById(Long id) {
        return em.find(Credencial.class, id);
    }

}
