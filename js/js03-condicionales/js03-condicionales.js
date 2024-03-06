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

const getInputValue = () => parseInt( document.getElementById("user-input").value );

console.log("Entrada de usuario: " + getInputValue() );

const estacionAño = (mes) => {    
    let estacion;
    switch(mes){
        case 12: case 1: case 2: 
            estacion = "invierno";
            break;
        case 3: case 4: case 5:
            estacion ="primavera";
            break;
        case 6: case 7: case 8:
            estacion ="verano";
            break;
        case 9: case 10: case 11:
            estacion ="otoño";
            break;
        default:
            estacion= `el mes ${mes} no existe`;
            break;
    }
    return estacion;
}

const estacionAñoConIf = ( month ) => {
    let estacion;
    if (month == 12 || month == 1 || month == 2 ) {
        estacion = "Invierno";
    } else if (month == 3 || month == 4 || month == 5 ) {
        estacion = "Primavera";
    } else if (month == 6 || month == 7 || month == 8 ) {
        estacion = "Verano";
    } else if (month == 9 || month == 10 || month == 11 ) {
        estacion = "Otoño";
    } else {
        estacion = `el mes ${month} no existe`;
    }
    return estacion;
}
// Si mensaje = invierno -> H1, caso contrario -> H5
const printMensaje = ( mensaje ) => {
    const mensajeH1 = `<h1>${mensaje}</h1>`;
    const mensajeH5 = `<h5>${mensaje}</h5>`;

    document.getElementById("message").innerHTML= `
    <div class="alert alert-success" role="alert">
         ${ mensaje === "Invierno" ? mensajeH1: mensajeH5  }
    </div>
    `;
}

const handleEstaciones = () => {
    const mes = getInputValue();
    console.log("Selección: " + mes);
    const mensaje = estacionAñoConIf(mes);
    printMensaje( mensaje );
}

// ------------------------ Operador ternario --------------------------
/*
 Es el único operador de JavaScript que tiene 3 operandos.
 Generalmente se utiliza como opción a la sentencia if-else.

 Sintaxis:
  condición ? expresiónSiCondiciónEsVerdadera : expresionSiCondiciónEsFalsa; 

*/

const pagoTarjetaCredito = true;
let msj;

if ( pagoTarjetaCredito ){
    msj = "A realizado el pago de su TC";
}else {
    msj = "No ha realizado el pago de su TC";
}

msj = pagoTarjetaCredito ? "A realizado el pago de su TC" : "No ha realizado el pago de su TC";