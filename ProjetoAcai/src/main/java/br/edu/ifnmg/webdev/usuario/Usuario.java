package br.edu.ifnmg.webdev.usuario;

import br.edu.ifnmg.webdev.credencial.Credencial;
import br.edu.ifnmg.webdev.endereco.Endereco;
import br.edu.ifnmg.webdev.telefone.Telefone;
import java.time.LocalDate;

/**
 *
 * @author dayan
 */
public class Usuario {

    private Long id;
    private String nome;
    private LocalDate nascimento;
    private Telefone telefone;
    private Endereco endereco;
    private Credencial credencial;

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
    //</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", nascimento=" + nascimento + ", telefone=" + telefone + ", endereco=" + endereco + ", credencial=" + credencial + '}';
    }

}
