package br.edu.ifnmg.webdev.compra;

import java.util.List;
import javax.ejb.Local;

@Local
public interface CompraServiceLocal {

    void save(Compra compra);

    List<Compra> showCompras();
    
}
