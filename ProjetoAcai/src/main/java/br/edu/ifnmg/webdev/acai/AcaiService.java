package br.edu.ifnmg.webdev.acai;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dayan
 */
@Stateless
public class AcaiService implements AcaiServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Acai acai) {
        em.persist(acai);
    }

}
