function digitar(valor){
    display = document.getElementById("display");
    if (display.value == "0" && valor != "."){
        display.value = "";
    }
    display.value += valor;
}

function clearDisplay(valor){
    display = document.getElementById("display");
    display.value = valor;
}