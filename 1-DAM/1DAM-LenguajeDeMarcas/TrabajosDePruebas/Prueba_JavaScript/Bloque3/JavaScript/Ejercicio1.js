const sumVectores = num => {
    let suma = 0;
    for (let i = 0; i < num.length; i++) {
        suma += num[i];
    }
    return suma;
}

const mayores36 = num => {
    let suma = 0;
    for (let i = 0; i < num.length; i++) {
        num[i] > 36 ? suma += num[i] : null;
    }
    return suma;
}

const mayores50 = num => {
    let suma = 0;
    for (let i = 0; i < num.length; i++) {
        num[i] > 50 ? suma += num[i] : null;
    }
    return suma;
}

const ingresarValores = num => {
    for (let i = 0; i < num.length; i++) {
        num[i] = parseInt(prompt(`Introduce el ${i + 1}º número: `));
    }
    return num;
}

let num = new Array(8);
let numeros = ingresarValores(num);
document.write(`Suma de todos los vectores: ${sumVectores(numeros)} <br>`);
document.write(`Suma de los vectores mayores de 36: ${mayores36(numeros)} <br>`);
document.write(`Suma de los vectores mayores de 50: ${mayores50(numeros)}`);