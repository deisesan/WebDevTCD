package br.edu.ifnmg.webdev.usuario;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class UsuarioService implements UsuarioServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public List<Usuario> findAll() {
        Query q = em.createQuery("SELECT u FROM Usuario u");
        return (List<Usuario>) q.getResultList();
    }

    @Override
    public Usuario findById(Long id) {
        return em.find(Usuario.class, id);
    }

    
}
