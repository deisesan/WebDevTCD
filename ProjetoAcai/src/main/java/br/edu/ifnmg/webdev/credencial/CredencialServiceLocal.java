package br.edu.ifnmg.webdev.credencial;

import javax.ejb.Local;

@Local
public interface CredencialServiceLocal {

    void save(Credencial credencial);
    
}
