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
public interface DAO <M> {
    
    public void inserir(M entidade)throws SQLException;
    
    public void editar(M entidade)throws SQLException;
               
    public void deletar(M entidade)throws SQLException;
    
    public M listar(String pesquisa)throws SQLException;
    
    public List<M>listaTudo()throws SQLException;

}
