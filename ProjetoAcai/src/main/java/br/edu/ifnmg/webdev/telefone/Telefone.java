package br.edu.ifnmg.webdev.telefone;

/**
 *
 * @author dayan
 */
public class Telefone {

    private Long id;
    private Byte ddd;
    private Integer numero;

    public Telefone() {
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getDdd() {
        return ddd;
    }

    public void setDdd(Byte ddd) {
        this.ddd = ddd;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    //</editor-fold>
    
    @Override
    public String toString() {
        return "Telefone{" + "id=" + id + ", ddd=" + ddd + ", numero=" + numero + '}';
    }
}
