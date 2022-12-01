package br.edu.ifnmg.webdev.compra;

import javax.ejb.Local;

@Local
public interface CompraServiceLocal {

    void save(Compra compra);
    
}
