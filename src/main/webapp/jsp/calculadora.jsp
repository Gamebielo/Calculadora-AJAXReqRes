<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <link href="assets/calculadora.css" rel="stylesheet" type="text/css">
        <title>Calculadora</title>
    </head>
    <body>
        <h2 class="title">Web Calculadora</h2>
        <div>
            <table>
                <tr>
                    <td colspan="4">
                        <input type="text" name="display" id="display" disabled>
                    </td>
                </tr>
                <tr>
                    <td><input type="button" name="one" value="1" onclick="calculator.display.value += '1'"></td>
                    <td><input type="button" name="two" value="2" onclick="calculator.display.value += '2'"></td>
                    <td><input type="button" name="three" value="3" onclick="calculator.display.value += '3'"></td>
                    <td><input type="button" class="operator" name="plus" value="+" onclick="calculator.display.value += '+'"></td>
                </tr>
                <tr>
                    <td><input type="button" name="four" value="4" onclick="calculator.display.value += '4'"></td>
                    <td><input type="button" name="five" value="5" onclick="calculator.display.value += '5'"></td>
                    <td><input type="button" name="six" value="6" onclick="calculator.display.value += '6'"></td>
                    <td><input type="button" class="operator" name="minus" value="-" onclick="calculator.display.value += '-'"></td>
                </tr>
                <tr>
                    <td><input type="button" name="seven" value="7" onclick="calculator.display.value += '7'"></td>
                    <td><input type="button" name="eight" value="8" onclick="calculator.display.value += '8'"></td>
                    <td><input type="button" name="nine" value="9" onclick="calculator.display.value += '9'"></td>
                    <td><input type="button" class="operator" name="times" value="x" onclick="calculator.display.value += '*'"></td>
                </tr>
                <tr>
                    <td><input type="button" id="clear" name="clear" value="c" onclick="calculator.display.value = ''"></td>
                    <td><input type="button" name="zero" value="0" onclick="calculator.display.value += '0'"></td>
                    <td><input type="button" name="doit" value="=" onclick="calculator.display.value = eval(calculator.display.value)"></td>
                    <td><input type="button" class="operator" name="div" value="/" onclick="calculator.display.value += '/'"></td>
                
                </tr>
            </table>
        </div>

        <form name="calculator" action="calculadora" method="post">
            <p class="copy">
                <a href="http://www.github.com/gamebielo">&copy; Gabriel Carvalho</a>
            </p>
            <button type="submit" value="Historico">Ir para histórico</button>
        </form>
    </body>
</html>
