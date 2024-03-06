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




