package br.edu.ifnmg.webdev.credencial;

import br.edu.ifnmg.webdev.usuario.Usuario;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Credencial implements Serializable {

    public enum Perfil {
        ADMINISTRADOR, FUNCIONARIO, CLIENTE;
    }

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String senha;

    @Enumerated(EnumType.ORDINAL)
    private Perfil perfil;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Credencial() {
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Credencial{" + "id=" + id + ", email=" + email + ", senha=" + senha + ", perfil=" + perfil + ", usuario=" + usuario + '}';
    }
    
    

}
