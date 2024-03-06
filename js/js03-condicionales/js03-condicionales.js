console.log("Sesion JS03 condicionales");


// ----------------- Condicional if-else --------------------
/*
 Ejecuta una sentencia si una condición específica es
 evaluada como verdadera.

 Sintaxis:
    if ( condición ) sentencia;

    if ( condición ) {
        sentencias;
    }

    if ( condición ) sentencia;
    else sentencia_si_condición_es_falsa;

    if ( condición ) {
        sentencias;
    }
    else {
        sentencias;
    }

    if (condición) sentencia;
    else if (condicion 2) sentencia;
         else sentencia_si_condicion2_es_falsa;


    if ( condicion1 ) sentencias;
    else if ( condicion2 ) sentencia;
    else if ( condicion3 ) sentencia;
    else if ( condicion4 ) sentencia;
     .....
    else if ( condicionN ) sentencia;
    else condición;   

*/

const temperatura = 40;
let mensaje = "";

if( temperatura === 22 ){
  mensaje = `Temperatura de ${temperatura} es ideal`;
} else if (temperatura >= 15 && temperatura <= 21) {
  mensaje = `Temperatura de ${temperatura} grados es fría.`;
} else if (temperatura >= 23 && temperatura <= 30) {
  mensaje = `Temperatura de ${temperatura} grados es calurosa.`;
} else {
  mensaje = `Temperatura de ${temperatura} grados no se clasifica como fría ni calurosa.`;
}

console.log( mensaje ); 


//--------------- Condicional Switch --------------------------
/*
 La condicional Switch evalua una expresión y se compara
 con el valor de cada instancia en 'case' y se ejecuta las
 sentencias asociadas a ese 'case' hasta encontrar
 la sentencia 'break' o se finalicen todas las sentencias
 de la condicional switch.

 Para comparar la condicional switch usa el operador estricto ===

 Sintaxis:
  switch (expresión) {
    case valor1:
        sentencia;
        break;
    case valor 2:
        sentencias;
        break;
    case valor n:
        sentencias;
        break
    default:
        sentencias;
        break;
  }

*/

const setVelocidadVentilador = ( velocidad )  => {
    let mensaje = "";
    switch( velocidad ){
        case 0:         
            mensaje = "apagado";
            break;
        case 1:
            mensaje = "Velocidad baja";
            break;
        case 2:
            mensaje = "Velocidad media";
            break;
        case 3:
            mensaje =  "Velocidad alta";
            break;
        default:
            mensaje = "El nivel no existe";
    }
    return mensaje;
}

console.log(`La velocidad del ventilador está en ${ setVelocidadVentilador(2)} `); 

// ------------------- Ejercicio Estaciones del año --------------------------
/*
 Preguntar por el número de mes (prompt o DOM), del 1 al 12
 Desplegar de acuerdo al mes un Alert (mostrarlo en el DOM) la estación del año.

 mes 12,  1,  2 = invierno.
 mes  3,  4,  5 = primavera
 mes  6,  7,  8 = verano
 mes  9, 10, 11 = otoño 

 Realizar una versión con if-else-elseif y otra con switch.

*/

const getInputValue = () => document.getElementById("user-input").value;

console.log("Entrada de usuario: " + getInputValue() );

const handleEstaciones = () => console.log("Selección: " + getInputValue());
