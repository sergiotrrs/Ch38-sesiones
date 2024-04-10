package org.generation;

import java.util.HashSet;
import java.util.Set;

//import com.zoo.Animal;
//import com.zoo.Cat;
//import com.zoo.Leopard;
import com.zoo.*;

public class AnimalTest {

	public static void main(String[] args) {
		
		// Cat michi;
		Cat bague;
		bague = new Cat("Bagheera", 1.5);
		
		//System.out.println( bague.eat() );
		//System.out.println( bague.sleep() );
		//System.out.println( bague.makeANoise() );
		
		// Instanciar clase Leopardo e invocar eat, sleep y makeANoise();
		Leopard leopard1 = new Leopard(2);
		Feline leopard2 = new Leopard(2);
		Animal leopard3 = new Leopard(2);
		
		// Almacenar un animal de cada especie, no queremos duplicados
		Set< Animal > nohasArc = new HashSet<>();
		nohasArc.add( bague );
		nohasArc.add( leopard1 );
		nohasArc.add( leopard2 );
		nohasArc.add( leopard3 );
		nohasArc.add( new Cat("Solovino", 3) );
		
		long var1 = 12;
		int var2 = (int)var1;
		
		for (Animal animal : nohasArc) {
			System.out.println( animal.eat() );
			System.out.println( animal.sleep() );
			
			if(animal instanceof Cat) {
				System.out.println( ((Cat)animal).makeANoise(new Cat("Rocky", 5)) );
			} else {
				System.out.println( animal.makeANoise() );
			}
				
			
		}
		
		

	}

}
