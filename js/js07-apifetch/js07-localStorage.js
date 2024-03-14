console.log("JS07 - local Storage");

/*
El almacenamiento local (local storage) es una característica 
de los navegadores web que permite a las aplicaciones web 
almacenar datos de forma persistente en el dispositivo 
del usuario. A diferencia de las cookies, que tienen un tamaño 
limitado y se envían con cada solicitud HTTP, 
el almacenamiento local permite almacenar cantidades mucho 
mayores de datos y no se transmite al servidor 
con cada solicitud.

*/

// Almacenar datos
localStorage.setItem("nombreInstructor", "Yo merengues");
// Para guardar un objeto se recomienda almacenarlo en formato JSON
// localStorage.setItem("datosMascota", {name:"Solovino", age:15} ); // [Object, Object]
localStorage.setItem("datosMascota", JSON.stringify( {name:"Solovino", age:15} ) ); // json: {"name":"Solovino", "age":15}

// Recuperar un dato
const nombreInstructor = localStorage.getItem("nombreInstructor");
console.log( nombreInstructor );

// Recuperar un objeto que fue guardado como JSON
const recuperDatos = localStorage.getItem( "datosMascota" );
console.log( typeof recuperDatos   ); // string
console.log( JSON.parse(recuperDatos)   ); // convertir de JSON a Object

// remover una clave
localStorage.removeItem( "nombreInstructor" );

// remover todas las claves
// localStorage.clear();
