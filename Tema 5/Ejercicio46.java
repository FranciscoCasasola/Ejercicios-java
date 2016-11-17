/** Ejercicio 46 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio46 {
  public static void main(String[] args) {
  
    int anchura,altura;
    
    System.out.print("Introduce la anchura del rectángulo (como mínimo 2): ");
    anchura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la altura (como mínimo 2): ");
    altura = Integer.parseInt(System.console().readLine());
    
    if (anchura >= 2 && altura >= 2) {
      
      for (int i = 1; altura >= i; i++) {
        
        if (i == 1) {
          
          for (int j = 0; anchura > j; j++) {
            
            System.out.print("*");
            
          }
          
        } else if (i == altura) {
          
          for (int j = 0; anchura > j; j++) {
            
            System.out.print("*");
            
          }
          
        } else {
          
          System.out.print("*");
          
          for (int j = 2; anchura > j; j++) {
            
            System.out.print(" ");
            
          }
          System.out.print("*");
        }
        System.out.println();
      }
    } else {
      
      System.out.print("La altura y anchura mínima debe ser de 2");
    }
  }
}
