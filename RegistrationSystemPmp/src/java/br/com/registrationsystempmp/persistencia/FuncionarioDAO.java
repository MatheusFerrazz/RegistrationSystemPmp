/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.registrationsystempmp.persistencia;

import br.com.registrationsystempmp.modelo.Funcionario;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class FuncionarioDAO implements DAO<Funcionario> {
    //Criando a conexão com o banco de dados
    private Connection con;
    
    public FuncionarioDAO(){
        this.con = new DBConnection().getconnection();
        
    public void  inserir(Funcionario entidade) {
        String inserirFuncionario
                = "INSERT INTO funcionario (nome,secretaria,vinculo,setor,identificacao,endereco,numero,bairro,cidade,telefone,username,acesso) "
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement  stmt = null;
        try {
            stmt = (PreparedStatement)con.prepareStatement(inserirFuncionario);
            
            stmt.setString(1, entidade.getNome());
            stmt.setString(2, entidade.getSecretaria());
            stmt.setString(3, entidade.getVinculo());
            stmt.setString(4, entidade.getSetor());
            stmt.setString(5, entidade.getIdentificacao());
            stmt.setString(6, entidade.getEndereco());
            stmt.setString(7, entidade.getNumero());
            stmt.setString(9, entidade.getBairro());
            stmt.setString(10, entidade.getSecretaria());
            stmt.setString(11, entidade.getCidade());
            stmt.setString(12, entidade.getTelefone());
            stmt.setString(13, entidade.getUsername());
            stmt.setString(14, entidade.getAcesso());
                    
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            stmt.close();
            con.close();
        }
       
    }
        
    }
}
