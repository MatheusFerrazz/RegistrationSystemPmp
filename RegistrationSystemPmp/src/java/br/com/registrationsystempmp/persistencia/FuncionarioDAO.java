/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.registrationsystempmp.persistencia;

import br.com.registrationsystempmp.modelo.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class FuncionarioDAO implements DAO<Funcionario> {

    //Criando a conexão com o banco de dados
    private Connection con;

    public FuncionarioDAO() {
        this.con = new DBConnection().getconnection();

    }

    @Override
    public void inserir(Funcionario entidade) throws SQLException {
        String inserirFuncionario
                = "INSERT INTO funcionario (nome,secretaria,vinculo,setor,identificacao,endereco,numero,bairro,cidade,telefone,username,acesso) "
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stmt = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement(inserirFuncionario);

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
        } finally {
            stmt.close();
            con.close();
        }

    }

    @Override
    public void editar(Funcionario entidade) throws SQLException {
        String sql = "update pessoa set";
        int t = 0;
        int count = 1;
        if (entidade.getNome() != null && !entidade.getNome().equals("")) {
            sql = sql + "nome = ?";
            t = 1;
        }
        if (entidade.getSecretaria() != null
                && !entidade.getSecretaria().equals("")) {
            if (t == 1) {
                sql = sql + ",";
            }
            sql = sql + "secretaria =? ";
            t = 1;
        }
        if (entidade.getVinculo() != null
                && !entidade.getVinculo().equals("")) {
            if (t == 1) {
                sql = sql + ",";
            }
            sql = sql + "vinculo =? ";
            t = 1;
        }
        if (entidade.getSetor() != null
                && !entidade.getSetor().equals("")) {
            if (t == 1) {
                sql = sql + ",";
            }
            sql = sql + "setor =? ";
            t = 1;
        }
        if (entidade.getIdentificacao() != null
                && !entidade.getIdentificacao().equals("")) {
            if (t == 1) {
                sql = sql + ",";
            }
            sql = sql + "identificacao =? ";
            t = 1;
        }
        if (entidade.getEndereco() != null
                && !entidade.getEndereco().equals("")) {
            if (t == 1) {
                sql = sql + ",";
            }
            sql = sql + "endereco =? ";
            t = 1;
        }
        if (entidade.getNumero() != null
                && !entidade.getNumero().equals("")) {
            if (t == 1) {
                sql = sql + ",";
            }
            sql = sql + "numero =? ";
            t = 1;
        }
        if (entidade.getBairro() != null
                && !entidade.getBairro().equals("")) {
            if (t == 1) {
                sql = sql + ",";
            }
            sql = sql + "bairro =? ";
            t = 1;
        }
        if (entidade.getCidade() != null
                && !entidade.getTelefone().equals("")) {
            if (t == 1) {
                sql = sql + ",";
            }
            sql = sql + "telefone =? ";
            t = 1;
        }
        if (entidade.getUsername() != null
                && !entidade.getUsername().equals("")) {
            if (t == 1) {
                sql = sql + ",";
            }
            sql = sql + "username =? ";
            t = 1;
        }
        if (entidade.getAcesso() != null
                && !entidade.getAcesso().equals("")) {
            if (t == 1) {
                sql = sql + ",";
            }
            sql = sql + "acesso =? ";
            t = 1;
        }
        sql = sql + "where id =?";
        PreparedStatement stmt = null;

        try {
            stmt = (PreparedStatement) con.prepareStatement(sql);
            if (entidade.getNome() != null && !entidade.getNome().equals("")) {
                stmt.setString(count, entidade.getNome());
                count++;
            }
            if (entidade.getSecretaria() != null && !entidade.getSecretaria().equals("")) {
                stmt.setString(count, entidade.getSecretaria());
                count++;
            }
            if (entidade.getVinculo() != null && !entidade.getVinculo().equals("")) {
                stmt.setString(count, entidade.getVinculo());
                count++;
            }
            if (entidade.getSetor() != null && !entidade.getSetor().equals("")) {
                stmt.setString(count, entidade.getSetor());
                count++;
            }
            if (entidade.getIdentificacao() != null && !entidade.getIdentificacao().equals("")) {
                stmt.setString(count, entidade.getIdentificacao());
                count++;
            }
            if (entidade.getEndereco() != null && !entidade.getEndereco().equals("")) {
                stmt.setString(count, entidade.getEndereco());
                count++;
            }
            if (entidade.getNumero() != null && !entidade.getNumero().equals("")) {
                stmt.setString(count, entidade.getNumero());
                count++;
            }
            if (entidade.getBairro() != null && !entidade.getBairro().equals("")) {
                stmt.setString(count, entidade.getBairro());
                count++;
            }
            if (entidade.getCidade() != null && !entidade.getCidade().equals("")) {
                stmt.setString(count, entidade.getCidade());
                count++;
            }
            if (entidade.getTelefone() != null && !entidade.getTelefone().equals("")) {
                stmt.setString(count, entidade.getTelefone());
                count++;
            }
            if (entidade.getUsername() != null && !entidade.getUsername().equals("")) {
                stmt.setString(count, entidade.getUsername());
                count++;
            }
            if (entidade.getAcesso() != null && !entidade.getAcesso().equals("")) {
                stmt.setString(count, entidade.getAcesso());
                count++;
            }
            stmt.setLong(count, entidade.getIdfuncionario());
            stmt.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close();
            con.close();
        }
    }

    @Override
    public void deletar(Funcionario entidade) throws SQLException {
        PreparedStatement stmt = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement("delete from funcionario where id =?");
            stmt.setLong(1, entidade.getIdfuncionario());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close();
            con.close();
        }
    }

    @Override
    public Funcionario listar(String pesquisa) throws SQLException {
        Funcionario entidade = new Funcionario();
        String sql = "select * from funcionario where id =?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setLong(1, entidade.getIdfuncionario());
            rs = stmt.executeQuery();

            if (rs.next()) {
                entidade.setIdfuncionario(rs.getLong("id"));
                entidade.setNome(rs.getString("nome"));
                entidade.setSecretaria(rs.getString("secretaria"));
                entidade.setVinculo(rs.getString("vinculo"));
                entidade.setSetor(rs.getString("setor"));
                entidade.setIdentificacao(rs.getString("identificacao"));
                entidade.setEndereco(rs.getString("endereco"));
                entidade.setNumero(rs.getString("numero"));
                entidade.setBairro(rs.getString("bairro"));
                entidade.setCidade(rs.getString("cidade"));
                entidade.setTelefone(rs.getString("telefone"));
                entidade.setUsername(rs.getString("username"));
                entidade.setAcesso(rs.getString("acesso"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close();
            con.close();
            rs.close();
        }
        return entidade;
    }

    @Override
    public List<Funcionario> listaTudo() throws SQLException {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        String sql = "select * from funcionario";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement(sql);
            rs = stmt.executeQuery();
            Funcionario entidade = null;

            while (rs.next()) {
                entidade = new Funcionario();
                entidade.setIdfuncionario(rs.getLong("id"));
                entidade.setNome(rs.getString("nome"));
                entidade.setSecretaria(rs.getString("secretaria"));
                entidade.setVinculo(rs.getString("vinculo"));
                entidade.setSetor(rs.getString("setor"));
                entidade.setIdentificacao(rs.getString("identificacao"));
                entidade.setEndereco(rs.getString("endereco"));
                entidade.setNumero(rs.getString("numero"));
                entidade.setBairro(rs.getString("bairro"));
                entidade.setCidade(rs.getString("cidade"));
                entidade.setTelefone(rs.getString("telefone"));
                entidade.setUsername(rs.getString("username"));
                entidade.setAcesso(rs.getString("acesso"));

                funcionarios.add(entidade);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close();
            con.close();
            rs.close();
        }

        return null;

    }
}
