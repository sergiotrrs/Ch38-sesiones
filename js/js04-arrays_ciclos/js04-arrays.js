console.log("Sesion JS04 arrays");

const nombre = [];

// Agregar elementos al final del arreglo
nombre.push("Sergh");
nombre.push("Emma", "Axel");

console.log( nombre ); // ['Sergh', 'Emma', 'Axel']

// Agregar elementos al inicio del arreglo
nombre.unshift("Dan");
nombre.unshift("Bastian", "Ara");

console.log( nombre ); // ['Bastian', 'Ara', 'Dan', 'Sergh', 'Emma', 'Axel']

// Eliminar el último elemento
nombre.pop();
console.log( nombre ); // ['Bastian', 'Ara', 'Dan', 'Sergh', 'Emma']

// Eliminar el primer elemento
nombre.shift();
console.log( nombre ); // [ 'Ara', 'Dan', 'Sergh', 'Emma']

// Buscar elementos dentro del arreglo
console.log(  nombre.indexOf("Frida")   ); // si el elemento no existe retorna -1
console.log(  nombre.indexOf("Frida")!= -1 ? "Existe" : "No Existe"   ); // No existe

console.log(  nombre.indexOf("Emma")   ); // 3
console.log(  nombre.indexOf("Emma")!= -1 ? "Existe" : "No Existe"   ); // Existe

// Vamos a agregar a Cristian al inicio y al final
nombre.push("Cristian");
nombre.unshift("Cristian");
console.log( nombre ); // ['Cristian', 'Ara', 'Dan', 'Sergh', 'Emma', 'Cristian']

// buscar a Cristian si existe y mostrar el índice
// indexOf entrega el indice del primer elemento que encuentre.
console.log(nombre.indexOf("Cristian")); // 0
// Podemos indicar a partir de que índice deseo buscar
console.log(nombre.indexOf("Cristian", 1 )); // 5

// Crear una copia (clonarlo) de un arreglo
const copyOfNames = nombre.slice();

// Método para eliminar elementos de un arreglo. También es posible agregar elementos
// splice() retorna los elementos eliminados

// Eliminar a Sergh y a Emma
// ['Cristian', 'Ara', 'Dan', 'Sergh', 'Emma', 'Cristian']
// ['Sergh', 'Emma'] -> string: 'Sergh,Emma'
console.log("Eliminado 2 elementos: " + nombre.splice(3, 2 ) ) // 'Sergh,Emma'
console.log( nombre ); //  ['Cristian', 'Ara', 'Dan', 'Cristian']

// Agregar después de Ara: Chongo, Penny
console.log("Elementos eliminados: " , nombre.splice(2, 0, "Chongo", "Penny" ) );
console.log( nombre );// ['Cristian', 'Ara', 'Chongo', 'Penny', 'Dan', 'Cristian']

// Iterar un arreglo

for (let i = 0; i < nombre.length; i++) {
    const element = nombre[i];
    console.log("Persona: " + element);    
}

// Iterar con ciclo for el arreglo de nombres
// y agregar a cada nombre lo siguiente <li> ${nombrePersona} <li>
// Crear un nuevo arreglo con cada elemento modificado
// nuevoArreglo [ <li>N1</li>, <li>N2</li>, ...<li>Nn</li>];
const nombresEnLista = [];

for (let i = 0; i < nombre.length; i++) {
    const element = nombre[i];
    // nombresEnLista.push("<li>" + element + "</li>");
    nombresEnLista.push(`<li class="list-group-item">${element}</li>`);
}
console.log(nombresEnLista); 
// ['<li>Cristian</li>', '<li>Ara</li>', '<li>Chongo</li>'
// , '<li>Penny</li>', '<li>Dan</li>', '<li>Cristian</li>']

document.getElementById("lista-nombres").innerHTML = nombresEnLista.join("");
// [2,3] -> string -> '2,3'
// ['<li>Cristian</li>', '<li>Ara</li>'] -> string -> '<li>Cristian</li>,<li>Ara</li>'
// ["hola", "Ch38"] -> 'hola Ch38" -> ["hola", "Ch38"].join(" ");

// Iterar el arreglo y generar un nuevo array.
// método map 

// Esta función se va a llamar por cada elemento del arreglo que tiene el método map
const myFncCallBack = ( element, index , array ) =>
     `soy el indice ${index}, valor ${element} del arreglo ${array}`;

const numbers = [1,5,7]
const duplicateOriginal = numbers.map( myFncCallBack );
const duplicate = numbers.map( element => element *2 );

console.log( numbers );
console.log( duplicateOriginal );
console.log( duplicate );


const products = ["Tostitos", "Tenis", "Chela", "Dulces"];
// Generar un lista de cada productos 
// <li class="list-group-item list-group-item-danger"> ${productName} </li>
// usando el método map

const productList = products.map( 
    (product) => `<li class="list-group-item list-group-item-success"> ${product} </li>`  
    );
document.getElementById("lista-productos").innerHTML = productList.join("");

// Simplificaciones en la iteración de un arreglo

// ----------------------- Uso de for... of ------------------
/* Ejecuta una sentencia por cada elemento de un objeto iterable(array, colección, string).
Sintaxis:
    for (const iterator of object) {
    
    }
*/
const apellidos = ["Cortes", "Martinez", "Torres"];

for (let index = 0; index < apellidos.length; index++) {
    const element = apellidos[index];
    console.log("Apellido: " + element );    
}

// for of
for(const apellido of apellidos){
    console.log("Apellido en forOf: " + apellido );
}

// ---------------- forEach -------------------------
/*
 Método que se utiliza para iterar colecciones, arreglos.
 Permite ejecutar una función por cada elemento del arreglo.

*/

const automoviles = ["Mazda", "Tsuru", "Susuki", "Ferrari", "Supra",  "Honda" ];
console.log( automoviles);
// Método para establecerrevertir un arreglo
 automoviles.reverse();
// imprimir cada elemento de forma individual del arreglo revertido
for (const auto of automoviles) {
    console.log("auto: " + auto);
}

// Uso de for each.
// automoviles.forEach()

/* automoviles.reverse().forEach( function(element, index, array){
    console.log(element);
}); */

automoviles.reverse().forEach(  auto => console.log(auto) );

/*
function funcParaForEach( element, index, array ){
    const letraMayus = element.toUpperCase();
    array[index] = letraMayus;
}

const letras = ["a", "b", "c"];
for (let index = 0; index < letras.length; index++) {
    funcParaForEach(letras[index], index, letras );    
}
*/

const letras = ["a", "b", "c"];
letras.forEach(  (letra, i, array) =>  array[i] = letra.toUpperCase() );

console.log( letras );

const letrasFinales = ["x", "y", "z"];
const nuevoArrayLetrasFinales = letrasFinales.map( letra => letra.toUpperCase() );
console.log(    nuevoArrayLetrasFinales     );
console.log(    letrasFinales     );

// ------------------- Uso de break en ciclos ----------------------------
// break no detiene la ejecución de la iteración en curso y termina el ciclo.

// Realizar la tabla de multiplicar del 5
// usando for loop

// quiero detener la iteración cuando num = 6

for (let num = 1; num <= 10; num++) {
    let resultado = 5 * num;
    console.log(`${num}x${5} = ${resultado}`);
    if( num === 6) {
        break;
    }
}

// Realizar la tabla de multiplicar del 1 al 5, multiplicarlo por 1 al 10
/*
for( let i = 1; i <= 5; i++ ){
    console.log(`valor de i: ${i}`);
    for( let j = 1; j <= 10; j++ ){
        // console.log(`valor de j: ${j}`);
        console.log(`${i} * ${j} = ${ i * j}`);
    }
}*/

// Uso de break en ciclos anidados.
// Romper con las iteraciones cuando sea i=3 * j= 4 
// ( No mostrar esa multiplicación, ni el resto)

holi: // uso de label
for( let i = 1; i <= 5; i++ ){
    console.log(`valor de i: ${i}`);
    for( let j = 1; j <= 10; j++ ){     
        if( i===3 &&  j===4  ) break holi;   
        console.log(`${i} * ${j} = ${ i * j}`);
    }

}

// Iteración de matrices.
// const cohortes = [ [], [], []  ];
const equipos = [ 
    ["Charly"  , "Axel"  , "Joce"    , "Alan"  ,"Karen", "Donaji", "Aline", "Ryan"], // 404
    ["Pedrito" , "Ari"   , "Esquivel", "Uli"   , "Penny", "Yetzel", "Eric", "Jesús"], // Java.lio
    ["Erick"   , "Chongo", "Giss"    , "Andres", "Fernando", "Frida", "Victor", "Dan", "Bastian"]  // LoopLegion
];

const javaLio = equipos[1];
console.log( javaLio ); //  ['Pedrito', 'Ari', 'Esquivel', 'Uli', 'Penny', 'Yetzel', 'Eric', 'Jesús']
// Imprimir a Ari
console.log(  javaLio[1] ); // Ari

// Imprimir a Uli directamente de la variable equipos
             //      F   C
console.log( equipos[1][3] ); // Uli

// Imprimir a Giss directamente de la variable equipos
console.log( equipos[2][2] ); // Giss

// Imprimir cada nombre de personas de los equipos y detenerse por completo
// cuando se encuentr el nombre de "Chongo"
