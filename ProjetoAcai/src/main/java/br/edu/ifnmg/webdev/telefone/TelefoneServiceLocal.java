package br.edu.ifnmg.webdev.telefone;

import javax.ejb.Local;

@Local
public interface TelefoneServiceLocal {

    void save(Telefone telefone);
    
}
