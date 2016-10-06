/** Francisco Casasola Cano */



public class Ejercicio2 {
	public static void main(String[] args) {


    String linea;
    
    double pesetas;

    System.out.print("Introduce la cantidad en euros:");

    linea = System.console().readLine();
    double euros;
    euros = Double.parseDouble( linea );
    
    
    
    pesetas = euros*166.3;

    System.out.println("Este es la cantidad en pesetas:" + pesetas);

  }
}


