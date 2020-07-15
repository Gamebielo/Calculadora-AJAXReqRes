
![GitHub followers](https://img.shields.io/github/followers/gamebielo?label=Gamebielo&style=social)

# Calculadora
Projeto da disciplina "Laboratório de Engenharia de Software", consiste em construir uma calculadora web na linguagem **JAVA** onde todas as contas devem ser feitas no *back-end*, que recebe via requisição **AJAX** os 2 operandos e a a operação a ser efetuada.

# Telas
A aplicação conterá 3 telas em seu total:

 - Tela de login;
 - Tela para realizar as contas;
 - Tela de histórico.

A tela de histórico contém todo o histórico de contas feitas pelo aplicativo, contendo também o usuário que a fez e o horário em que foi feito a conta.

# Banco de Dados
Dentro da pasta "bd" contém o arquivo sql correspondentes as tabelas da aplicação.
O nome da sua database deve ser igual o nome configurado no arquivo "src/main/resources/META-INF/persistense.xml" (linha 17).

## Instruções para importar o banco de dados
Abra um terminal dentro da pasta "bd" que contém o arquivo de banco de dados.

> Criando o database com o mesmo nome definido no arquivo "persistense.xml"

    > create database projeto_calculadora;

> Importando as tabelas para o database criado, normalmente o usuario padrão e a senha dos bancos são "root", "root".

    > Mysql -u usuario_do_banco -p senha_do_usuario projeto_calculadora < projetoCalculadora.sql
    
## Instruções para rodar o app
Dentro da pasta raiz da aplicação, abra o terminal.

> Realizando o build da aplicação.

    > gradle build

> Após o build,, rode a aplicação, a url será fornecida pelo terminal.

    > gradle apprun
Copie a url fornecida no terminal "http://localhost:8000/Calc", cole no seu navegador e navegue.

## Estrutura
Páginas JSP:

> src/main/webapp/jsp

Estilos (CSS):

> src/main/webapp/assets

Arquivo javascript, contento JQuery e comandos para a requisição AJAX:

> src/main/webapp/js

Servlets correspondentes

> src/main/java/controller

Models correspondentes:

> src/main/java/model

Cada página (JSP) do projeto localizadas em "src/main/webapp/sjp" contém um servlet correspondente, que estão localizados em "src/main/java/controller".
A pasta "src/main/java" também contém a pasta "model" que diz respeito a modelagem de cada registro da tabela, contento um arquivo para usuário e os cálculos feitos.
