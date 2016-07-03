<%-- 
    Document   : listar-funcionario
    Created on : 26/06/2016, 16:19:34
    Author     : Matheus
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.registrationsystempmp.controle.ControladorServlet"%>
<%@page import="br.com.registrationsystempmp.modelo.Funcionario"%>
<%@page import="br.com.registrationsystempmp.persistencia.FuncionarioDAO"%>
<%@page import="br.com.registrationsystempmp.persistencia.DBConnection"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<jsp:useBean id="dao" class="br.com.registrationsystempmp.persistencia.FuncionarioDAO" />

<!DOCTYPE html>
<html>
    <script type="text/javascript">
        function deletar() {
            document.getElementById("action").value = "deletar";
        }
    </script>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrados</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="shortcut icon" type="image/x-icon" href="imagens/favicon.ico">
    </head>
    <body>
        <h1>Cadastrados</h1>
        <form  method="post" action="Controlador">
            <table border="1" class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Secretaria</th>
                        <th>Vínculo</th>
                        <th>Setor</th>
                        <th>Identificação</th>
                        <th>Endereço</th>
                        <th>Número</th>
                        <th>Bairro</th>
                        <th>Cidade</th>
                        <th>Telefone</th>
                        <th>Username</th>
                        <th>Acesso</th>
                    </tr>
                </thead>
                <!-- Percorre e mostra na tabela-->
                <tbody>
                    <%
                        for (Funcionario funcionario : dao.listaTudo()) {
                    %>

                    <tr>
                        <td><%=funcionario.getIdfuncionario()%></td>
                        <td><%=funcionario.getNome()%></td>
                        <td><%=funcionario.getSecretaria()%></td>
                        <td><%=funcionario.getVinculo()%></td>
                        <td><%=funcionario.getSetor()%></td>
                        <td><%=funcionario.getIdentificacao()%></td>
                        <td><%=funcionario.getEndereco()%></td>
                        <td><%=funcionario.getNumero()%></td>
                        <td><%=funcionario.getBairro()%></td>
                        <td><%=funcionario.getCidade()%></td>
                        <td><%=funcionario.getTelefone()%></td>
                        <td><%=funcionario.getUsername()%></td>
                        <td><%=funcionario.getAcesso()%></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="idfuncionario"></label>  
                <div class="col-md-6">
                    <input id="idfuncionario" name="idfuncionario" placeholder="id do funcionário a ser excluído" class="form-control input-md" required="" type="text">

                </div>
            </div>    

            <!-- Button -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="deletar"></label>
                <div class="col-md-4">
                    <button id="deletar" name="deletar" value="deletar" onclick="deletar();" class="btn btn-danger">Deletar</button>
                </div>
            </div>

            <fieldset>

                <!-- Button -->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="voltar"></label>
                    <div class="col-md-4">
                        <a href="index.html" class="btn btn-success btn-large active"><span class="glyphicon glyphicon-circle-arrow-left"><center>Voltar</center></span></a>
                    </div>
                </div>
            </fieldset>
        </form>

    </body>
</html>
