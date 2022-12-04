package br.edu.ifnmg.webdev.telefone;

import java.util.List;
import javax.ejb.Local;

@Local
public interface TelefoneServiceLocal {

    void save(Telefone telefone);

    List<Telefone> findAll();

    Telefone findById(Long id);
    
}
