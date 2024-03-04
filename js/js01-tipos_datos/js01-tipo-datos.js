console.log("Sesión JS01 tipos de datos");

/* 
   Tipos de datos en JavaScript:
   - primitivos y no primitivos.
   - 7 datos primitivos.
   - primitivos: boolean, number, string, null, undefined, symbol, bigint
   - no primitivos: object.
*/

/*
  Tipo de dato string: "Hola", "hola", 'hola', `hola`, 
  empty string: ""
*/

/*
  Tipo de datos number: numéros pósitivos, negativos, NaN, +Infinity, -Infinity
*/
console.log(`Numbers: ${12}, ${-6}, ${9.56}, ${4/"ch30"}, ${5/0} `);

console.log(`Valor máximo representable en JavaScript: ${ Number.MAX_VALUE}`); // 1.7976931348623157e+308
console.log(`Si el valor es mayor a MAX_VALUE: ${1.79e309}`); // Infinity

console.log(`Valor entero seguro en JavaScript: ${ Number.MAX_SAFE_INTEGER}`); // 9007199254740991

/*
 Cuando se realizna operaciones que exceden los límites
 de MAX_SAFE_INTEGER se produce una pérdida de precisión.
*/
console.log( `MAx_SAFE_INTEGER + 1 : ${ Number.MAX_SAFE_INTEGER + 1} ` ); // 9007199254740992
console.log( `MAx_SAFE_INTEGER + 2 : ${ Number.MAX_SAFE_INTEGER + 2} ` ); // 9007199254740992 
console.log( `MAx_SAFE_INTEGER + 3 : ${ Number.MAX_SAFE_INTEGER + 3} ` ); // 9007199254740994
console.log( `MAx_SAFE_INTEGER + 4 : ${ Number.MAX_SAFE_INTEGER + 4} ` ); // 9007199254740996
console.log( `MAx_SAFE_INTEGER + 5 : ${ Number.MAX_SAFE_INTEGER + 5} ` ); // 9007199254740996

/*
 Tipos de datos BigInt
 Sirve para representar valos numéricos enteros, de los que el
 tipo number no puede representar o no es seguro.

 Las operaciones con un bigInt se deben hacer con otro bigint.

*/
const myBigInt = 9007199254740991n;
console.log(`Tipo de dato myBigInt: ${ typeof myBigInt }`);
console.log( `myBigInt + 1n : ${ myBigInt + 1n} ` ); // 9007199254740992
console.log( `myBigInt + 2n : ${ myBigInt + 2n} ` ); // 9007199254740993
console.log( `myBigInt + 3n : ${ myBigInt + 3n} ` ); // 9007199254740994
console.log( `myBigInt + 4n : ${ myBigInt + 4n} ` ); // 9007199254740995
console.log( `myBigInt + 5n : ${ myBigInt + 5n} ` ); // 9007199254740996

/*
 Tipo de dato undefined
  Una variable que es declarada pero el tipo
  de dato no es definido.

  let myVar;
*/
let myVar;
console.log(`Tipo de dato en myVar: ${myVar}`); // undefined

/*
 Tipo de dato null
 Una variable que intensionalmente se borra el tipo
 de dato.

*/
let myVarNull; // undefined
console.log(`Tipo de dato en myVarNull: ${ typeof myVarNull}`); // undefined
myVarNull = "Death Metal";
console.log(`Tipo de dato en myVarNull: ${typeof myVarNull}`); // string
myVarNull = null;
console.log(`Tipo de dato en myVarNull: ${typeof myVarNull}`); // object
console.log(`myVarNull es null: ${ myVarNull === null }`); // true

/*
 Tipo de dato boolean
 Tiene dos estados: true y false 

*/
console.log(`Tipo de dato verdadero: ${ true }`);
console.log(`Tipo de dato false: ${ false }`);

// =========================================================================
//              Objetos en JavaScript

// tipo de dato Object: Array
const cancionesPreferidas = [
    "Self love", 
    "Creep", 
    "No matter what", 
    "Wash off" 
];

// tipo de dato Object
const datosSergh = {
    name: "Sergio",
    lastName: "Torres",
    age: 40,
    email: "sergio.torres@idr.edu.mx",
    isActive: true,
    fullName:  function(){
        return `Nombre completo: ${datosSergh.name} ${datosSergh.lastName}`;
    }
 };

 const datosDaniel = {
    name: "Daniel",
    lastName: "Esquivel",
    age: 19,
    email: "esquivel@gmail.com",
    isActive: true,
    fullName:  function getFullName(){
        return `${datosDaniel.name} ${datosDaniel.lastName}`;
    }
 };

 const datosVictor = {};

 // imprimir el nombre y nombre completo de Sergio y Daniel
 console.log(`Es nombre es: ${ datosSergh.name } y su nombre completo es ${ datosSergh.fullName() }`);
 console.log(`Es nombre es: ${ datosDaniel.name } y su nombre completo es ${ datosDaniel.fullName() }`);

 console.log(cancionesPreferidas);
 console.log(datosSergh);
