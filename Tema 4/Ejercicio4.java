/** Ejercicio 4 Tema 4
 *
 *  @author Francisco Casasola Cano
 *
 */
 
public class Ejercicio4 {
	public static void main(String[]args) {
		
		System.out.print("Introduces el número de horas de trabajo: ");
		int hours = Integer.parseInt(System.console().readLine());
		
		if ( hours <= 40 ) {
			
			System.out.println("El salario recibido es de:" + hours*12);
			
		} else if ( hours > 40 ) {
			
			System.out.println("El salario recibido es de:" + (480 + (hours-40)*16));
			
		} else {
			
			System.out.println("Los datos introducidos no concuerdan");
		}
			
		
	}
}
