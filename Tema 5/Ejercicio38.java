/** Ejercicio 38 Tema 5
 *
 *
 + @author Francisco Casasola Cano
 */
 
public class Ejercicio38 {
  public static void main(String[] args) {
  
    int altura,espacio,rellenoInterior;
    espacio = 0;
    
    System.out.print("Introduce la altura del reloj de arena: ");
    altura = Integer.parseInt(System.console().readLine());
    
    rellenoInterior = altura - 2;
    
    for (int i = 0; altura > i; i++) {
      
      
      if (altura/ 2 > i) {
        
      
        for (int j = 0; espacio > j; j++) {
        
          System.out.print(" ");
        }
        System.out.print("*");
        espacio++;
        for (int j = 0; rellenoInterior > j; j++) {
          
          System.out.print("*");
        }
        System.out.print("*");
        rellenoInterior = rellenoInterior - 2;
        
      } else if (altura/ 2 == i) {
        
        for (int j = 0; espacio > j; j++) {
          System.out.print(" ");
        }
        
        System.out.print("*");
        rellenoInterior = rellenoInterior + 2;
      
      }else {
        
        espacio--;
        for (int j = 0; espacio > j; j++) {
        
          System.out.print(" ");
        }
        System.out.print("*");
        
        for (int j = 0; rellenoInterior > j; j++) {
          
          System.out.print("*");
        }
        rellenoInterior = rellenoInterior + 2;
        System.out.print("*");
      }
        System.out.println();
      
    }
  }
}
      
      
