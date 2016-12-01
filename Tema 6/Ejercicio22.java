/** Ejercicio 22 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio22 { 
  public static void main(String[] args) {
    
    
    Scanner s = new Scanner(System.in);
    int num,altura,insertarEspacios;
    insertarEspacios = 12;
    
    System.out.print("Introduzca la altura de la serpiente: ");
    altura = s.nextInt();
    
    for (int i = 0; i < altura; i++) {
      
      num = (int)(Math.random()*3);
      
      for (int j = 0; insertarEspacios > j; j++) {
        System.out.print(" ");
      }
      
      if (i == 0) {
        System.out.println("@");
      } else {
        
        switch (num) {
          
          case 0:
            System.out.println("*");
            insertarEspacios--;
            break;
            
          case 1:
            System.out.println("*");
            insertarEspacios++;
            break;
          
          case 2:
            System.out.println("*");
            break;
        }
      }
      
    }
  }
}
      
    
