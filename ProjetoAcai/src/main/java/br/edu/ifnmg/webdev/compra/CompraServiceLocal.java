/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package br.edu.ifnmg.webdev.compra;

import javax.ejb.Local;

/**
 *
 * @author dayan
 */
@Local
public interface CompraServiceLocal {

    void save(Compra compra);
    
}
