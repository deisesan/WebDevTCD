package br.edu.ifnmg.webdev.usuario;

import java.util.List;
import javax.ejb.Local;

@Local
public interface UsuarioServiceLocal {

    void save(Usuario usuario);

    List<Usuario> findAll();

    Usuario findById(Long id);

    void update(Usuario usuario);
    
}
