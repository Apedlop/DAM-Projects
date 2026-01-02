// Agrega un event listener al objeto window que escucha el evento de desplazamiento (scroll)
window.addEventListener('scroll', function () {
    // Obtiene la cantidad de desplazamiento vertical desde la parte superior de la página y la guarda en la variable scrollTop
    const scrollTop = window.scrollY;

    // Obtiene una referencia al elemento de video de fondo usando su ID 'bgVideo'
    const video = document.getElementById('bgVideo');

    // Obtiene una referencia al contenedor del video utilizando su ID 'video-container'
    const videoContainer = document.getElementById('video-container');

    // Busca el elemento con la clase '.navigation-wrap', que es el contenedor de la barra de navegación
    const navigation = document.querySelector('.navigation-wrap');

    // Obtiene la altura de la barra de navegación y la guarda en la variable navHeight
    const navHeight = navigation.offsetHeight;

    // Aplica una transformación CSS al elemento de video ('bgVideo').
    // La transformación mueve el video hacia arriba en función del desplazamiento vertical, manteniendo el video centrado horizontalmente
    video.style.transform = `translateY(-${scrollTop}px)`;


});