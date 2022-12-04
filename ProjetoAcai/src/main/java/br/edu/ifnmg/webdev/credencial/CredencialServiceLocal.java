package br.edu.ifnmg.webdev.credencial;

import java.util.List;
import javax.ejb.Local;

@Local
public interface CredencialServiceLocal {

    void save(Credencial credencial);

    List<Credencial> findAll();

    Credencial findById(Long id);

    void update(Credencial credencial);

    void delete(Long id);
    
}
