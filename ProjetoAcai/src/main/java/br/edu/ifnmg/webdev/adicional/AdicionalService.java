package br.edu.ifnmg.webdev.adicional;

import br.edu.ifnmg.webdev.acai.Acai;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class AdicionalService implements AdicionalServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Adicional adicional) {
        em.persist(adicional);
    }

    @Override
    public List<Adicional> showAdicionais() {
        Query q = em.createQuery("SELECT a FROM Adicional a");
        return (List<Adicional>) q.getResultList();
    }

}
