package br.edu.ifnmg.webdev.item;

import javax.ejb.Local;

@Local
public interface ItemServiceLocal {

    void save(Item item);
    
}
