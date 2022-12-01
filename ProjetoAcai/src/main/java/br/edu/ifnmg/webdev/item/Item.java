package br.edu.ifnmg.webdev.item;

import br.edu.ifnmg.webdev.acai.Acai;
import br.edu.ifnmg.webdev.adicional.Adicional;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author deise
 */
@Entity
@Table
public class Item implements Serializable{
    
     private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Acai acai;
    private List<Adicional> adicionais;
    private Integer quantidade;
    private Float preco;
    
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
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", acai=" + acai + ", adicionais=" + adicionais + ", quantidade=" + quantidade + ", preco=" + preco + '}';
    }
}
