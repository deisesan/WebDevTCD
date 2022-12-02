package br.edu.ifnmg.webdev.compra;

import br.edu.ifnmg.webdev.item.Item;
import br.edu.ifnmg.webdev.usuario.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    @JsonbTransient
    private Usuario cliente;

    @OneToMany(mappedBy = "compra")
    private List<Item> itens;

    private Float total;

    public Compra() {
        itens = new ArrayList<>();
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

        float soma = 0;

        for (Item i : itens) {

            soma += (i.getPreco() * i.getQuantidade());
        }

        this.total = soma;

        return total;
    }

    //</editor-fold>
    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", cliente=" + cliente + ", itens=" + itens + ", total=" + total + '}';
    }

}
