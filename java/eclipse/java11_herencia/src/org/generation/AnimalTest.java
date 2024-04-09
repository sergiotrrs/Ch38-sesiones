package org.generation;

import com.zoo.Animal;
import com.zoo.Cat;

public class AnimalTest {

	public static void main(String[] args) {
		
		// Cat michi;
		Animal bague;
		bague = new Cat("Bagheera", 1.5);
		
		System.out.println( bague.eat() );
		System.out.println( bague.sleep() );
		System.out.println( bague.makeANoise() );

	}

}
