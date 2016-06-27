/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.registrationsystempmp.persistencia;

import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class DAO <T> {
    
    public void inserir(T entidade) throws SQLException;
    
    public void editar(T entidade) throws SQLException;
    
    public void deletar(T entidade) throws SQLException;
    
    public void listar(T entidade) throws SQLException;
    
    public List<T>listaTudo() throws SQLException;
}
