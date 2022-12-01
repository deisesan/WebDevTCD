package br.edu.ifnmg.webdev.endereco;

import javax.ejb.Local;

@Local
public interface EnderecoServiceLocal {

    void save(Endereco endereco);
    
}
