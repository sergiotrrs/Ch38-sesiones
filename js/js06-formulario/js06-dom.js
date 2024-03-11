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
register.addEventListener( "submit"  , ( e )=>{
   e.preventDefault();
   console.log("Estoy dentro del evento submit");
   
   // leer los inputs del formulario
   const newUser = { 
     email: register.elements["inputEmail"].value,
     password: register.elements["inputPassword"].value,
     address: register.elements["inputAddress"].value,
     checkbox: register.elements["gridCheck"].checked
     };

     console.table( newUser );

    // Verificar los campos
       // Si los campos son adecuados, enviar al servidor
       // Si no son adecuados, enviar mensaje de error

} );





const handleButton = ( element, e ) =>{
    /*
      e->event : representa el objeto de evento que se genera cuando ocurre
       una interacción del usuario.
    */
    console.log( element );
    console.log( e );
    console.log("He entrado en la función del botón");
};



