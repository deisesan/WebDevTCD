/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package br.edu.ifnmg.webdev.credencial;

import javax.ejb.Local;

/**
 *
 * @author dayan
 */
@Local
public interface CredencialServiceLocal {

    void save(Credencial credencial);
    
}
