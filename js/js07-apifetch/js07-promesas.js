console.log("JS07 - Promise");

/*
 Las promesa es un patrón asincrónico que se utiliza
 para manejer operaciones asíncronas.

 Las promesas permite realizar tareas asíncronas y
 manejar los resultados (éxito o error) en un momento posterior.

 Las promesas tiene 3 estados:

 1.- Pending: El estado inicial de una promesa antes de que se resulva o rechace
 2.- Resolved: La promesa se resuelve con un valor
 3.- Rejected: La promesa se rechaza con un razón

Resolve y reject con funciones de callback.
Para crear una promesa se usa el constructor de la clase Promise.

sintaxis:
    const pinkyPromise = new Promise ( fncCallBack );

*/
// const pinkyPromise = new Promise(  ()=>{}   );
// const pinkyPromise = new Promise(  (fncCallBackResolve, fncCallBackRejec)=>{}   );
const pinkyPromise = new Promise(  (fncCallBackResolve, fncCallBackRejec)=>{
  const hayAmor = false;

  if( hayAmor ){
    fncCallBackResolve( "Sin el alma de tu cuerpo siiiiiin tu latido" );
  } else {
    fncCallBackRejec( { code: 404, message: "Nuestros caminos ya no están alineados" }  );
  }

});

console.log("Antes de consumir la promera");
// pinkyPromise(); // pinkyPromise is not a function

// Forma correcta de consumir la promesa, usar el método then y catch
// myPromise.then().catch().finally();

// pinkyPromise.then(  ()=> ).catch( ()=> ).finally( ()=> );

/*
pinkyPromise
    .then( ()=> console.log("Que emoción, la promesa está en resolve") )
    .catch( ()=> console.log("F, que terriblemente absurdo es estar vivo") )
    .finally( ()=> console.log("Ni modos, así es la vida") );
*/

pinkyPromise
    .then( ( response )=> console.log("Respuesta resolve: " + response)  )
    .catch( ( error )=> console.log("Respuesta error " + error.message, JSON.stringify(error) ) );


console.log("Después de then y catch y pinkPromise");


/*
  Entrar a la catafixia
  Nombres de personas que pueden participar y ganar
  ["Giss", "Sergio", "Axel", "Nico", "Uli", "Ryan", "Joanna"]

  Si tu nombre no está en el arreglo: "una espantosa X, siga participando Cuate"

  Hacer que muestre si eres ganador o no, en tun tiempo de 5 segundos.

*/

/** promesa con argumentos */
const catafixia = ( name ) => {
    const personasGanadoras = ["Giss", "Sergio", "Axel", "Nico", "Uli", "Ryan", "Joanna"];
   // const myPromise = new Promise( ()=>{}  );
   const myPromise = new Promise( (resolve, reject )=>{
        
    if(  personasGanadoras.includes( name )  ){
        resolve(`Felicidades ${name}, has ganado un juego de sala de muebles troncoso` );
    } else {
       // reject("Una espantosa X, siga participando Cuate");
       setTimeout( ()=>reject("Una espantosa X, siga participando Cuate")  , 5000  );
    }

   } );

   return myPromise;
}

catafixia("Sergio")
    .then( response => console.log(response)  )
    .catch( error => console.log(error));

catafixia("Rodo")
    .then( response => console.log(response)  )
    .catch( error => console.log(error));





