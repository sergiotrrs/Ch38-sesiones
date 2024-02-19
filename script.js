console.log("Hola Ch38");

// Función que envie un saludo con alert.
function enviarSaludo(){
    alert('¡Hola Ch38!');
}

/**
 * Pedir el nombre de la persona usando prompt()
 * Mostrar un saludo y nombre de la persona con alert()
 */
function enviarSaludoAPersona() {
    let message = prompt("Hola usuario dime tu nombre");
    alert(`Hola ${message}`);
}


function convertirTextoAArray(texto){
    return texto.split(" ");
}
