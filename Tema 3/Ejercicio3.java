/** Francisco Casasola Cano */




public class Ejercicio3 {
  public static void main(String[] args) {

    String linea;
    
    double euros;
    double pesetas;

    System.out.print("Introduce la cantidad en pesetas:");

    linea = System.console().readLine();
    pesetas = Double.parseDouble( linea );

    euros = pesetas/166.3;

    
    System.out.println("Esta es la cantidad en euros:" + euros);
  }
}



