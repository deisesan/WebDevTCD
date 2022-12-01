package br.edu.ifnmg.webdev.acai;

import javax.ejb.Local;

@Local
public interface AcaiServiceLocal {

    void save(Acai acai);
    
}
