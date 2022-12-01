package br.edu.ifnmg.webdev.usuario;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UsuarioService implements UsuarioServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Usuario usuario) {
        em.persist(usuario);
    }
    
}
