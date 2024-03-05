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