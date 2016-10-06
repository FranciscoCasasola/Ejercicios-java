/** Francisco Casasola Cano */

public class Ejercicio6 {
  public static void main(String[] args) {

    String linea;

    double base;
    double altura;

    System.out.print("Introduce la base:");
  
    linea = System.console().readLine();
    base = Double.parseDouble( linea );
    
    System.out.print("Introduce la altura:");
    
    linea = System.console().readLine();
    altura = Double.parseDouble( linea );
    


    System.out.println("Esta es la base del triangulo:" + (base*altura)/2);

  }
}

