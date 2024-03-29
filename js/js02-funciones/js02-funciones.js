console.log("Sesión JS 02 - tipos de funciones");

/*
 Un bloque de código se define por {}
 Las variables declaradas con let y const
 dentro del bloque de código, solo tiene alcance (scope)
 dentro del mismo.
*/

var myVarA = "A";
let myVarB = "B";
const myVarC = "C";

function myScopeFunction() {
    var myVarFunctionVar = "var type";
    let myVarFunctionLet = "let type";
    const myVarFunctionConst = "const type";

     /* let y const tiene alcance de bloque
      Bloque de código: Los bloques de código son utilizados 
      para agrupar múltiples instrucciones y definir el 
      alcance de ciertas estructuras de control,
     */ 
     { // inicio de bloque de código
        console.log( myVarFunctionVar ); // "var type"
        console.log( myVarFunctionLet ); // "let type"
        console.log( myVarFunctionConst ); // "const type"
        {
            var myVarFunctionVar = "Nico";
            let myVarFunctionLet = "Andrés";
            const myVarFunctionConst = "José";  
            console.log( myVarFunctionVar ); // "Nico"
            console.log( myVarFunctionLet ); // "Andrés"
            console.log( myVarFunctionConst ); // "José"
        }
     } // fin de bloque de código

     console.log( myVarFunctionVar ); // "Nico"
     console.log( myVarFunctionLet ); // "let type"
     console.log( myVarFunctionConst ); // "const type"

}
myScopeFunction();
// var, let y const tienen function scope.
// solo tiene alcance dentro de la función.
// console.log( myVarFunctionVar );
// console.log( myVarFunctionLet );
// console.log( myVarFunctionConst );

// =======================================================================

/*
https://developer.mozilla.org/es/docs/Web/JavaScript/Guide/Functions

Función: Conjunto de instrucciones que realiza una tarea o calcula un valor.
  Código que se puede reutilizar.


  ----------- Funciones declaradas --------------
    (function declaration, function statement)
Una característica de las funciones declaradas es que tien hoisting.

sintaxis:
    function nombreFuncionCamelCase ( parámetros ){
        //cuerpo de la función
        instrucciones;
    }

hoisting: comportamiento en JS que permite a las declaración de variables(var)
o funciones se eleven al comienzo de su ámbito antes de que se ejecute el código.

*/
console.log( greeting() );

function greeting() {
    return "Hola Ch38";
}


/*
 ------------ Funciones expresadas -----------------------
            (function expressions)
Son funciones declaradas dentro de la asignación de una variable.
Estas funciones pueden ser anónimas ( no tienen nombre ).
Las funciones expresadas no tiene hoisting, porque no se
carga en memoria hasta que se utilice.

sintaxis:
    const nombreVariable = function nombreFuncion (parámetros){
        instrucciones;
    };
*/

// console.log(  sum(10, 20) ); // Cannot access 'sum' before initialization

const sum = function ( a , b){
    return a + b;
};

console.log(  sum(3, 15) ); // 18

// Pase por valor y pase por referencia =====================
// en los datos primitivos el pase es por valor
let age = 19;
let newAge = age; // 19
age = 40;
console.log( newAge ); // 19

// en los objetos el pase de datos es por referencia
let myArray = [1,2,3];
let numbers = myArray;
myArray.push(4); // agregamos un elemento al final del arreglo [1,2,3, 4]
console.log( numbers ); // [1,2,3,4];

// Clonar un array, para que sean objetos distintos.
// slice: crea una copia superficial del array original, desde el principio hasta el final.
let cloneNumbers = myArray.slice();
myArray.push(5);  // [1,2,3,4,5];
console.log( cloneNumbers ); // // [1,2,3,4];


/*
 ------------ Funciones autoinvocadas -----------------------
             (selft-invoking functions)
Funciones que se autoinvocan, se pueden definir con funciones anónimas.

sintaxis:
   ( function (parámetros ){} )( argumentos );

*/

(function myName( name ){
    console.log("my name is " + name );
})("Sergh");



/*
 ------------ Funciones flecha -----------------------
             (arrow functions)
Funciones similares a las funciones expresadas pero:
 - No requiere la palabra reservada function
 - Si tiene una solo instrucción no requiere las llaves {}
 - Si la instrucción es el mismo retorno, no requiere la palabra return

sintaxis:
    const nombreVariable = (parametros) => instrucción;

    const nombreVariable = (parametros) => {
        instrucción;
        return expresión;
    }
*/

// Función expresa  para calcular el área de un rectángulo.
//const areaRectangulo= function(altura,base) {
//    return altura * base;
//}
const areaRectangulo = (altura, base) => altura * base;

console.log('El area del rectangulo es:', areaRectangulo(5,10)); // 50


/*
 ------------ Parámetros por defecto -----------------------
             (default parameters)
Inicializa un parámetro de la función, si no se envía el argumento cuando se invoca

*/

// crear un arrow function que calcule 
// el área de un triángulo área= base * altura / 2;

const areaTriangulo= (altura = 1, base = 1) => (altura*base)/2;

console.log(`El area del triangulo es: ` + areaTriangulo(6,8)); // 24
console.log(`El area del triangulo es: ` + areaTriangulo(3)); // 1.5



/*
 ------------ Parámetros rest -----------------------
             (rest parameters)
Permite representar una serie de valores indefinidos en los argumentos
Esta serie de valores se presentan como un array.
Rest parameters debe estar al final de la lista de parámetros.

sintaxis:
     ...nombreParametros

*/

const sumatoriaMultiplesNumeros = ( ...restParameter  ) => {
    let suma= 0;
    
    for(let index = 0; index < restParameter.length; index++  ){
        suma = suma + restParameter[index]; // suma += restaParameter[index]
    }

    return suma;
}

console.log(`sumatoria múltiple ${sumatoriaMultiplesNumeros(4,5)}`); // 9
console.log(`sumatoria múltiple ${sumatoriaMultiplesNumeros(4,5,10,10)}`); // 29
console.log(`sumatoria múltiple ${sumatoriaMultiplesNumeros(4,5,10,10,50,50)}`); // 129


/*
 ------------ Funciones de Callback -----------------------
 Es una función(definida, expresada, arrow, anónima) que se pasa 
 a otra función como argumento.
 Se pasa en el argumento como referencia ( sin parentesis).
 */

/* function imprimerEnConsola ( mensaje){
    console.log(mensaje);
} */

/**  imprimir en consola */
const imprimirEnConsola =  mensaje => console.log(mensaje);

/**  imprimir en alert */
const imprimirConAlert = mensaje => alert(mensaje);

/**
 * Recibe un mensaje y lo imprime en un paragraph
 * @param {string} mensaje para imprimir en el DOM
 *
 */
const imprimirEnParagraph = mensaje => document.getElementById("message").innerHTML = mensaje  ;
 
imprimirEnConsola("Hola Ch38, día de frutas y verduras");
// imprimirConAlert("ahhhhhhhh");
// imprimirEnParagraph("Tengo hambre");

/**
 *  Función que imprima en consola o alert o paragraph (solo una opción).
 */
function imprimirMensaje(opcion,mensaje){
    if(opcion==="paragraph"){
       imprimirEnParagraph(mensaje);
    } else if (opcion==="alert"){
    imprimeAlert(mensaje);
    } else if(opcion==="consola"){
        imprimirEnConsola(mensaje);
    }else {
        console.log("elige otra opcion");
    }
}
imprimirMensaje( "opcion", "mensaje" );
imprimirMensaje( "consola", "Hola" );
// imprimirMensaje( "alert", "Hola" );
imprimirMensaje( "paragraph", "Hola" );

// implementando la anterior usando funciones de callback
const imprimirMensajeConCallbacks = ( fncCallBackImprime, mensaje  ) => fncCallBackImprime( mensaje);

// Invocando la función y enviando como argumento una función de callback
imprimirMensajeConCallbacks( imprimirEnConsola  , "Hola, ya merito nos vamos al primer descanso" );
imprimirMensajeConCallbacks( imprimirEnParagraph  , "Hola, ya merito nos vamos al primer descanso" );
imprimirMensajeConCallbacks( function(mensaje){ console.log(mensaje)}  , "Hola, ya merito nos vamos al primer descanso" );
imprimirMensajeConCallbacks( mensaje => console.log(mensaje)  , "Hola, ya merito nos vamos al primer descanso" );

// ==================== método de ordenamiento =========================

const nombres = [ "Nico", "Emma", "Donaji", "Erick", "Andrés", "Kris"];

// Debo ordenar de form ascendente
console.log(  nombres.sort() ); // ['Andrés', 'Donaji', 'Emma', 'Erick', 'Kris', 'Nico']

const frutas = ["Manzana", "zarzamora", "Pera", "fresa"]; // [Manzana, Pera, fresa, zarzamora]
console.log( frutas.sort() ); // ['Manzana', 'Pera', 'fresa', 'zarzamora']

const numeros = [ 5, 100, 3, 20 ]; 
console.log( numeros.sort() ); // 100, 20, 3, 5

function comparacion( a, b ){
    if( a < b ){
        return -1;        
    } else if( a > b ) { 
        return 1; // intercambia las posiciones
    } else {
        return 0;
    } 
}

function compare ( a, b){
    return a-b;
}
console.log( numeros.sort( comparacion )); // [3, 5, 20, 100]
console.log( [100, 20, 3, 5].sort( compare )); // [3, 5, 20, 100]

const comparacionDesendente = (a,b) => b-a;
console.log( [4,90,2,67].sort(  (a,b) => b - a) ); // orden descendente [ 90, 67, 4, 2]


// Solución ejercicio 1.
let arr = ["This", "is", "a", "sentence."];

function printOutString(arr) {
    let sentence = "";
    for (let wordIndex = 0; wordIndex < arr.length; wordIndex++) {
        sentence += " "+ arr[wordIndex]; // sentence = sentence + " "+ arr[wordIndex];
    }
    return sentence;
  }
  console.log(printOutString(arr)); // " This is a sentence."
  console.log( arr.join(" ")  );

  

// -------------- Recursividad ---------------------
/*
  Una función recursiva es una función que se llama así misma durante su ejecución.

  Se utilizan en algoritmos y soluciones que se basan en la división y conquista
  como cálculos matemáticos, recorrido de estructura de datos y algoritmos de búsqueda
  y ordenamiento.

  Patrón:
    function nombreFuncionRecursiva( parametro  ){
        if( condicionParo){
            return expresión;
        }
        else {
            // llamada recursiva
            nombreFuncionRecursiva( nuevoParametro );
        }
    }
*/

// Calcular el factorial de un número
// factorial de 5: 5 * 4 * 3 * 2 * 1;
function factorialConCicloFor( numero ) {
    let factorial = 1;
    for (let i=0; i < numero; i++) {
        factorial *= (numero - i);
    }
    return factorial;
}

const calculaFctorial2 = num => {
    let result = 1;
    for (let n = 1; n <= num; n++){
        result*=n;   
    }
    return result;
 }
console.log(  calculaFctorial2(5)); // 120
console.log(`El factorial de 5 es: ${ factorialConCicloFor(5)}`); // 120

// calculando el factorial con recursividad

function factorialConRecursividad( numero ){
    console.log(`Resolviendo el factorial de ${numero}`);
    if( numero <= 1  ) return 1 ;    
    const result = factorialConRecursividad( numero - 1 ) * numero ;
    console.log(`El factorial de ${numero} es ${result}`);
    return result;
}
console.log(`Resultado final: ${ factorialConRecursividad(5)}`); // 120

/*
    parámetro   recursividad(n-1)   returnFnc
    1            ----               1
    2          2-1 = 1              2
    3          3-1 = 2              6
    4          4-1 = 3              24
    5          5-1 = 4              120
*/

// =================================================
/*
 Generar una función recursiva que muestre en consola un saludo
 donde se indique el número saludo desado

 ej: saludar 10 veces

  Saludo 1
  Saludo 2
  Saludo 3
   ....
  Saludo 9
  Saludo 10

*/

const saludarMultipleVeces = numeroSaludos => {
    if(numeroSaludos>0){
        console.log(`Saludo ${numeroSaludos}`); 
        saludarMultipleVeces(numeroSaludos-1);
    }
}

saludarMultipleVeces(5);

const saludoRecursivo = ( numSaludo ) => {
    if( numSaludo > 1 ){
        saludoRecursivo( numSaludo - 1);
        console.log( numSaludo );
    } else {
        // el numSaludo = 1
        console.log( numSaludo );
    }
}
saludoRecursivo(5);
/*
    parámetro   recursividad(n-1)   console.log
    5                    4               5 
    4                    3               4
    3                    2               3
    2                    1               2
    1                   -----            1             

*/

// Refactorizando el saludo recursivo.
const saludarRecursivamente = (numeroSaludos) => {
	if (numeroSaludos > 1) saludarRecursivamente(numeroSaludos - 1);
	console.log("Saludo " + numeroSaludos);
}