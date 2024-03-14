import {detallesUriel, detallesDamaris, sum, Product} from './js08-product-class.js';

console.log("JS 08 Programación orientada a objetos");
console.log( detallesUriel );
console.log( detallesDamaris );
console.log( sum(10,5) ); // 15

const pastelChocolate = new Product("Chocolate");
// intanciar la clase Product y llamarlo Vainilla
const pastelVainilla = new Product("vainilla");

console.log( pastelChocolate.name );

