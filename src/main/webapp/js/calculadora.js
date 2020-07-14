var numeroA = 0;
var numeroB = 0;
var operacao = "";
var valorTotal = 0;
var flagOp = false; // Flag (se inseriu a operação ou não)

function digitar(valor){
    display = document.getElementById("display");

    if (flagOp){
        numeroB += valor;
    }

    if (display.value == "0" && valor != "."){
        display.value = "";
    }
    display.value += valor;
}

function clearDisplay(valor){
    display = document.getElementById("display");
    display.value = valor;

    numeroA = 0;
    numeroB = 0;
    valorTotal = 0;
    flagOp = false;
}

function OP(operador){
    digitado = document.getElementById("display").value;

    if (flagOp){
        calcular();
    }
    
    if (numeroA == ""){
        numeroA = digitado;
        operacao = operador;
    }            

    digitar(operador);
    flagOp = true;
}

function calcular(foiChamado){
    $.ajax({
        url: 'calcular',
        type: "post",
        data: {
                "numeroA":numeroA,
                "numeroB":numeroB,
                "operacao":operacao
              }
    }).done(function(resposta){
        inseriuOP = false;
        document.getElementById("display").value = resposta.toLocaleString("pt-BR");
        valorTotal += resposta;
    });
    
}