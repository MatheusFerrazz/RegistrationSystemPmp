<%-- 
    Document   : sucesso
    Created on : 02/07/2016, 00:07:12
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sucesso</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="shortcut icon" type="image/x-icon" href="imagens/favicon.ico">
    </head>
    <body>
        <h1>Funcionário ${funcionario.nome} Cadastrado com Sucesso!</h1>

        <!-- Button -->
        <div>
            <div class="btn-group btn-group-vertical">
                <a href="index.html" class="btn btn-success btn-large active"><span class="glyphicon glyphicon-circle-arrow-left"></span><center>Voltar</center></a>
            </div>
        </div>

    </body>
</html>
