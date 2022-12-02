package br.edu.ifnmg.webdev.adicional;

import br.edu.ifnmg.webdev.item.Item;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Adicional implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Float valor;

    @ManyToMany
    @JoinTable(
            name = "adicional_item",
            joinColumns = @JoinColumn(name = "adicional_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    @JsonbTransient
    private List<Item> itens;

    public Adicional() {
        
        itens = new ArrayList<>();
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Adicional{" + "id=" + id + ", nome=" + nome + ", valor=" + valor + '}';
    }

}
