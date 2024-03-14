

/**
 *  Clase producto
 *  El nombre de las clases(plantillas) debe ser con UpperCamelCase
 *  Se recomienda que el nombre sea un sustantivo.
 * 
 *  Encapsulamiento: La encapsulación ayuda a proteger la integridad 
 *  de los datos y asegura que un objeto mantenga su estado interno 
 *  consistente. Al limitar el acceso directo a los datos internos 
 *  de un objeto, se reduce la posibilidad de que estos datos sean 
 *  modificados de manera incorrecta o que se produzcan efectos 
 *  secundarios no deseados.
 * 
 */
export class Product {

    // Para encapsular un atributo, le agregamos el 
    // símbolo de #
    #createdAt;

   // El método constructor nos ayuda a instanciar un objeto
    constructor(name, size="md" ){
        // crear atributos que tendrán los objetos
        this.name = name;
        this.price = 450;
        this.size = size;
        this.#createdAt = new Date().getTime();
        
        console.log(`Me llamo ${this.name} y fui creado en el tiempo ${this.#createdAt}` );
   }

   // Métodos setters y getters
   get createdAt(){
     return this.#createdAt;
   }
   /*
   set createdAt( newValue ){
     this.#createdAt = newValue;
   }
   */

}

/**
 * Herencia: mecanismo que permite a un objeto basarse en otro 
 * objeto existente para heredar propiedades y métodos. 
 * Esto permite la reutilización de código y la creación 
 * de relaciones entre objetos, lo que facilita la 
 * organización y la estructura del código.
 * 
 * Para heredar en la declaración de la clase se usa la palabra extends
 */
export class ProductPremium extends Product {
   
    constructor(name, size){
        //  Acceder al constructor de Product para inicializarlo
        super(name, size)
        super.price = 15000;
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