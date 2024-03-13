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
    if( isUserValid( newUser) ){
        postUser( newUser); // Si los campos son adecuados, enviar al servidor
    }              

} );

//** Verificar datos del nuevo usuario */
const isUserValid = ( newUser ) =>{
    let isValid = true;
    const message = [];
    if( newUser.password.length < 8  ){
        isValid = false;
        message.push("El password debe ser mayor a ocho caracteres");
    }
    if(! /[a-zA-Z0-9_-]/.test(newUser.password) ){
        isValid = false;
        message.push("El password debe solo letras y números");
    }
    // Validar que el correo electrónico su dominio sea .edu
    if( !newUser.email.endsWith(".edu") ){
        isValid = false;
        message.push("Solo se acepta un email con dominio .edu");
    }

    if( ! isValid ) showUserError( message );
    else showUserError( [] );

    return isValid; // { isValid, message }
} 

const showUserError= (errorMessage)=>{
    let alert = "";
    for (let message of errorMessage ){
        alert += `<li>${message}</li>`
    }

    document.getElementById("error-message").innerHTML= alert;
}

//** Enviar los datos al servidor */
const postUser = async ( newUser ) => {
    // TODO enviar datos al servidor

    const url = "https://reqres.in/api/users";
    const options = {
        method: "POST", // POST, PUT, DELETE, GET
        header: { "Content-Type":"application/json" },
        body:  JSON.stringify( newUser ) // conversión de Object a JSON
    }

    const response = await fetch( url, options  );
    console.log( response )
    if (response.status === 201){
        const userCreated = await response.json();
        console.log( userCreated)
        alert("Usuario creado con éxito el " + userCreated.createdAt);
    }
} 


const handleButton = ( element, e ) =>{
    /*
      e->event : representa el objeto de evento que se genera cuando ocurre
       una interacción del usuario.
    */
    console.log( element );
    console.log( e );
    console.log("He entrado en la función del botón");
};



