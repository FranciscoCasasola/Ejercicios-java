/** Ejercicio 18 Tema 4
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio18 {
  public static void main(String[] args) {
    
    int x;

    System.out.print("Introduzca un número entero: ");
    
    x = Math.abse(Integer.parseInt(System.console().readLine()));
    
    if ( x >= 10 && x < 100  ) {
      
      System.out.println("El primer número es: " + (x/10));
    
    } else if ( x >= 100 && x < 1000) {
      
      System.out.println("El primer número es: " + (x/100));
      
    } else if ( x >= 1000 && x < 10000) {
      
      System.out.println("EL primer número es: " + (x/1000));
      
    } else if ( x >= 10000 && x < 100000) {
      
      System.out.println("El primer número es: " + (x/10000));
      
    } else if ( x > 0 && x <= 9) {
      
      System.out.println("El primer número es: " + x);
      
    } else {
      
      System.out.println("No se permiten numeros de mas de 5 digitos");
      
    }
  }
}
      
      
