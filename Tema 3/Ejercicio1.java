/** Francisco Casasola Cano */


public class Ejercicio1 {
  public static void main(String[] args) {

	String linea;

    System.out.print("Introduce un número:");

    linea = System.console().readLine();
    double x1;
    x1 = Double.parseDouble( linea );
    
    System.out.print("Introduce el segundo número:");
    
    linea = System.console().readLine();
    double x2;
    x2 = Double.parseDouble( linea );
        

    System.out.println("Este es el resultado de la multiplicacion:" + x1*x2);
  }
}

