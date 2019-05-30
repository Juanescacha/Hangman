/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Esteban Camargo - 1924984 , Juan Camilo Gonzales - 1735277
 * Clase Muneco: se encarga de diagramar el muneco representado
 * en el juego.
 */

public class Muneco {
    
    /**metodo munecoestado: se encarga de evaluar las vidas que le quedan 
     * al jugador para asi mostrar el grafico
     * adecuado.
     */
    
    private String munecoestado;
    
    /**metodo Estado: toma el numero de vidas que le quedan al jugador
     * y al meterlo al switch sale el grafico adecuado
     */
    
    public void Estado(int a) {
		
        switch (a) {
            case 10: munecoestado= "\r\n" + 
                "      _______\r\n" + 
                "     |/      \r\n" + 
                "     |      \r\n" + 
                "     |      \r\n" + 
                "     |       \r\n" + 
                "     |      \r\n" + 
                "     |\r\n" + 
                " ____|___";
            break;
            case 9: munecoestado= "\r\n" + 
                "      _______\r\n" + 
                "     |/      |\r\n" + 
                "     |      \r\n" + 
                "     |      \r\n" + 
                "     |       \r\n" + 
                "     |      \r\n" + 
                "     |\r\n" + 
                " ____|___";
            break;
            case 8: munecoestado= "\r\n" + 
                "      _______\r\n" + 
                "     |/      |\r\n" + 
                "     |      (\r\n" + 
                "     |      \r\n" + 
                "     |       \r\n" + 
                "     |      \r\n" + 
                "     |\r\n" + 
                " ____|___";
            break;
            case 7: munecoestado= "\r\n" + 
                "      _______\r\n" + 
                "     |/      |\r\n" + 
                "     |      (_\r\n" + 
                "     |      \r\n" + 
                "     |       \r\n" + 
                "     |      \r\n" + 
                "     |\r\n" + 
                " ____|___";
            break;
            case 6: munecoestado= "\r\n" + 
                "      _______\r\n" + 
                "     |/      |\r\n" + 
                "     |      (_)\r\n" + 
                "     |      \r\n" + 
                "     |       \r\n" + 
                "     |      \r\n" + 
                "     |\r\n" + 
                " ____|___";
            break;
            case 5: munecoestado= "\r\n" + 
                "      _______\r\n" + 
                "     |/      |\r\n" + 
                "     |      (_)\r\n" + 
                "     |       |\r\n" + 
                "     |       \r\n" + 
                "     |      \r\n" + 
                "     |\r\n" + 
                " ____|___";
            break;
            case 4: munecoestado= "\r\n" + 
                "      _______\r\n" + 
                "     |/      |\r\n" + 
                "     |      (_)\r\n" + 
                "     |      \\|\r\n" + 
                "     |       \r\n" + 
                "     |      \r\n" + 
                "     |\r\n" + 
                " ____|___";
            break;
            case 3: munecoestado= "\r\n" + 
                "      _______\r\n" + 
                "     |/      |\r\n" + 
                "     |      (_)\r\n" + 
                "     |      \\|/\r\n" + 
                "     |       \r\n" + 
                "     |      \r\n" + 
                "     |\r\n" + 
                " ____|___";
            break;
            case 2: munecoestado= "\r\n" + 
                "      _______\r\n" + 
                "     |/      |\r\n" + 
                "     |      (_)\r\n" + 
                "     |      \\|/\r\n" + 
                "     |       |\r\n" + 
                "     |      \r\n" + 
                "     |\r\n" + 
                " ____|___";
            break;
            case 1: munecoestado= "\r\n" + 
                "      _______\r\n" + 
                "     |/      |\r\n" + 
                "     |      (_)\r\n" + 
                "     |      \\|/\r\n" + 
                "     |       |\r\n" + 
                "     |      / \r\n" + 
                "     |\r\n" + 
                " ____|___";
            break;
            case 0: munecoestado= "\r\n" + 
                "      _______\r\n" + 
                "     |/      |\r\n" + 
                "     |      (_)\r\n" + 
                "     |      \\|/\r\n" + 
                "     |       |\r\n" + 
                "     |      / \\\r\n" + 
                "     |\r\n" + 
                " ____|___\n   PERDISTE!!! ";
            break;
        }
        /**salida del grafico en forma de string 
         * para concatenar con la demas informacion
         */
    System.out.println(munecoestado);
    }
}
