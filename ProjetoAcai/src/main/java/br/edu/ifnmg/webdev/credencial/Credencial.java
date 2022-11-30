package br.edu.ifnmg.webdev.credencial;

import br.edu.ifnmg.webdev.usuario.Usuario;

/**
 *
 * @author dayan
 */
public class Credencial {

    public enum Perfil {
        ADMINISTRADOR, FUNCIONARIO, CLIENTE;
    }

    private Long id;
    private String email;
    private String senha;
    private Perfil perfil;
    private Boolean ativo;
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

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
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
        return "Credencial{" + "id=" + id + ", email=" + email + ", senha=" + senha + ", perfil=" + perfil + ", ativo=" + ativo + ", usuario=" + usuario + '}';
    }

}
