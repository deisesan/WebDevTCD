package br.edu.ifnmg.webdev.adicional;

import java.util.List;
import javax.ejb.Local;

@Local
public interface AdicionalServiceLocal {

    void save(Adicional adicional);

    List<Adicional> findAll();
    
}
