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