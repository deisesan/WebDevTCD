package br.edu.ifnmg.webdev.compra;

import br.edu.ifnmg.webdev.item.Item;
import br.edu.ifnmg.webdev.usuario.Usuario;
import java.util.List;

/**
 *
 * @author deise
 */
public class Compra {

    private Long id;
    private Usuario cliente;
    private List<Item> itens;
    private Float total;

    public Compra() {
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", cliente=" + cliente + ", itens=" + itens + ", total=" + total + '}';
    }
}
