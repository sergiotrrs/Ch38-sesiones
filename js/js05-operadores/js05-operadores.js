console.log("Js-05 operadores");

// ---------------- Opéradores aritméticos ----------------
/* 
   adición +
   multiplicación *
   substracción -
   división /
   resto %
   exponencial **  - Math.pow(2, 3)   2**3
*/


// ---- Precedencia de operadores -------------------------
// https://developer.mozilla.org/es/docs/Web/JavaScript/Reference/Operators/Operator_Precedence

console.log(  3 * 2 / 2  ); // 3
console.log(  3 / 2 * 2  ); // 3
console.log(  2 * 4 / 2**3 ); // 1
console.log(  3 ** 2 ** 3  ); // 6561

// ------- Operadores de asignación ----------------
/*
 Asigna un valor a su operador izquierdo basándose en el valor
 de su operando derecho:

 asignación =
 
 Operadores abreviados ( compuestos ):
  op1 += op2  -> op1 = op1 + op2
  op1 -= op2  -> op1 = op1 - op2
  op1 *= op2  -> op1 = op1 * op2

*/

let fraseBurro = "Ahí te voy San Pedro";

// fraseBurro = fraseBurro + " Ahora somo Sexys!";
// usando operadores compuestos
fraseBurro += " Ahora somo Sexys!";
console.log( fraseBurro );

// Ejercicio
let animalesEnPantano = 3;
console.log(  animalesEnPantano += 3 * (3 ** 3) + 10 ); // 94

// -------------- Operadores unarios ------------------
// Solo actuan sobre un operando
// Negación unaria
let numero = 3;
let dinero = - numero; // -3
console.log( numero, dinero ); // 3 , -3

// suma unaria
let pago = + dinero; // -3
console.log( pago ); // -3

let interes = "5.23"; // string
console.log( interes + 5 ); // '5.235'
console.log( interes - 5 ); // conversión implícita de "intereses") 5, r: 0.23

console.log(  parseFloat(interes) + 5 ); // '10.23'
console.log(  +interes + 5 ); // '10.23'

console.log( interes += 5 + + "3" ); // 5.238


// Operador de incremento y decremento en unidad.
/*
  Operador de pre-incremento y pre-decremento
    ++ valor
    -- valor

  Operador de post-incremento y post-decremento
    valor ++
    valor --

*/

let number = 10;
++ number; // number = number + 1; primero lo incrementa y se entrega su valor
console.log( number ); // 11
number ++; // number; number = number + 1; primeo entrega su valor y luego incrementa
console.log( number ); // 12

number = 20;
console.log( number   ); // 20
console.log( ++number ); // 21
console.log( number++ ); //21
console.log( number   ); // 22

number = 100;
console.log(  number += 50 + ++number ); // 251
console.log( number ); // 251


number = 100;
let nuevaVariable
console.log(  nuevaVariable = 50 + number++ ); // 150
console.log( number ); // 101

// ===============================

let x = 3;  
let y = ++x; // y:4 x:4          ( ++x   -> x = x +1)

console.log(`x :${ x++ } y:${ ++y }`); //  x: 4 (sig. 5)  y: 5
console.log(`x :${ x } y:${ y }`); // 5, 5

// ==================
number = 10;
let otroNumber = 15;
let res = 0;
res += 10 * number++ * otroNumber++;

console.log(res, number, otroNumber); // 1500, 11, 16


// let a = b = 0; b es declarada con var
let a = 0, b = 0;

for(  ; a < 3 ; b = a++ ){ 
    console.log( a, b);
    // iteracion    a    b
    //   1          0    0
    //   2          1    0
    //   3          2    1

}
console.log( a, b); // 3  , 2


a = 0, b = 0;
for(  ; a < 3 ; b = ++a ){ 
    console.log( a, b);
    // iteracion    a    b
    //   1          0    0         
    //   2          1    1          
    //   3          2    2        

}
console.log( a, b); // 3 , 3

// ---------------- Operadores lógicos && y || ---------------
/*
 También son conocidos como operadores de corto circuito ( short-circuit operators ).

 &&  : La evaluación se detiene tan pronto como se encuentra un operador falso.
       Ya no se evalua el segundo operando y se retorna la expresión de OP1.
 OP1 && OP2 Si OP1 es verdadero, se retorna la expresión de OP2.
 OP1 || OP2 Si OP1 es verdadero, se retorna la expresión de OP1.

*/

const va = true;
const vb = false;
const vc = true;

console.log( va || vb && vc  ); // true

// Se consideran falsos: "", 0, null, undefined, NaN

console.log(  va && "Por ti baby, seria batman"  ); // "Por ti baby, seria batman"
console.log(  vb && "Bromeas, es un papucho"  ); // false
console.log(  NaN && "ya merito?!"  ); // NaN
console.log(  "false" && "ya merito?!"  ); // "ya merito?!
console.log(  "" && "gracias a dios ya es viernes"  ); // ""
console.log(  "Tu conoces a pimpon?" && ""  ); // ""
console.log(  "Si se lava la carita!!" && "Mi lord, lo encontramos !!" ); //"Mi lord, lo encontramos !!"

console.log(  "Listo Calixto" || ""  ); // "Listo Calixto"

// console.log(  variableSinDeclarara  ); // variableSinDeclarara is not defined
console.log( "Grúñeme" || variableSinDeclarar ); // "Grúñeme"
console.log( " *sonríe en espejo* "); // 

const gatoConBota = {
    name: "Gato",
    numVidas: 1,
    color: "naranja",
    image: ""
};

console.log( gatoConBota.pareja); // undefined

if ( gatoConBota.pareja !== undefined ) console.log( gatoConBota.pareja);
else console.log("El gato no tiene definida su pareja");

gatoConBota.pareja && console.log( gatoConBota.pareja); // no imprime nada
gatoConBota.color && console.log( gatoConBota.color); // "naranja"
gatoConBota.image && console.log( gatoConBota.image); // no imprime nada

