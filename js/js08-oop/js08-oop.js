import {detallesUriel, detallesDamaris, sum, Product, ProductPremium} from './js08-product-class.js';

console.log("JS 08 Programación orientada a objetos");
console.log( detallesUriel );
console.log( detallesDamaris );
console.log( sum(10,5) ); // 15

const pastelChocolate = new Product("Chocolate");
// intanciar la clase Product y llamarlo Vainilla
const pastelVainilla = new Product("Vainilla", "xl");

console.log( pastelChocolate.name, pastelChocolate.price, pastelChocolate.size ); // 450
console.log( pastelVainilla.name, pastelVainilla.price ); // 450

pastelVainilla.price = 200;
console.log( pastelVainilla.name, pastelVainilla.price, pastelVainilla.size ); // 200
console.log( pastelVainilla.createdAt );

// No se puede modificar, por que no tiene su método set
// pastelVainilla.createdAt = 0;

const pastelBodas = new ProductPremium("Colosal","XXXL");
console.log( pastelBodas.name, pastelBodas.price, pastelBodas.size);
pastelBodas.size = "XXXXXXL";
console.log( pastelBodas );
