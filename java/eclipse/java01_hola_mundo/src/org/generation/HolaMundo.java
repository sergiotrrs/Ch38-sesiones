package org.generation;

public class HolaMundo {
	
	public static void main(String[] args) {
		
		// Comentario de línea
		System.out.println("Hola Chololandia");
        /*
         * Este es un comentario de bloque
         * 
         * Reglas para el nombre de las variables:
		 *  - Se distingue entre minúsculas y mayúsculas
		 *  - La longitud del nombre es ilimitada
		 *  - Puedes utilizar cualquier caracter Unicode
		 *  - La variable puede comenzar:
		 *    > una letra ej. miVariable
		 *    > signo de dolar $miVariable
		 *    > caracter de subrayado(underscore) _miVariable
		 *  - No se permiten espacios en el nombre
		 *  - El nombre de la variable debe tener un contexto, ser claro
		 *   			      			https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
         */	
		
		// Para declarar una variable, se indica el tipo de dato y el nombre
		int  $miVar; // Es válido, no se recomienda
		int _numEngranes; // Es válido, No se recomienda
		// int #numPersona; // No es válido
		// int 5comentarios; // No es válido
		int sinC0m3nt4r10s; // Es válido, no es clara
		
		/*
		 * En Java tendremos  los siguientes tipo de variables:
		 *  Variables de instancia (Non static fields): atributos de los objetos.
		 *  Variables de clase (Static Fields): atributos de la clase.
		 *  Variables locales (local variables): variable dentro de las funciones(métodos)
		 *  Parámetros (parameters): Entrada de las funciones
		 * 
		 */
				
		
		/**
		 *  https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 *  Tipos de datos en Java
		 *  - Objetos
		 *  - Datos primitivos
		 *  	8 datos primitivos
		 *   > byte
		 *   > short
		 *   > int
		 *   > long
		 *   > float
		 *   > double
		 *   > boolean
		 *   > char
		 *      
		 */
		
		// El tipo byte es de 8 bits, almacena datos numéricos enteros 
		byte myVarByte; // declarando la variable
		myVarByte = 12; // asignando un valor a al variable
		/*
		 *  Cuantos valores podemos representar? 2^8 = 256
		 *  Cuantos valores enteros positivos podemos representar? 2^7 = 128 ( 0 ...  127 )
		 *  Cuantos valores enteros negativos podemos representar= 2^7 = 128 ( -1....-128 )
		 * 
		 */
		// myVarByte = 1000; No podemos almacenar este valor en esa variable
		byte edadUri = 15;
		/**
		 * Obtener los valor máximos y mínimos del tipo byte,
		 * usando su clase wrapper( clave envolvente): Byte. 
		 */
		System.out.println("Max value byte: " + Byte.MAX_VALUE ); // 127
		System.out.println("Min value byte: " + Byte.MIN_VALUE ); // -128
		
		
		/*
		 * Tipo de dato short
		 * Dato de 16 bits, almacena valores enteros.
		 * Cuantos datos puede almacenar: 65536 (2^16)
		 * Valor máx positivo: 32767
		 * Valor min negativo: -32768
		 */
		// imprimir en consola el Max y Min usando wrapper Short.
		System.out.println("Max value short: " + Short.MAX_VALUE);
		System.out.println("Min value short: " + Short.MIN_VALUE);
		
		/*
		 * Tipo de dato int (integer)
		 * Dato de 32 bits, almacena valores enteros.
		 * Cuantos datos puede almacenar: 
		 * Max value int: 2147483647
		 * Min value int: -2147483648 
		 */
		// imprimir en consola el Max y Min usando wrapper Integer.
		System.out.println("Max value int: " + Integer.MAX_VALUE);
		System.out.println("Min value int: " + Integer.MIN_VALUE);
		
		/*
		 * Tipo de dato long
		 * Dato de 64 bits, almacena valores enteros.
		 * Cuantos datos puede almacenar: 
		 * Max value long: 9223372036854775807
		 * Min value long: -9223372036854775808
		 */
		// imprimir en consola el Max y Min usando wrapper Long.
		System.out.println("Max value long: " + Long.MAX_VALUE);
		System.out.println("Min value long: " + Long.MIN_VALUE);
		
		/*
		 * Las literales numéricas enteras en java son de tipo int
		 * ej. 12, -456, 0
		 * Para idicar una literal numética de tipo long
		 * hay que indicar la literal con la letra l o L.
		 * Se recomienda usar la L para no confundir con el 1
		 * 
		 * Los valores numéricos se pueden separar por guiones
		 */
		long almacenaNumGrande = 2_147_483_648L;
		
		// No existe el NaN, +Infinity, -Infinity, undefined
		// ==================================================================
		/*
		 * Dato de tipo float
		 * Dato de 32 bits, almacena valos numéricos de punto flotante.
		 * 
		 * El wrapper de float es Float.
		 * 
		 */
		System.out.println("Max value float: " + Float.MAX_VALUE); 
		System.out.println("Min value float: " + Float.MIN_VALUE);
		// Max value float: 3.4028235E38
		// Min value float: 1.4E-45
		
		/*
		 * Dato de tipo double
		 * Dato de 64 bits, almacena valos numéricos de punto flotante.
		 * 
		 * El wrapper de double es Double.
		 * 
		 */
		System.out.println("Max value Double: " + Double.MAX_VALUE);
		System.out.println("Min value Double: " + Double.MIN_VALUE);

		// Max value Double: 1.7976931348623157E308
		// Min value Double: 4.9E-324
		

		/*
		 *  Las literales de punto flotante son por default double
		 *  ej. 123.567, 0.012, -0.989
		 */

		float  myVarFloat = 1500.567F;
		
		// ======================================
		
		/*
		 * Dato Boolean
		 * Almacea valores true o false
		 */
		boolean myVarBoolean = true;
		
		// ======================================
		/*
		 * Dato char
		 * Almacena un solo caracter.
		 * Se debe definir la literal con apóstrofe ej. 'a', 'C', ' '
		 * Solo almacena caracteres de la tabla unicode(16 bits).
		 * puede almacenar del 0 al 65535
		 */
		char primeraLetraDeNombreTania = 'T';
		// Se puede alacenar con el valor unicode '\u0000'
		char letraT = '\u0054';
		// también se puede definir por su valor númerico
		char letraTmayus = 84; 
		System.out.println(primeraLetraDeNombreTania);
		System.out.println(letraT);
		System.out.println(letraTmayus);
		
		/*
		 * Formas de representar un número
		 */
		System.out.println("Representación decimal: " + 34 );
		System.out.println("Representación hexadecimal: " + 0x22 );
		System.out.println("Representación binaria: " + 0b0010_0010 );
		System.out.println("Representación octal: " + 042 );
		
		/*************************************************************
		 *  Conversión de tipo de datos
		 */
		byte coquita350ml = 60; 
		//8bits
		
		// upcasting
		short coquita2000ml = coquita350ml;
		//16bits		
		
		//  downcasting
		short pozoleGrande1l = 50;
		
		byte pozoleBurbuja = (byte)pozoleGrande1l;
		
		
		System.out.println(pozoleBurbuja); // -56
		
		//====================================================
				/*
				 * Tipo de dato String
				 * Es un objeto que se define con comillas dobles.
				 * 
				 * Si deseas imprimir comillas dobles,se usa el 
				 * caracter de escape \
				 *   \b backspace
				 *   \t tab
				 *   \n line feed
				 *   \r carriage return
				 *   \" double quote
				 *   \' single quote
				 *   \\ backslash
				 */
		String name = "\nG\n\ti\n\t\ts\n\t\t\ts";
		System.out.println("Hola " + name);
		
		// Conversión String a números
		String edadMascotaStr = "21";
		System.out.println("Edad mascota + 1: " + ( edadMascotaStr + 1  ));
		byte edadMascota = Byte.parseByte(edadMascotaStr);
		System.out.println("Edad mascota + 1: " + ( edadMascota + 1  ));
		
		// Convertir String a integer
		String numGoles = "2";
		// le metieron 2 goles más en el segundo tiempo
		int numGolesF = Integer.parseInt(numGoles);
		System.out.println("Goles final + 2: " +(numGolesF + 2));
		
		// Convertir números a String 
		short miNumLoteria = 1256;
		String numSuerte = String.valueOf(miNumLoteria);
		System.out.println("Primer dígito: " + numSuerte.charAt(0) ); // 1
		System.out.println("Núm de dígitos: " + numSuerte.length() ); // 4
		
		// Escribe en una variable tu año de nacimiento
		// imprime en consola
		// Eres de los 80's si naciste entre 1980 y 1989
		// Eres de los 90's si naciste entre 1990 y 1999
		// Eres de los 2000's si naciste entre 2000 y 2009
		int anioNacimiento = 1994; // Escribe aquí tu año de nacimiento

		if (anioNacimiento >= 1980 && anioNacimiento <= 1989) {
		    System.out.println("Eres de los 80's");
		} else if (anioNacimiento >= 1990 && anioNacimiento <= 1999) {
		    System.out.println("Eres de los 90's");
		} else if (anioNacimiento >= 2000 && anioNacimiento <= 2009) {
		    System.out.println("Eres de los 2000's");
		} else {
		    System.out.println("Naciste fuera de los rangos 80's, 90's y 2000's");
		}
		
		// ==================================================================
	    // Operadores numéricos
		int suma = 5 + 6 ; // 11
		int opA = (int)5.2;
		int opB = 6;
		suma = opA + opB; // 11
		int resta = opA - opB; // -1
		
		int multiplica = opA * (int)1.1; // 5
		double multiplicaDouble = opA * 1.1; //5.5 
		// Cuando realizas operaciones con dos datos de diferente tipo
		// el resulto será con el tipo de dato mayor
		//   int * double = double
		System.out.println( multiplicaDouble ); // 5.5
		
		// int division = 3/0; // / by zero
		
		double divisionDouble = (double)opA / opB * 1;
		System.out.println(divisionDouble);
		
		// Operadores de pre incremento, post decremento
		int valorInicial = 10;
		
		System.out.println("Preincremeto: " + ++valorInicial ); // 11
		System.out.println("Postincremeto: " + valorInicial++ ); // 11
		System.out.println("Valor final: " + valorInicial); // 12
		
		valorInicial = 50;
		System.out.println("Predecremeto: " + --valorInicial ); // 49
		System.out.println("Postdecremeto: " + valorInicial-- ); // 49
		System.out.println("Valor final: " + valorInicial); // 48
		
		// Operadores Comparativos
		// El resultado es un booleano
		// <, <=, >, >=, == , !=
		// System.out.println( 5 == "5" ); // No se puede comparar.
		                   // hay que realizar una conversión.
		System.out.println( 5 ==  Integer.parseInt("101",2) ); // true
		
		int numEmpleados = 1000;
		System.out.println("Empleados > 1000 " + ( numEmpleados > 1000 ) ); // false
		System.out.println("Empleados >= 1000 " + ( numEmpleados >= 1000 ) ); // true
		System.out.println("Empleados <= 1000 " + ( numEmpleados <= 1000 ) ); // true
		System.out.println("Empleados == 1000 " + ( numEmpleados == 1000 ) ); // true 
		System.out.println("Empleados != 1000 " + ( numEmpleados != 1000 ) ); // false
		System.out.println( 'a' > 10); // 97 > 10 --> true
		
		
		// Operadores lógicos
		   // && (AND) retorna true si ambos operadores son true
		   // || (OR) retorna true si cualquiera de los operandos es true
		   // !  (NOT) invierte el resultado booleano
		   boolean a = true;
		   boolean b = false;
		   boolean c = true;
		   System.out.println( (a && b) || (a && c) );   // true
		   System.out.println( a || b || c && a );       // true		   		   		  
		   System.out.println( !(a || b) && (!a || c) ); // false		   
		   System.out.println( a || b && c || a && b  ); // true
		
		   
		   
	}

}
