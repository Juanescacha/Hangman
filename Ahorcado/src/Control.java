import java.util.Scanner;

public class Control {
	
	private String pregunta;
	private Scanner entradaEscaner;
	private int contador;
	private boolean gameover;
	private String letra;

	// Variables
	
	public Control() {
		entradaEscaner = new Scanner(System.in);
		contador = 0;
		gameover = false;
	}
	
	public void iniciarJuego(){
		System.out.println("Bienvenido al juego de Ahorcado");
		System.out.println("el juego consiste en advinar una frase oculta");
		System.out.println("tienes que ir ingresando las letras que consideres estan en la palabra");
		System.out.println("tienes 10 intentos si no la adivinas Pierdes!!!");
		System.out.println("Iniciemos!!! presiona Y/N \n");
		
		pregunta = entradaEscaner.nextLine();
		
		if(pregunta.equalsIgnoreCase("y")){
			
			System.out.println("Adivina la Frase");
			Muneco muneco = new Muneco();
			Frase palabra = new Frase();
			muneco.Estado(contador);
			palabra.mostrarRayitas();
			
			while (!gameover) {
				letra = entradaEscaner.nextLine();
				contador++;
				muneco.Estado(contador);
				palabra.mostrarRayitas();
				if(contador == 10) gameover = true;
			}
			
		}
		
		else{
			System.out.println("Bye!!");
		}
	}

}
