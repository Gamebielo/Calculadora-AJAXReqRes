<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <link href="assets/calculadora.css" rel="stylesheet" type="text/css">
        <title>Calculadora</title>
		<script src="js/jquery-3.3.1.min.js"></script>
		<script language="JavaScript" src="js/calculadora.js"></script>
    </head>
    <body>
        <h2 class="title">Web Calculadora</h2>
        <form action="" method="post">
        <div>
            <table>
                <tr>
                    <td colspan="4">
                        <input type="text" name="display" id="display" disabled>
                    </td>
                </tr>
                <tr>
                    <td><input type="button" name="one" value="1" onclick=digitar(value)></td>
                    <td><input type="button" name="two" value="2" onclick=digitar(value)></td>
                    <td><input type="button" name="three" value="3" onclick=digitar(value)></td>
                    <td><input type="button" class="operator" name="plus" value="+" onclick=OP(value)></td>
                </tr>
                <tr>
                    <td><input type="button" name="four" value="4" onclick=digitar(value)></td>
                    <td><input type="button" name="five" value="5" onclick=digitar(value)></td>
                    <td><input type="button" name="six" value="6" onclick=digitar(value)></td>
                    <td><input type="button" class="operator" name="minus" value="-" onclick=OP(value)></td>
                </tr>
                <tr>
                    <td><input type="button" name="seven" value="7" onclick=digitar(value)></td>
                    <td><input type="button" name="eight" value="8" onclick=digitar(value)></td>
                    <td><input type="button" name="nine" value="9" onclick=digitar(value)></td>
                    <td><input type="button" class="operator" name="times" value="x" onclick=OP("*")></td>
                </tr>
                <tr>
                    <td><input type="button" id="clear" name="clear" value="c" onclick=clearDisplay("")></td>
                    <td><input type="button" name="zero" value="0" onclick=digitar(value)></td>
                    <td><input type="button" name="doit" value="=" onclick=calcular()></td>
                    <td><input type="button" class="operator" name="div" value="/" onclick=OP(value)></td>
                
                </tr>
            </table>
        </div>
        </form>


        
            <p class="msg">Não esqueça: sempre após uma conta clica no botão "C" para limpar a tela!<br></p>
        <p class="copy">
            <a href="http://www.github.com/gamebielo">&copy; Gabriel Carvalho</a>
        </p>
        <button onclick="window.location.href = 'http://localhost:8080/Calc/historico';" value="historico">Ir para histórico</button>
    </body>
</html>
