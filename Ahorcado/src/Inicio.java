/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Esteban Camargo - 1924984 , Juan Camilo Gonzales - 1735277
 * 
 * La clase Inicio se encarga de ejecutar el programa, invoca a la Clase de Control
 */

public class Inicio {

    /**
     * metodo main
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         * Creacion de Objeto de la Clase Control
         * invocacion del metodo iniciar juego para dar inicio al programa
        */
        Control control = new Control();
        control.iniciarJuego();
    }
    
}
