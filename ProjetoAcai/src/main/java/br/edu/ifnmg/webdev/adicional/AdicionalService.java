package br.edu.ifnmg.webdev.adicional;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dayan
 */
@Stateless
public class AdicionalService implements AdicionalServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Adicional adicional) {
        em.persist(adicional);
    }

}
