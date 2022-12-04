package br.edu.ifnmg.webdev.item;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class ItemService implements ItemServiceLocal {

    @PersistenceContext
    private EntityManager em;
        
    @Override
    public void save(Item item) {
        em.persist(item);
    }

    @Override
    public List<Item> findAll() {
        Query q = em.createQuery("SELECT i FROM Item i");
        return (List<Item>) q.getResultList();
    }

    @Override
    public Item findById(Long id) {
        return em.find(Item.class, id);
    }

    @Override
    public void update(Item item) {
        em.merge(item);
    }

    @Override
    public void delete(Long id) {
        Item item = findById(id);
        em.remove(item);
    }    
}
