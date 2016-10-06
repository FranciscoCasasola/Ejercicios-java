/** Francisco Casasola Cano */


public class Ejercicio5 {
  public static void main(String[] args) {
    
    String linea;
    
    double x1;
    double x2;

    System.out.print("Introduzca la altura:");

    linea = System.console().readLine();
    x1 = Double.parseDouble( linea );
    
    System.out.print("Introduzca el ancho:");
    
    linea = System.console().readLine();
    x2 = Double.parseDouble( linea );

    System.out.println("Este es el area del rectangulo;" + x1*x2);
  }
}



    
