package br.edu.ifnmg.webdev.adicional;

/**
 *
 * @author dayan
 */
public class Adicional {

    private Long id;
    private String nome;
    private Float valor;

    public Adicional() {
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
    //</editor-fold>

    @Override
    public String toString() {
        return "Adicional{" + "id=" + id + ", nome=" + nome + ", valor=" + valor + '}';
    }

}
