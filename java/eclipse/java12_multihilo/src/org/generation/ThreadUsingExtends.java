package org.generation;

class Iteration{
	private String name;
	
	public Iteration(String name) {
		this.name = name;
	}
	
	public void iterationNumber(int number) {
		System.out.println("Iterando " + this.name);
		for (int i = 0; i < number; i++) {
			System.out.println("Obj: " + this.name + ", iteration: " + i);
		}
	}	
}

class MyThread extends Thread {
	
	public MyThread(String name) {
		super(name);
	}
	
	/** método que es concurrente */
	@Override
	public void run() {
		System.out.println("Iterando " + super.getName());
		for (int i = 0; i < 5; i++) {
			System.out.println("id: " + super.getId() + " name: " + super.getName() +
					" iteration: " + i);	
			try {
				Thread.sleep(1000); // suspender el hilo
			} catch (InterruptedException e) {				
				e.printStackTrace();
			} 
			
		}
	}
	
}


public class ThreadUsingExtends {

	public static void main(String[] args) {
		// ---------------- programación secuencial --------------------
		Iteration it01 = new Iteration("Iteracion 01");
		Iteration it02 = new Iteration("Iteracion 02");
		Iteration it03 = new Iteration("Iteracion 03");
		
		// it01.iterationNumber(5);
		// it02.iterationNumber(5);
		// it03.iterationNumber(5);
		
		// Realizar concurrencias
		MyThread hilo01 = new MyThread("hilo01");
		MyThread hilo02 = new MyThread("hilo02");
		MyThread hilo03 = new MyThread("hilo03");
		
		// Ejecutar concurrencias
		hilo01.start();
		hilo02.start();
		hilo03.start();
		
		System.out.println("Hilo 01 isAlive: " + hilo01.isAlive() );
		System.out.println("Hilo 02 isAlive: " + hilo02.isAlive() );
		System.out.println("Hilo 03 isAlive: " + hilo03.isAlive() );
		
		try {
			hilo01.join(); // espera hasta que el hilo termine su ejecución.
			hilo02.join();
			hilo03.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Hilo 01 isAlive: " + hilo01.isAlive() );
		System.out.println("Hilo 02 isAlive: " + hilo02.isAlive() );
		System.out.println("Hilo 03 isAlive: " + hilo03.isAlive() );
		
				
	}			
}
