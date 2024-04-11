package org.generation;

class Feline{
	
}

interface Pet {
	
}

class Jaguar extends Feline {
	
}

class Cat extends Feline implements Pet, Runnable {

	public String greeting() {
		return "miau";
	}
	
	public long getId() {
		return Thread.currentThread().getId();
	}
	
	@Override
	public void run() {
		System.out.println("Ejecutando tarea concurrente");				
		for (int i = 0; i < 5; i++) {
			System.out.println("id " + getId() + " , iteration: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
	
}



public class ThreadUsingImplements {
	
	public static void main(String[] args) {
		System.out.println("Inicio");
		Cat chicharron = new Cat();
		Cat chetitos = new Cat();
		Cat zeus = new Cat();
		
		Runnable michi = new Cat();
		// Runnable jaguar = new Jaguar();
		chicharron.greeting();
		Cat michiConvertido = (Cat)michi;
		michiConvertido.greeting();
		
		
	    Thread hilo01 = new Thread( chicharron  );
	    Thread hilo02 = new Thread( michi   );
	   //  Thread hilo03 = new Thread( new Jaguar() ); // no tiene la interfaz Runnable
	    Thread hilo03 = new Thread( new Cat() );
	    
	    hilo01.start();
	
	    try {
			hilo01.join();
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
	    System.out.println("fin");
	   
	    
		
	}

}
