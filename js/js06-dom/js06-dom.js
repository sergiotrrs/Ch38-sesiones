console.log("JS06- api DOM");


/**
 *  Cambiar el contenido de un elemento HTML por medio de su ID
 */
const changeElementById = () => {
  // document: representa cualquier página web carga en el navegador
  //         sirve como punto e entrada al contenido de la página.
  //         document es el objeto principal del DOM.
  const message = document.getElementById("message");
  console.log(message);
  // innerHTML: proporciona acceso al contenido HTML de un elemento.
  message.innerHTML = "<strong>document</strong> es el objeto principal del DOM.";
};

changeElementById();

/**
 * Modificar elementos por su tag(etiqueta HTML)
 */
const changeElementsByTagName = () => {
  const unorderList = document.getElementsByTagName("ul"); // Colección de elementos
  console.log( unorderList );

  const paragraphs = document.getElementsByTagName("p"); 
  console.log( paragraphs );

  for(let paragraph of paragraphs ){
     paragraph.innerHTML += " más otro contenido "; 
  }
};

changeElementsByTagName();

/**
 * Modificar un elemento usando el selector universar
 */
const changeElementByQuerySelector = () => {
  const element = document.querySelector("#gato-image"); // seleccionar un elemento por su ID
  // const element = document.querySelector(".container"); // seleccionar por clase
  // const element = document.querySelector("h1"); // seleccionar por el tag
  // const element = document.querySelector("header h1"); // seleccionar un elemento por su tag  
  console.log( element );
  element && (element.innerHTML = "Modificando el elemento con el uso de QuerySelector");
};

changeElementByQuerySelector();


/** Crear nuevos elementos HTML */
const newElement = () => {
  // crear en memoria mi elemento
  const newSection = document.createElement("section"); // <section>   </section>
  newSection.innerHTML = `
     <div class="row">
      <div class="col-3 fondo-rosa" id="columna-dinamica"> col-3 </div>
      <div class="col-9"> col-9 </div>
     </div>
  `;
  const mainRef = document.querySelector("main"); // referencia del tag main

  /*
   Agrega un nodo al final de la lista de elementos secundarios 
   de un nodo primario especificado. 
   Si el hijo dado es una referencia a un nodo existente 
   en el documento, appendChild() lo mueve de su posición actual 
   a la nueva posición.
  */
  mainRef.appendChild(  newSection );

};

newElement();

/** Cambiar el color de fuente y fondo de un elemento */
const changeColor = () => {
  const textToChangeColor = document.querySelector("#columna-dinamica");
  console.log(textToChangeColor);
  textToChangeColor.style.color = "cyan"; // cambio de color de la fuente
  textToChangeColor.style.border = "thin solid red";
};

changeColor();


// ------------------ Propiedades de visualización ---------------
//                       Desaparecer el elemento
// display : none (quitar el elemento del DOM)
// visibility: hidden (ocultar el elemento)

const displayNoneElement = () =>{
  const div1 = document.querySelector("#div1");
  div1.style.display = "none"; // quitar el elemento.
}

const hiddenElement = () => {
  const div2 = document.querySelector("#div2");
  div2.style.visibility = "hidden"; // ocultar el elemento
}

const resetElements = () => {
  const div1 = document.querySelector("#div1");
  div1.style.display = "block";

  const div2 = document.querySelector("#div2");
  div2.style.visibility = "visible";

}
