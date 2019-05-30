/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * inicio de la clase control
 */


import java.util.Scanner;
/**
 * @author Juan Esteban Camargo - 1924984 , Juan Camilo Gonzales - 1735277
 */

/**
 * se encarga de controlar el funcionamiento interno del juego, 
 * tomando el grafico de la clase muneco, y ejecutandose finalmente en la clase Inicio
 */

public class Control {

/**
 * definicion de variables usadas en la clase
 */	
	
    String pregunta;
    Scanner entradaEscaner;
    String palabra;
    int aciertos;
    int tamaño;
    int letras;
    int contador;
    String[] palabras = new String[]{ "universidad del valle", "la informatica", "salon de clase", "maestro", "ingenieria de sistemas", "la mejor para los mejores" };
    char[] respuesta;
    int vidas;
    String intentos;
    String errores;

/**
 * constructor donde inicializamos las variables y objetos
 */    
    public Control() {
        contador = 0;
        entradaEscaner = new Scanner(System.in);
        palabra = palabras[(int) (Math.random() * 5)];
        tamaño = palabra.length();
        respuesta = new char[tamaño];
        vidas = 10;
        letras = tamaño;
        intentos = "";
        errores = "";

    }
/**
 * Metodo principal, el cual es invocado en la clase Inicio para correr el programa
 */
    public void iniciarJuego(){
        
        for (int i = 0; i < tamaño; i++) {
            char caracter = palabra.charAt(i);
            if(caracter == ' '){
                letras--;
            }
        }
/** 
 * presentación del inicio del juego
 * donde se presentan las reglas al jugador
 */
        System.out.println("Bienvenido al juego de Ahorcado");
        System.out.println("el juego consiste en advinar una frase oculta");
        System.out.println("tienes que ir ingresando las letras que consideres estan en la palabra");
        System.out.println("tienes 10 intentos si no la adivinas Pierdes!!!");
        System.out.println("");
        System.out.println("Iniciemos!!! presiona Y/N \n");

        pregunta = entradaEscaner.nextLine();

        if(pregunta.equalsIgnoreCase("y")){

            System.out.println("Adivina la Frase");
            Muneco muneco = new Muneco();
            
            //Asignando valor a las rayitas de X
            for (int i = 0; i < tamaño; i++) {
                char caracter = palabra.charAt(i);
                if (caracter == ' ') {
                    respuesta[i] = '%';
                }
                else{
                    respuesta[i] = '_';
                }
            }
            
            while (aciertos != letras && vidas != 0) {
                System.out.println("------------------------- HangMan -------------------------");
                System.out.println("Vidas: " + vidas + " Aciertos: " + aciertos );
                System.out.println("Errores " + errores);
                muneco.Estado(vidas);
                System.out.println("");
                
                //Imprimimos las X con Guiones
                for (int i = 0; i < tamaño; i++) {
                    if(respuesta[i] == '%'){
                        System.out.print("     ");
                    }else{
                        System.out.print("__" + respuesta[i] + "__  ");
                    }  
                }
                
                //Logica Acierto o Perdida
                System.out.println("\n Ingresa una Letra: ");
                
                pregunta = entradaEscaner.nextLine();
                pregunta = pregunta.toLowerCase();
                pregunta = Character.toString(pregunta.charAt(0));
            
                if(!intentos.contains(pregunta)){
                    if (palabra.contains(pregunta)) {
                        for (int i = 0; i < tamaño; i++) {
                            if (palabra.charAt(i) == pregunta.charAt(0)) {
                                respuesta[i] = pregunta.charAt(0);
                                contador++;
                            }
                        }
                        aciertos = aciertos + contador;
                        intentos = intentos + pregunta;
                    }
                    else{
                        errores = errores + " - " + pregunta ;
                        vidas--;
                    }
                }
                //reseteamos el contador para que no sume doble en aciertos
                contador = 0;
                for (int i = 0; i < 10; i++) {
                    System.out.println("");
                }
            }//Fin While
            
            if(vidas == 0){
                muneco.Estado(vidas);
            }else{
                System.out.println("");
                for (int i = 0; i < tamaño; i++) {
                    if(respuesta[i] == '%'){
                        System.out.print("     ");
                    }else{
                        System.out.print("__" + respuesta[i] + "__  ");
                    }
                }
                System.out.println("Ganaste!!!");
            }
            
        }

        else{
            System.out.println("Bye!!");
        }
    }
}
