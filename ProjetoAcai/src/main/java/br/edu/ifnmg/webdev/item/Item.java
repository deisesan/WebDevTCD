package br.edu.ifnmg.webdev.item;

import br.edu.ifnmg.webdev.acai.Acai;
import br.edu.ifnmg.webdev.adicional.Adicional;
import br.edu.ifnmg.webdev.compra.Compra;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "acai_id")
    private Acai acai;

    @ManyToMany
    @JoinTable(
            name = "item_adicional",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "adicional_id"))
    private List<Adicional> adicionais;

    private Integer quantidade;

    private Float preco;

    @ManyToOne
    @JoinColumn(name = "compra_id")
    @JsonbTransient
    private Compra compra;

    public Item() {
        adicionais = new ArrayList<>();
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Acai getAcai() {
        return acai;
    }

    public void setAcai(Acai acai) {
        this.acai = acai;
    }

    public List<Adicional> getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(List<Adicional> adicionais) {
        this.adicionais = adicionais;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Float getPreco() {

        float soma = 0;
        for (Adicional ad : adicionais) {

            soma += ad.getValor();
        }

        preco = (soma + acai.getValor());

        return preco;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", acai=" + acai + ", adicionais=" + adicionais + ", quantidade=" + quantidade + ", preco=" + preco + ", compra=" + compra + '}';
    }

}
