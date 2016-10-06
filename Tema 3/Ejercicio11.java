/** Francisco Casasola Cano */

public class Ejercicio11 {
  public static void main(String[] args) {

    String linea;

    double mb;
    double kb;

    System.out.print("Introduce los kb:");
    
    linea = System.console().readLine();
    kb = Double.parseDouble( linea );
    
    
    mb = kb/1024;

    System.out.println("Resultado:" + mb + "mb");

  }
}
