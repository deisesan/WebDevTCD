package br.edu.ifnmg.webdev.endereco;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EnderecoService implements EnderecoServiceLocal {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void save(Endereco endereco) {
        em.persist(endereco);
    }
}
