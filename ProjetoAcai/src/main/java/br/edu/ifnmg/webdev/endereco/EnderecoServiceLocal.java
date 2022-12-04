package br.edu.ifnmg.webdev.endereco;

import java.util.List;
import javax.ejb.Local;

@Local
public interface EnderecoServiceLocal {

    void save(Endereco endereco);

    List<Endereco> findAll();

    Endereco findById(Long id);

}
