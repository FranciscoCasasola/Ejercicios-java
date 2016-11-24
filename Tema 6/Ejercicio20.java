/** Ejercicio 20 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio20 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    int capacidad,llenado,capacidadInicial;
    
    System.out.print("Introduce la capacidad maxima de la cubeta: ");
    capacidad = s.nextInt();
    
    llenado = (int)(Math.random()*(capacidad+1));
    capacidadInicial = capacidad;
    
    while (capacidad > 0) {
      
      System.out.print("*");
      
      if (capacidad <= llenado) {
        
        System.out.print("====");
      } else {
        
        System.out.print("    ");
      }
      
      System.out.println("*");
    
      capacidad--;
    }
    
    System.out.println("******");
    System.out.println("La cuba contiene " + llenado + " litros de " + capacidadInicial + "capacidad");
    
  }
}
