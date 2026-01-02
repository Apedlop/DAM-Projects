const mitad = palabra => {
    let mitad = "";
    for (let i = 0; i < (palabra.length / 2); i++) {
        mitad += palabra.charAt(i);
    }
    return mitad;
}

const ultimo = palabra => palabra.charAt(palabra.length - 1);

const inversa = palabra => {
    let inversa = "";
    for (let i = palabra.length - 1; i >= 0; i--) {
        inversa += palabra.charAt(i);
    }
    return inversa;
}

const guion = palabra => {
    let guion = "";
    for (let i = 0; i < palabra.length; i++) {
        guion += palabra.charAt(i);
        i != palabra.length - 1 ? guion += "-" : guion += "";
    }
    return guion;
}

const vocales = palabra => {
    palabra = palabra.toLowerCase();
    let contadorVocales = 0;
    for (let i = 0; i < palabra.length; i++) {
        palabra[i] == 'a' || palabra[i] == 'e' || palabra[i] == 'i' || palabra[i] == 'o' || palabra[i] == 'u' ? contadorVocales++ : null;
    }
    return contadorVocales;
}

let palabra = prompt("Introduce una palabra: ");
document.write(`La primera mitad de los caracteres son: ${mitad(palabra)} <br>`);
document.write(`El último caracter es: ${ultimo(palabra)} <br>`);
document.write(`La palabra a la inversa es: ${inversa(palabra)} <br>`);
document.write(`La palabra separada por guines: ${guion(palabra)} <br>`);
document.write(`La palabra tiene un total de ${vocales(palabra)} vocales`);