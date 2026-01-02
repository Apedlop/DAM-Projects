function loadXMLDoc() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            myFunction(this);
        }
    };
    xmlhttp.open("GET", "muertos.xml", true);
    xmlhttp.send();
}

function myFunction(xml) {
    var i;
    var xmlDoc = xml.responseXML;
    var table = "<table class='estilos'><tr><th>Nombre</th><th>Asesino</th><th>Causa</th><th>Día de la muerte</th></tr>";
    var x = xmlDoc.getElementsByTagName("PERSONAJE");
    for (i = 0; i < x.length; i++) {
        table += "<tr><td>" +
            x[i].getElementsByTagName("NOMBRE")[0].childNodes[0].nodeValue +
            "</td><td>" +
            x[i].getElementsByTagName("ASESINO")[0].childNodes[0].nodeValue +
            "</td><td>" + // Corrección aquí
            x[i].getElementsByTagName("CAUSA")[0].childNodes[0].nodeValue +
            "</td><td>" + // Corrección aquí
            x[i].getElementsByTagName("DIA")[0].childNodes[0].nodeValue +
            "</td></tr>";
    }
    table += "</table>";
    document.getElementById("demo").innerHTML = table;
}