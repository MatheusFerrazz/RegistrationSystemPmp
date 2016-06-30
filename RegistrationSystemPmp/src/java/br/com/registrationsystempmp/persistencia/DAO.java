/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.registrationsystempmp.persistencia;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Matheus
 * @param <T>
 */
public interface DAO <T> {
    
    public void inserir(T entidade)throws SQLException;
    
    public void editar(T entidade)throws SQLException;
               
    public void deletar(T entidade)throws SQLException;
    
    public T listar(String pesquisa)throws SQLException;
    
    public List<T>listaTudo()throws SQLException;

}
