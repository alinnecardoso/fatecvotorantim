let lampada = document.getElementById("lampada");
let titulo = document.getElementById("titulo")

function ligar(){
    lampada.setAttribute("src", "luzLigada.gif");
    titulo.style.color = "red"
}
function desligar(){
    lampada.setAttribute("src", "luzDesligada.gif");
    titulo.style.color = "black"
}
function sumir(){
    lampada.style.display = "none";
}
function aparecer(){
    lampada.style.display = "inline";
}
function alternar(){
    if (lampada.getAttribute("src") == 'luzLigada.gif')
        desligar();
    else if (lampada.getAttribute("src") == 'luzDesligada.gif')
        ligar();
        
}
function piscar(){
    alternar()
    
}
setInterval(piscar, 500);