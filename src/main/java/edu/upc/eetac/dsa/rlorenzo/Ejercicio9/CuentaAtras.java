package edu.upc.eetac.dsa.rlorenzo.Ejercicio9;

public class CuentaAtras implements Runnable {
	
	private Thread t;
	
	
	//Creamos varios constructores de la clase Hilo
	public CuentaAtras(){
		t=new Thread(this,"Hilo 1");
		//t.start();
	}
	public CuentaAtras(String nombre){
		
		t=new Thread(this,"Hilo 1");
		//t.start(); //como implementamos otro metodo public void start() quitamos este t.start();
	}
	
	public void start(){
		this.t.start();
	}

	public void run() {
		int count=11;
		System.out.println("Cuenta atrás de 10 números con implements Runnable:");
		try{
			for(int i=0;i<11;i++){
				count=count-1;
				System.out.println(count);
				Thread.sleep(1000);
			}
			System.out.println("El proceso: "+this.getClass()+" ha terminado");

			
		}catch (InterruptedException e){
			System.out.println(e.toString());
			
		}
		
		
	}
}
