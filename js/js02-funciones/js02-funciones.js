console.log("Sesión JS 02 - tipos de funciones");

/*
 Un bloque de código se define por {}
 Las variables declaradas con let y const
 dentro del bloque de código, solo tiene alcance (scope)
 dentro del mismo.
*/

var myVarA = "A";
let myVarB = "B";
const myVarC = "C";

function myScopeFunction() {
    var myVarFunctionVar = "var type";
    let myVarFunctionLet = "let type";
    const myVarFunctionConst = "const type";

     /* let y const tiene alcance de bloque
      Bloque de código: Los bloques de código son utilizados 
      para agrupar múltiples instrucciones y definir el 
      alcance de ciertas estructuras de control,
     */ 
     { // inicio de bloque de código
        console.log( myVarFunctionVar ); // "var type"
        console.log( myVarFunctionLet ); // "let type"
        console.log( myVarFunctionConst ); // "const type"
        {
            var myVarFunctionVar = "Nico";
            let myVarFunctionLet = "Andrés";
            const myVarFunctionConst = "José";  
            console.log( myVarFunctionVar ); // "Nico"
            console.log( myVarFunctionLet ); // "Andrés"
            console.log( myVarFunctionConst ); // "José"
        }
     } // fin de bloque de código

     console.log( myVarFunctionVar ); // "Nico"
     console.log( myVarFunctionLet ); // "let type"
     console.log( myVarFunctionConst ); // "const type"

}
myScopeFunction();
// var, let y const tienen function scope.
// solo tiene alcance dentro de la función.
// console.log( myVarFunctionVar );
// console.log( myVarFunctionLet );
// console.log( myVarFunctionConst );