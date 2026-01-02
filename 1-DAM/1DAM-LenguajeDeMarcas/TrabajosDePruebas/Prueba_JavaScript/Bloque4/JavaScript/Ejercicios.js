// Ejercicio 1
const vaciar = control => control.value = "";

const alerta = control => {
    let longitud = control.value;
    longitud.length < 7 ? alert("Su clave tiene menos de 7 caracteres.") 
    :
    longitud.length > 20 ? alert("Su clave tiene más de 20 caracteres.")
    :
    null;
}

// Ejercicio 2
const enlace = url =>  window.location = url;

// Ejercicio 3
const mostrarAlerta = () => alert("La página se ha cargado correctamente.");

// Ejercicio 4
const abrirParametros = () => open('https://www.google.com', 'Google', 'status=yes,width=600,height=300,menubar=yes');

// Ejercicio 5
const verificarEntrada = () => {
    let num = parseInt(Math.random() * 3); 
    num == 0 ? window.location = 'http://www.outlook.com' 
    : 
    num == 1 ? window.location = 'https://www.gmail.com' 
    :
    window.location = 'https://www.yahoo.com';
}

// Ejercicio 6
const abrirVentana = () => open('https://www.google.com', 'Google', `width=${screen.width}, height=${screen.height/2}, menubar=yes`);