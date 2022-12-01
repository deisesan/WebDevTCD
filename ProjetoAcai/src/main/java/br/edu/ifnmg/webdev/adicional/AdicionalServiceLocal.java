package br.edu.ifnmg.webdev.adicional;

import javax.ejb.Local;

@Local
public interface AdicionalServiceLocal {

    void save(Adicional adicional);
    
}
