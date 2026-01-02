function mostrarTexto(id) {
    // Obtener todos los elementos colapsables
    var elementos = document.getElementsByClassName('collapse-horizontal');

    // Ocultar todos los elementos excepto el que se va a mostrar
    for (var i = 0; i < elementos.length; i++) {
        if (elementos[i].id !== id) {
            elementos[i].classList.remove('show');
        }
    }

    // Mostrar el elemento correspondiente al ID proporcionado
    var elemento = document.getElementById(id);
    elemento.classList.toggle('show');
}