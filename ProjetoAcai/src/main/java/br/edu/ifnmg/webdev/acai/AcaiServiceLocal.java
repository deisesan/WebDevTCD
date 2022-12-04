package br.edu.ifnmg.webdev.acai;

import java.util.List;
import javax.ejb.Local;

@Local
public interface AcaiServiceLocal {

    void save(Acai acai);

    List<Acai> findAll();

    Acai findById(Long id);

}
