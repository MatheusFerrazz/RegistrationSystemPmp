<%-- 
    Document   : listar-funcionario
    Created on : 26/06/2016, 16:19:34
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <form>
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
                <c:forEach var="funcionario" items="${dao.listaTudo()}">
                    <tbody>
                        <tr>
                            <td>${funcionario.idfuncionario}</td>
                            <td>${funcionario.nome}</td>
                            <td>${funcionario.secretaria}</td>
                            <td>${funcionario.vinculo}</td>
                            <td>${funcionario.setor}</td>
                            <td>${funcionario.identificacao}</td>
                            <td>${funcionario.endereco}</td>
                            <td>${funcionario.numero}</td>
                            <td>${funcionario.bairro}</td>
                            <td>${funcionario.cidade}</td>
                            <td>${funcionario.telefone}</td>
                            <td>${funcionario.username}</td>
                            <td>${funcionario.acesso}</td>
                        </tr>
                    </tbody>
                </c:forEach>
            </table>

        </form>
    </body>
</html>
