package br.edu.ifnmg.webdev.telefone;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TelefoneService implements TelefoneServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Telefone telefone) {
        em.persist(telefone);
    }
    
}
