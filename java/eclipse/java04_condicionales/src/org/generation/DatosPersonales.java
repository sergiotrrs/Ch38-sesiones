package org.generation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DatosPersonales {

	public static void main(String[] args) {
		
		File file = new File("src/org/generation/misdatos.txt");
		try {
			
			Scanner sc = new Scanner(file);

			while( sc.hasNextLine() ) {
				System.out.println( sc.nextLine()  );				
			}
						
			
			sc.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
