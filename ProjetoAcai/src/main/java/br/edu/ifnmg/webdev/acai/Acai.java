package br.edu.ifnmg.webdev.acai;

import br.edu.ifnmg.webdev.adicional.Adicional;
import java.util.List;

/**
 *
 * @author dayan
 */
public class Acai {

    private Long id;
    private Long tamanho;
    private List<Adicional> adicionais;
    private Float preco;

    public Acai() {
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTamanho() {
        return tamanho;
    }

    public void setTamanho(Long tamanho) {
        this.tamanho = tamanho;
    }

    public List<Adicional> getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(List<Adicional> adicionais) {
        this.adicionais = adicionais;
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
        return "Acai{" + "id=" + id + ", tamanho=" + tamanho + ", adicionais=" + adicionais + ", preco=" + preco + '}';
    }

}
