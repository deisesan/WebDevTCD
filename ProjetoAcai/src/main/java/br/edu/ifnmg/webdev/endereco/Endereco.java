package br.edu.ifnmg.webdev.endereco;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Endereco implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lodradouro;
    private Integer numero;
    private String bairro;

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
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", lodradouro=" + lodradouro + ", numero=" + numero + ", Bairro=" + bairro + '}';
    }

}
