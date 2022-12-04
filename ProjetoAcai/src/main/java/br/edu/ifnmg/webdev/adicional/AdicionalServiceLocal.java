package br.edu.ifnmg.webdev.adicional;

import java.util.List;
import javax.ejb.Local;

@Local
public interface AdicionalServiceLocal {

    void save(Adicional adicional);

    List<Adicional> findAll();

    Adicional findById(Long id);

    void update(Adicional adicional);

    void delete(Long id);
    
}
