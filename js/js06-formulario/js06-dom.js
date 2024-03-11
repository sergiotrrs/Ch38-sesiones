console.log("Js06 formulario");

// Obtenemos la referencia del formulario.
// const register = document.querySelector("form");
//const register = document.getElementById("register-form");
const register = document.forms["register-form"];

/**
 *  AddEventListener permite agregar funciones que se ejecutarán
 *  en respuesta a un evento específico que ocurre aun elemento del DOM.
 * 
 *  register.addEventListener( type  , fncCallback );
 * 
 *  addEvenListener podemos manejar interacciones del usuario como clics,
 * cambios de teclado, movimientos del mouse, entre otros.
 */
register.addEventListener( type  , fncCallback );

