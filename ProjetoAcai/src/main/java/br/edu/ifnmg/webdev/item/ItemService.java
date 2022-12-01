package br.edu.ifnmg.webdev.item;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ItemService implements ItemServiceLocal {

    @PersistenceContext
    private EntityManager em;
        
    @Override
    public void save(Item item) {
        em.persist(item);
    }

}
