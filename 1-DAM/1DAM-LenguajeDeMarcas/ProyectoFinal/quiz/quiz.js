var app = angular.module('quizApp', []);

app.controller("QuizController", function ($scope) {
    // Preguntas del cuestionario
    $scope.currentPage = 0;
    $scope.questions = [
        {
            text: "1. ¿Qué rasgo valoras más?",
            options: [
                { text: "Valentía", value: "Gryffindor" },
                { text: "Lealtad", value: "Hufflepuff" },
                { text: "Inteligencia", value: "Ravenclaw" },
                { text: "Ambición", value: "Slytherin" }
            ]
        },
        {
            text: "2. ¿Cuál es tu clase favorita en Hogwarts?",
            options: [
                { text: "Encantamientos", value: "Ravenclaw" },
                { text: "Defensa Contra las Artes Oscuras", value: "Gryffindor" },
                { text: "Pociones", value: "Slytherin" },
                { text: "Herbología", value: "Hufflepuff" }
            ]
        },
        {
            text: "3. ¿Qué criatura mágica te gusta más?",
            options: [
                { text: "Niffler", value: "Hufflepuff" },
                { text: "Fénix", value: "Ravenclaw" },
                { text: "Hipogrifo", value: "Gryffindor" },
                { text: "Basilisco", value: "Slytherin" }
            ]
        },
        {
            text: "4. ¿Dónde te sentirías más cómodo/a en Hogwarts?",
            options: [
                { text: "Sala Común", value: "Gryffindor" },
                { text: "Invernaderos", value: "Hufflepuff" },
                { text: "Biblioteca", value: "Ravenclaw" },
                { text: "Mazmorras", value: "Slytherin" }
            ]
        },
        {
            text: "5. ¿Cuál es tu deporte mágico favorito?",
            options: [
                { text: "Quidditch", value: "Gryffindor" },
                { text: "Ajedrez Mágico", value: "Ravenclaw" },
                { text: "Gobstones", value: "Hufflepuff" },
                { text: "Duelo de Magos", value: "Slytherin" }
            ]
        },
        {
            text: "6. ¿Qué poción te gustaría preparar?",
            options: [
                { text: "Felix Felicis (Suerte líquida)", value: "Gryffindor" },
                { text: "Poción Multijugos (Cambiar de forma)", value: "Slytherin" },
                { text: "Veritaserum (Decir la verdad)", value: "Ravenclaw" },
                { text: "Amortentia (Poción de amor)", value: "Hufflepuff" }
            ]
        },
        {
            text: "7. ¿Cuál es tu hechizo preferido?",
            options: [
                { text: "Expelliarmus (Desarmar)", value: "Gryffindor" },
                { text: "Lumos (Luz)", value: "Ravenclaw" },
                { text: "Wingardium Leviosa (Levitar)", value: "Hufflepuff" },
                { text: "Sectumsempra (Cortes profundos)", value: "Slytherin" }
            ]
        },
        {
            text: "8. ¿Cómo prefieres pasar tu tiempo libre en Hogwarts?",
            options: [
                { text: "Aventuras en el Bosque Prohibido", value: "Gryffindor" },
                { text: "Estudiando en la Biblioteca", value: "Ravenclaw" },
                { text: "Ayudando en la enfermería", value: "Hufflepuff" },
                { text: "Explorando los Pasillos Secretos", value: "Slytherin" }
            ]
        },
        {
            text: "9. ¿Qué objeto mágico es tu favorito?",
            options: [
                { text: "Capa de Invisibilidad", value: "Gryffindor" },
                { text: "Pensadero", value: "Ravenclaw" },
                { text: "Piedra de Resurrección", value: "Hufflepuff" },
                { text: "Horrocrux", value: "Slytherin" }
            ]
        },
        {
            text: "10. ¿Cuál es tu estación favorita en Hogwarts?",
            options: [
                { text: "Navidad", value: "Gryffindor" },
                { text: "Halloween", value: "Ravenclaw" },
                { text: "Día de San Valentín", value: "Hufflepuff" },
                { text: "Inicio de Clases", value: "Slytherin" }
            ]
        }
    ];

    // Rango de páginas para la paginación
    $scope.range = function () {
        var rangeSize = $scope.questions.length;
        var ret = [];
        for (var i = 0; i < rangeSize; i++) {
            ret.push(i);
        }
        return ret;
    };

    // Función para ir a la página anterior
    $scope.prevPage = function () {
        if ($scope.currentPage > 0) {
            $scope.currentPage--;
        }
    };

    // Determina si el botón de página anterior debe estar deshabilitado
    $scope.pagePrevDisabled = function () {
        return $scope.currentPage === 0 ? "disabled" : "";
    };

    // Cantidad total de páginas
    $scope.conteo = function () {
        return Math.ceil($scope.questions.length) - 1;
    };

    // Función para ir a la página siguiente
    $scope.nextPage = function () {
        if ($scope.currentPage < $scope.conteo()) {
            $scope.currentPage++;
        }
    };

    // Determina si el botón de página siguiente debe estar deshabilitado
    $scope.pageNextDisabled = function () {
        return $scope.currentPage === $scope.conteo() ? "disabled" : "";
    };

    // Establece la página actual
    $scope.setPage = function (page) {
        $scope.currentPage = page;
    };

    // Calcula el resultado del cuestionario
    $scope.calculateResult = function () {
        const selectedAnswers = [];
        $scope.questions.forEach((question, index) => {
            const selectedOption = document.querySelector(`input[name='q${index + 1}']:checked`);
            if (selectedOption) {
                selectedAnswers.push(selectedOption.value);
            }
        });

        const houseCounts = {
            Gryffindor: 0,
            Hufflepuff: 0,
            Ravenclaw: 0,
            Slytherin: 0
        };

        selectedAnswers.forEach(answer => {
            houseCounts[answer]++;
        });

        let resultHouse = '';
        let maxCount = 0;

        for (const house in houseCounts) {
            if (houseCounts[house] > maxCount) {
                maxCount = houseCounts[house];
                resultHouse = house;
            }
        }

        // Muestra el resultado en un modal
        $scope.resultText = `¡Felicidades! ¡Tu casa es ${resultHouse}!`;

        // Mostrar el escudo correspondiente en el modal
        var imgSrc = '';
        switch (resultHouse) {
            case 'Gryffindor':
                imgSrc = '../Hogwarts/Casas/image/Gryffindor.jpg';
                break;
            case 'Hufflepuff':
                imgSrc = '../Hogwarts/Casas/image/Hufflepuff.jpg';
                break;
            case 'Ravenclaw':
                imgSrc = '../Hogwarts/Casas/image/Ravenclaw.jpg';
                break;
            case 'Slytherin':
                imgSrc = '../Hogwarts/Casas/image/Slytherin.jpg';
                break;
        }
        $scope.resultImage = imgSrc;

        document.getElementById('resultModal').classList.add('active');
    };

    // Cierra el modal
    $scope.closeModal = function () {
        document.getElementById('resultModal').classList.remove('active');
    };
});
