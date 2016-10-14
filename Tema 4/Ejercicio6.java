/** Ejercicio 6
 *
 *
 * @author Francisco Casasola Cano
 */

public class Ejercicio6 {
  public static void main(String[] args) {
    
    double h;
    double g = 9.81;
    double primeraOperacion;
    
    System.out.print("Introduzca la variable t para resolver la ecuación: ");
    
    h = Double.parseDouble(System.console().readLine());
    
    primeraOperacion = ((2*h)/g);
    
    
    
    System.out.println("El resultado de la ecuación es: " + Math.sqrt(primeraOperacion) );
    
  }
}
