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
