package br.edu.ifnmg.webdev.usuario;

import javax.ejb.Local;

@Local
public interface UsuarioServiceLocal {

    void save(Usuario usuario);
    
}
