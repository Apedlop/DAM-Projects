window.addEventListener('load', () => {
    const contenedor_loader = document.querySelector('.contenedor_loader');
    contenedor_loader.style.opacity = 0;
    setTimeout(() => {
        contenedor_loader.style.display = 'none';
        // Mostrar las imágenes después de ocultar el loader
        document.querySelectorAll('.carousel__slide').forEach(element => {
            element.style.opacity = 1;
            element.style.transition = 'opacity 1s ease-in-out';
        });
    }, 1500);
});
