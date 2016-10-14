/** Ejercicio 2 Tema 4
 *
 *
 *  @ author Francisco Casasola Cano
 *
 */
 
public class Ejercicio2 {
	public static void main(String[]args) {

		System.out.print("Introduce la hora del dia (sin minutos):");
		
		String linea = System.console().readLine();
		int hora = Integer.parseInt( linea );

		if ( (hora >= 6) && ( hora <= 12 ) ) {

			System.out.println(" Buenos dias");

		} else if ( ( hora >= 13 ) && ( hora <= 20 ) ) {

			System.out.println(" Buenas tardes");

		} else if ( ( hora >= 21 ) && ( hora <= 24 ) ) {

			System.out.println("Buenas noches");
		} else if ( ( hora >= 0 ) && ( hora <= 5 ) ) {

			System.out.println("Buenas noches");

		} else {

			System.out.println("La hora escrita no es valida");
		}
	}
}


