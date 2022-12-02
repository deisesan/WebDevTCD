package br.edu.ifnmg.webdev.usuario;

import br.edu.ifnmg.webdev.compra.Compra;
import br.edu.ifnmg.webdev.credencial.Credencial;
import br.edu.ifnmg.webdev.endereco.Endereco;
import br.edu.ifnmg.webdev.telefone.Telefone;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private LocalDate nascimento;

    @OneToOne
    @JoinColumn(name = "telefone_id")
    private Telefone telefone;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    @OneToOne
    @JoinColumn(name = "credencial_id")
    @JsonbTransient
    private Credencial credencial;

    @OneToMany
    private List<Compra> compras;

    public Usuario() {
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

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", nascimento=" + nascimento + ", telefone=" + telefone + ", endereco=" + endereco + ", credencial=" + credencial + ", compras=" + compras + '}';
    }
    
    

}
