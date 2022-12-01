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
    private Float valor;

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

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Acai{" + "id=" + id + ", tamanho=" + tamanho + ", valor=" + valor + '}';
    }
}
