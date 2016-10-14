/** Ejercicio 1 Tema 4
 *
 *
 *  @author Francisco Casasola Cano
 */
 
 public class Ejercicio1 {
	public static void main(String[]args) {
		
		System.out.print("Escriba un día de la semana en minusculas:");

		String dia = System.console().readLine();

		if ( dia.equals("lunes")) {
			
			System.out.println(" A primera hora toca Sistemas informáticos");

		} else if (dia.equals("martes")) {

			System.out.println(" A primera hora toca programación");
		
		} else if (dia.equals("miercoles")) {

			System.out.println(" A primera hora toca programación");

		} else if (dia.equals("jueves")) {

			System.out.println(" A primera hora toca base de datos");

		} else if (dia.equals("viernes")) {

			System.out.println(" A primera hora toca lenguaje de marcas");

		}	else {

			System.out.println(" No hay clases este dia");
		}
	}
}
	
