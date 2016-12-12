/** Ejercicio 13 Tema 7
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio13 {
  public static void main (String[] args) {
  
    
    Scanner s = new Scanner(System.in);
    
    int lista[] = new int [100];
    int opcion;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    
    
    for (int i = 0; i < 100; i++) {
       
      lista[i] = (int)(Math.random()*501);
      
    }
    
    for (int i = 0; i < 100; i++) {
      
      System.out.print(lista[i] + " ");
    }
    
    for (int i = 0; i < 100; i++) {
      
      if (lista[i] > max) {
        
        max = lista[i];
      } else if (lista[i] < min) {
        
        min = lista[i];
      }
    }
    System.out.println();
    
    System.out.print("¿Qué quiere destacar? El máximo (1), o el minimo (2): ");
    opcion = s.nextInt();
    System.out.println();
    
    if (opcion == 1) {
      
      for (int i = 0; i < 100; i++) {
        
        if (lista[i] == max) {
          
          System.out.print("**" + lista[i] + "** ");
        } else {
        
          System.out.print(lista[i] + " ");
        }
      }
    } else if (opcion == 2) {
      
      for (int i = 0; i < 100; i++) {
        
        if (lista [i] == min) {
          
          System.out.print("**" + lista [i] + "** ");
        } else {
        
          System.out.print(lista[i] + " ");
          
        } 
      }
    }
    

  }
}
