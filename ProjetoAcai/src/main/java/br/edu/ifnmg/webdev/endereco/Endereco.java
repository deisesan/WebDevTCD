package br.edu.ifnmg.webdev.endereco;

/**
 *
 * @author dayan
 */
public class Endereco {

    private Long id;
    private String lodradouro;
    private Integer numero;
    private String Bairro;

    public Endereco() {
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLodradouro() {
        return lodradouro;
    }

    public void setLodradouro(String lodradouro) {
        this.lodradouro = lodradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", lodradouro=" + lodradouro + ", numero=" + numero + ", Bairro=" + Bairro + '}';
    }

}
