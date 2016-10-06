/** Francisco Casasola Cano */

public class Ejercicio10 {
  public static void main(String[] args) {

    String linea;
    
    double mb;
    double kb;

    System.out.print("Introduce los mb:" );
    
    linea = System.console().readLine();
    mb = Double.parseDouble( linea );
       
    
    kb = mb*1024;

    System.out.println("Resultado: " + kb + "kb");
  }
}

