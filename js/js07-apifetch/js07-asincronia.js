console.log("JS 07 asincronia");

// Api: Interfaz, algo que conecta a con b
// API: Interfaces que permiten que diferentes aplicaciones se comuniquen entre sí.

/*
    Programación síncrona.
 
  Ejecutar una tarea después de otra, de manera secuencial.
  Si una tarea tarda mucho tiempo en completarse, pruede bloquear el hilo
  de ejecución.

*/

const primerPaso = () => {
  console.log("01 - Inicio de mi programa");
};

const segundoPaso = () => {
  console.log("02 - Desarrollo de mi programa");
  for (let i = 0; i < 1_000_000_000.1; i++) {
    i * 2;
  }
};

const tercerPaso = () => {
  console.log("03 - Fin de mi programa");
};

/*
primerPaso();
segundoPaso(); // este procesa demora varios segundos
tercerPaso();
*/

/*
 Programación asíncrona.

 Las tareas no se bloquean entre sí.
 La programación asíncrona es fundamental en JavaScript para
  realizar operaciones no bloqueantes, como peticiones HTTP, 
  operaciones de lectura/escritura de archivos, etc., 
  lo que mejora el rendimiento y la capacidad de respuesta 
  de las aplicaciones.

  setTimeout()
   Establece un temporizador que ejecuta una función de callback
   una vez que expire el temporizador

   sintaxis:
     setTimeout( fncCallback, tiempo_ms, argumentos_fnc );
     setTimeout( ()=>{}  , tiempo_ms );

*/

const saludoPersona = (personName) => console.log("hola" + personName);

const pasoAsincrono = (name) => {
  //setTimeout(  fncCallback, 3000  );
  setTimeout(() => console.log(`Hola ${name}`), 3000);
  // setTimeout(  saludoPersona , 3000, name  );
};

/*
primerPaso(); // 01 - Inicio de mi programa
pasoAsincrono("Andrés"); // Hola Andrés
tercerPaso(); // 03 - finde mi programa
*/

// ------------------------- setInterval ------------------------
// Ejecuta una función de manera reiterada con un tiempo de retardo fijo
const pasoConIntervalo = (name) => {
  //setInterval( fncCallback, time_ms  );
  setInterval(
    () =>
      console.log(
        `Hola ${name} te saludo a las ${new Date().toLocaleString()}`
      ),
    3000
  );
};

/*
primerPaso(); // 01 - Inicio de mi programa
pasoConIntervalo("Ariana"); // Hola Ariana te saludo ... (cada 3 segundos se repite)
tercerPaso(); // 03 - finde mi programa
*/

// Obtener las referencias de los botones
const startInterval = document.getElementById("startInterval");
const stoptInterval = document.getElementById("stopInterval");
const resetInterval = document.getElementById("resetInterval");
const dateH2 = document.getElementById("dateH2");
let idInterval;

// generar evento de click(addEventListener) de cada botón
startInterval.addEventListener("click", () => {
  console.log("Estoy en StartInterval");
  // setInterval(funcCallBack, time_ms   );
  idInterval = setInterval( ()=> dateH2.innerHTML = new Date().toLocaleString(), 1000 );
  console.log(`ID del intervalo: ${idInterval}`);
  disableStartButton();
});

stoptInterval.addEventListener("click", () => {
  console.log("Estoy en StopInterval");
  clearInterval(  idInterval   );// Detener el intervalo usando el ID
  enableStartButton();
});

resetInterval.addEventListener("click", () => {
  dateH2.innerHTML="-----";
  console.log("Estoy en rsetInterval");
});

const stateButtons = ( startButtonActive, stopButtonActive, resetButtonActive  ) =>{
  startInterval.style.display = startButtonActive === true ? "inline": "none";
  stoptInterval.style.display = stopButtonActive === true ? "inline": "none";
  resetInterval.style.display = resetButtonActive === true ? "inline": "none";
}

const enableStartButton = () =>{
   stateButtons(true, false, false);
};

const disableStartButton = () =>{
  stateButtons(false, true, false);
};
enableStartButton();