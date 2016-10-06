/** Francisco Casasola Cano */

public class Ejercicio4 {
  public static void main(String[] args) {

   String linea;

    double x1;
    double x2;

    System.out.print("Introduce un número:");

    linea = System.console().readLine();
    x1 = Double.parseDouble( linea );
    
    System.out.print("Introduce otro numero por favor:" );
    
    linea = System.console().readLine();
    x2 = Double.parseDouble( linea );
    
    

    System.out.println("El resultado es: \n Suma: " + (x1+x2) + "\n Resta: " + (x1-x2) + "\n Multiplicacion: " + x1*x2 + "\n Division: " + x1/x2);

  }
}


