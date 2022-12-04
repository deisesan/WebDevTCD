package br.edu.ifnmg.webdev.item;

import java.util.List;
import javax.ejb.Local;

@Local
public interface ItemServiceLocal {

    void save(Item item);

    List<Item> findAll();

    Item findById(Long id);

    void update(Item item);

    void delete(Long id);
    
}
