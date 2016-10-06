/** Francisco Casasola Cano */


public class Ejercicio7 {
  public static void main(String[] args) {

    String linea;

    double x1;
    double x2;
    
    System.out.print("Introduce un el precio de la base imponible:");

    linea = System.console().readLine();
    x1 = Double.parseDouble( linea );

    x2 = x1*0.21;

    System.out.println("El precio con IVA es de: " + (x1+x2));
  }
}




