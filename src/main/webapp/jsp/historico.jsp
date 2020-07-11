<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="model.ModelCalculadora" %>
<%@page import="model.CalculadoraService" %>
<%@page import="model.UsuarioService" %>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <link href="assets/historico.css" rel="stylesheet" type="text/css">
        <title>Histórico</title>
    </head>
    <body>
        <h2 class="title">Histórico</h2>
        <div class="principal">
            <%
                List<ModelCalculadora> calcs = (List<ModelCalculadora>) request.getAttribute("registros");
                UsuarioService us = new UsuarioService();
                for(ModelCalculadora c: calcs){
                    out.print("<div class='card'>" +
                        "<div class='container'>" +
                            "<h4>" +
                                "<b class='time'>" + c.getHorarioEfetuado() +"</b><br>" +
                                "<b>"+ us.username(c.getCodUsuario()) +"</b>" +
                            "</h4>" +
                            "<p>"+ c.getContaEfetuada() +"</p>" +
                        "</div>" +
                    "</div>");
                }
            %>
        </div>

        <p class="copy">
            <a href="http://www.github.com/gamebielo">&copy; Gabriel Carvalho</a>
        </p>
    </body>
</html>
