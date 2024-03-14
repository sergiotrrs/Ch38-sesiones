

/**
 *  Clase producto
 *  El nombre de las clases(plantillas) debe ser con UpperCamelCase
 *  Se recomienda que el nombre sea un sustantivo.
 */
export class Product {
   // El método constructor nos ayuda a instanciar un objeto
    constructor(name){
        console.log("Me llamo " + name );
        // crear atributos que tendrán los objetos
        this.name = name;
   }
}



const date = new Date(); // instanciar la clase Date(crear un objeto de tipo Date)
                        // al instanciar el objeto, se llama al método(función) constructor.








export const detallesUriel = {
    name: "Uriel",
    age: 18,
    eyesColor: "blue",
    isColdTeam: false,
    city: "CDmx"
}

export const detallesDamaris = {
    name: "Damaris",
    age: 28,
    eyesColor: "brown",
    isColdTeam: true
}

export const sum = (a,b)=> a + b;

// export {detallesUriel, detallesDamaris, sum, Product };