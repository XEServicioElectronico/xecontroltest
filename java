// script.js
document.getElementById('controlForm').addEventListener('submit', function(event) {
    event.preventDefault();

    // Obtener la consola seleccionada
    const console = document.getElementById('console').value;
    const buttons = document.querySelector('input[name="buttons"]:checked').value;
    const joystick = document.querySelector('input[name="joystick"]:checked').value;

    let resultMessage = '';

    // Lógica simple de diagnóstico
    if (buttons === 'yes' && joystick === 'yes') {
        resultMessage = `El control de ${console} parece estar funcionando correctamente.`;
    } else {
        resultMessage = `El control de ${console} podría tener problemas. Verifica los botones y joystick.`;
    }

    // Mostrar el resultado del diagnóstico
    document.getElementById('diagnostic-result').innerText = resultMessage;
});
