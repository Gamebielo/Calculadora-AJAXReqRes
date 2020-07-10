<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="model.ModelCalculadora" %>
<%@page import="model.CalculadoraService" %>
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
			List<ModelCalculadora> users = (List<ModelCalculadora>) request.getAttribute("registros");
            for(ModelCalculadora user: users){
                //out.print("<li>" + user.getContaEfetuada() + "</li><br/>");
                
                out.print("<div class='card'>" +
                    "<div class='container'>" +
                        "<h4>" +
                            "<b class='time'>" + user.getHorarioEfetuado() +"</b><br>" +
                            "<b>Paulo Henrique</b>" +
                        "</h4>" +
                        "<p>"+ user.getContaEfetuada() +"</p>" +
                    "</div>" +
                "</div>");
            } 		
        %>

        <!--
            <div class="card">
                <div class="container">
                    <h4>
                        <b class="time">10:45</b><br>
                        <b>Paulo Henrique</b>
                    </h4>
                    <p>2 + 2 = 4</p>
                </div>
            </div>
            <div class="card">
                <div class="container">
                    <h4>
                        <b class="time">10:50</b><br>
                        <b>Gabriel Carvalho</b>
                    </h4>
                    <p>2 + 2 = 4</p>
                </div>
            </div>
            <div class="card">
                <div class="container">
                    <h4>
                        <b class="time">10:55</b><br>
                        <b>Paola Oliveira</b>
                    </h4>
                    <p>2 + 2 = 4</p>
                </div>
            </div>
            -->
        </div>

        <p class="copy">
            <a href="http://www.github.com/gamebielo">&copy; Gabriel Carvalho</a>
        </p>
    </body>
</html>
