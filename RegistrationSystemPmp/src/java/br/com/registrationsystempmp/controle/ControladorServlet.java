/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.registrationsystempmp.controle;

import br.com.registrationsystempmp.modelo.Funcionario;
import br.com.registrationsystempmp.persistencia.FuncionarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Matheus
 */
@WebServlet(urlPatterns = {"/ControladorServlet"})
public class ControladorServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Faz uma busca pela escrita write
        PrintWriter out = response.getWriter();
        FuncionarioDAO dao = new FuncionarioDAO();
        String action = request.getParameter("action");


        String nome = request.getParameter("nome");
        String secretaria = request.getParameter("secretaria");
        String vinculo = request.getParameter("vinculo");
        String setor = request.getParameter("setor");
        String identificacao = request.getParameter("identificacao");
        String endereco = request.getParameter("endereco");
        String numero = request.getParameter("numero");
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String telefone = request.getParameter("telefone");
        String username = request.getParameter("username");
        String acesso = request.getParameter("acesso");

        Funcionario funcionario = new Funcionario();
        //funcionario.setIdfuncionario(new Long(id));
        funcionario.setNome(nome);
        funcionario.setSecretaria(secretaria);
        funcionario.setVinculo(vinculo);
        funcionario.setSetor(setor);
        funcionario.setIdentificacao(identificacao);
        funcionario.setEndereco(endereco);
        funcionario.setNumero(numero);
        funcionario.setBairro(bairro);
        funcionario.setCidade(cidade);
        funcionario.setTelefone(telefone);
        funcionario.setUsername(username);
        funcionario.setAcesso(acesso);

        try {
            dao.inserir(funcionario);
            RequestDispatcher dispatcher = request.getRequestDispatcher("sucesso.jsp");
            dispatcher.forward(request, response);
        } 
        catch (SQLException ex) {
            Logger.getLogger(ControladorServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
