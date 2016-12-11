/** Ejercicio 8 Tema 7
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio08 {
  public static void main(String[] args) {
    
    
    int [] temperatura = new int [12];
   int [] longitud = new int [12];
   
   Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la temperatura de los 12 meses del año: ");
    
    for (int i = 0; i < 12; i++) {
      
      temperatura [i] = s.nextInt();
      
    }
      
    for (int i = 0; i < 50; i++) {
      
      System.out.print("─");
    }
    
    System.out.println();
    
    for (int i = 0; i < 12; i++) {
      
      for (int j = 0; j < temperatura[i]; j++) {
        
        System.out.print("*");
        
      }
      System.out.println();
      
    }
    
    for (int i = 0; i < 50; i++) {
      
    System.out.print("─");
    
  }
    
      
    }
  }
  
