console.log("Js07- Api Fetch");

/*
 API: Application Programming Interface
   Permite la comunicación entre dos aplicaciones de software
   a travéz de un conjunto de reglas.

 La API Fetch nos ayuda a acceder y manipular 
 peticiones HTTP (DELETE, GET, POST, PUT).
 
 Sintaxis:
    fetch(resource, options)

*/

/** Usando fetch con then y catch */
const getProducts = ( url )=>{    
    fetch( url )
        .then( (resolve)=> resolve.json() ) // Conversión de JSON a Objeto de JS
        .then( (resolveJSON => { 
            console.log(resolveJSON); // muestra un array de objetos de productos
            // imprimir solo el titulo de cada producto
            for( let product of resolveJSON){
                console.log( product.title, product.rating.rate );
            }
        }))
        .catch( (error)=> console.error(error) );
};

// getProducts("https://fakestoreapi.com/products");

const getUsersUsingAsyncAwait = async ( url ) =>{

    const resolve = await fetch( url );
    const users = await resolve.json(); // convertir de JSON a Object
    console.log( users );
    // imprimir los emails solamente
    console.log(  users.map( user=> user.email  ) );

}
getUsersUsingAsyncAwait("https://fakestoreapi.com/users");

// Mostrar los nombres y email de los 12 usuarios de la siguiente url
// https://reqres.in/api/users?page=1 // 1 al 6
// https://reqres.in/api/users?page=2  // 7 al 12
// usando then/catch o async/await
                    // [ {last_name: "Lalo", email:".com"}, {}, {}   ]
const generateCards= ( users ) => {
                              // [ "<div>...</div", "", "" ];
    return users.map( user => `    
  <div class="col-12 col-md-4">
    <div class="card" >
        <div class="card-body">
        <h5 class="card-title">${ user.first_name}</h5>
        <h6 class="card-subtitle mb-2 text-body-secondary">${ user.email}</h6>
        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
        </div>
    </div>
  </div>
    `  );
}
              // [ "<div>...</div", "", "" ];
const printCards = ( cards ) => document.getElementById("user-cards").innerHTML= cards.join("");
                                                                        //  "<div>...</div" "" "" ;

const getUsers = async(url) =>{
    const resolve = await fetch( url );
    const requestData = await resolve.json();
    const users = requestData.data; // Obtener el arreglo de usuarios
    // user = [ {email="",...} , {}, {}  ]
    printCards(  generateCards( users ) );
}

const handleButton = () =>{
    // evaluaciones diversas
    // getUsers("https://reqres.in/api/users?page=1");
    getUsers("https://reqres.in/api/users?delay=3");
}



/*
JSON (JavaScript Object Notation) es un formato de texto ligero para el intercambio de datos. 
Algunas de sus características incluyen:

-Es un formato de texto plano y fácil de leer.
-Utiliza una estructura de pares clave-valor para representar datos.
-Utiliza comillas dobles para encerrar las claves y los valores.
-Utiliza comas para separar los pares clave-valor.
-Utiliza corchetes para representar arreglos.
-Utiliza llaves para representar objetos.
-Utiliza valores booleanos, números, cadenas, arreglos y objetos 
para representar datos.
-Es independiente del lenguaje, ya que se puede utilizar en 
una variedad de lenguajes de programación.
-Es ampliamente utilizado en aplicaciones web y móviles para transmitir 
y recibir datos de un servidor.
-Es un estándar abierto y no tiene restricciones de uso ni de licencia.

Es importante mencionar que JSON es un subconjunto de JavaScript y por lo tanto, 
es una forma de representar objetos y arreglos en JavaScript, 
pero no es lo mismo que JavaScript. 
JSON solo puede representar un subconjunto de los valores que 
se pueden representar en JavaScript.

JSON tiene algunas restricciones de datos que debes tener en cuenta al trabajar con él:

-Solo puede contener pares clave-valor: cada elemento en un objeto JSON 
 debe ser un par clave-valor.
-Las claves deben ser cadenas: las claves en un objeto JSON deben 
 ser cadenas y deben estar encerradas entre comillas dobles.
-Los valores pueden ser de ciertos tipos: los valores en un objeto 
 JSON pueden ser números, cadenas, booleanos, objetos, arreglos o null. 
 No se permiten otros tipos de datos como funciones o fechas.
-No se permite la notación de punto flotante: los números en 
 JSON deben ser enteros o de punto flotante en notación decimal. 
 No se permiten notaciones científicas.
-Las cadenas deben estar encerradas en comillas dobles: las cadenas 
 en JSON deben estar encerradas entre comillas dobles. No se permiten comillas simples.
-No se permite el uso de comentarios: JSON no admite comentarios, 
 así que si necesitas incluir información adicional sobre tus datos, 
 tendrás que utilizar otro medio para hacerlo.
-Las comas son necesarias: cada elemento en un objeto o arreglo 
JSON debe estar separado por una coma, excepto el último.



*/