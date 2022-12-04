package br.edu.ifnmg.webdev.endereco;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class EnderecoService implements EnderecoServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Endereco endereco) {
        em.persist(endereco);
    }

    @Override
    public List<Endereco> findAll() {
        Query q = em.createQuery("SELECT e FROM Endereco e");
        return (List<Endereco>) q.getResultList();
    }

    @Override
    public Endereco findById(Long id) {
        return em.find(Endereco.class, id);
    }

}
