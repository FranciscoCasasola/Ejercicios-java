/** Ejercicio 40 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio40 {
  public static void main(String[] args) {
    
    
    int altura,espacio,espacioInterior;
    
    System.out.print("Introduzca la altura del rombo: ");
    altura = Integer.parseInt(System.console().readLine());
    
    espacio = (altura / 2);
    espacioInterior = 1;
    
    for (int i = 0; altura > i; i++) {
      
      if (i < altura/2) {
        
        for (int j = 0; espacio > j; j++) {
          
          System.out.print(" ");
          
        }
        espacio--;
        
        if (i == 0) {
          
          System.out.print("*");
          
        } else {
          
          System.out.print("*");
          
          for (int j = 0; espacioInterior > j; j++) {
            
            System.out.print(" ");
            
          }
          espacioInterior += 2;
          System.out.print("*");
          
        }
      
      } else {
        
        for (int j = 0; espacio > j; j++) {
          
          System.out.print(" ");
          
        }
        espacio++;
        
        if (i == altura - 1) {
          
          System.out.print("*");
          
        } else {
          
          System.out.print("*");
          
          for (int j = 0; espacioInterior > j; j++) {
            
            System.out.print(" ");
          }
          
          System.out.print("*");
          espacioInterior -= 2;
          
        }
        
      }
      System.out.println();
      
    }
  }
}
          
          
          
          
          
          
        
        
