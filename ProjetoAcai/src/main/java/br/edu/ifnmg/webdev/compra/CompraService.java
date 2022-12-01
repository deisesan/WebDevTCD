package br.edu.ifnmg.webdev.compra;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dayan
 */
@Stateless
public class CompraService implements CompraServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Compra compra) {
        em.persist(compra);
    }

}
