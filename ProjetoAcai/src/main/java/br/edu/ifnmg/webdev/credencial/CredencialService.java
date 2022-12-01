package br.edu.ifnmg.webdev.credencial;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CredencialService implements CredencialServiceLocal {
    
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void save(Credencial credencial) {
        em.persist(credencial);
    }
    
}
