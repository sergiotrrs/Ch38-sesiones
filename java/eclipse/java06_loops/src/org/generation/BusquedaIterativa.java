package org.generation;

public class BusquedaIterativa {
	/*
	 *  Buscar una palabra dentro de una frase, 
	 *  mostrar en consola: "Palabra encontrada" o "Palabra no encontra"
	 *  
	 *  ej. Frase: "Pepe Pecas Pica Papas"
	 *      Palabra: "pecas"
	 *      Respuesta: "Palabra encontrada"
	 *      
	 *  ej. Frase: "Pepe Pecas Pica Papas"
	 *      Palabra: "mimir"
	 *      Respuesta: "Palabra no encontrada"  
	 */
	public static void main(String[] args) {
		String phrase = "Pepe Pecas Pica".toLowerCase(); // 15
		String wordToSearch = "peca".toLowerCase(); // 5
		int maxIndexToSearch = phrase.length() - wordToSearch.length(); // 10
		boolean foundIt = false;

		search: 
		for (int i = 0; i <= maxIndexToSearch; i++) {
			for (int j = 0; j < wordToSearch.length(); j++) {
				if (phrase.charAt(i + j) != wordToSearch.charAt(j)) {
					continue search;
				}
			}
			foundIt = true;
			break search;
		}

		System.out.println("Palabra " + (foundIt ? "encontrada" : "no encontrada"));
		
		System.out.println(phrase.indexOf(wordToSearch));
	}

}
