/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

import servicios.EscribirMensaje;

/**
 * Clase controladora de la aplicación
 * @author rbr - 021024
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 021024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		String mensaje;
		
		//Instancio la clase EscribirMensaje
		EscribirMensaje em = new EscribirMensaje();
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicito al usuario por consola que introduzca el mensaje
		System.out.println("Introduzca el mensaje que desee: ");
		mensaje = sc.next();
		
		System.out.println(mensaje);
		
		//Llamo al método escribirMensaje para que muestre el mensaje por pantalla
		em.escribirMensaje(mensaje);

		sc.close();
	}

}
