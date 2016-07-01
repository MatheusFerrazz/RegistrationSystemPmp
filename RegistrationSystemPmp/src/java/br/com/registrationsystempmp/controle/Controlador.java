package br.com.registrationsystempmp.controle;

import br.com.registrationsystempmp.modelo.Funcionario;
import br.com.registrationsystempmp.persistencia.FuncionarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
@WebServlet(name = "/Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        //Faz uma busca pela escrita write

        PrintWriter out = response.getWriter();
        FuncionarioDAO dao = new FuncionarioDAO();
        String action = request.getParameter("action");

        if (action != null && action.equals("gravar")) {
            //Busca parametros do request
            Integer id = 0;

            if (request.getParameter("id") != null && !request.getParameter("id").equals("")) {
                id = Integer.parseInt(request.getParameter("id"));
            }
            String nome = request.getParameter("nome");
            String secretaria = request.getParameter("secretaria");
            String vinculo = request.getParameter("vinculo");
            String setor = request.getParameter("setor");
            String identificacao = request.getParameter("identificacao");
            String endereco = request.getParameter("endereco");
            String numero = request.getParameter("numero");
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
            funcionario.setCidade(cidade);
            funcionario.setTelefone(telefone);
            funcionario.setUsername(username);
            funcionario.setAcesso(acesso);

            try {
                if (id != null && id > 0) {
                    funcionario.setIdfuncionario(new Long(id));
                    dao.editar(funcionario);

                } else {
                    dao.inserir(funcionario);
                }
                RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-funcionario.html");
                dispatcher.forward(request, response);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else if (action != null && action.equals("excluir")) {
            Integer id = 0;
            if (request.getParameter("id") != null && !request.getParameter("id").equals("")) {
                id = Integer.parseInt(request.getParameter("id"));

            }
            Funcionario funcionario = new Funcionario();
            funcionario.setIdfuncionario(new Long(id));

            try {
                dao.deletar(funcionario);
                RequestDispatcher dispatcher = request.getRequestDispatcher("funcionario.jsp");
                dispatcher.forward(request, response);

            } catch (SQLException e) {
                e.printStackTrace();

            }

        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("funcionario.jsp");
            dispatcher.forward(request, response);
        }

    }

}
