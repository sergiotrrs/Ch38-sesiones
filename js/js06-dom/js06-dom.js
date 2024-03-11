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
