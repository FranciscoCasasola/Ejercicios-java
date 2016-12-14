/** Ejercicio 15 Tema 7
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio15 {
  public static void main (String[] args) {
  
    Scanner s = new Scanner(System.in);
    boolean lleno = true;
    boolean sitio = true;
    
    int [] mesas = new int [10];
    int personas = 0;
    
    for (int i = 0; i < 10; i++) {
      
      mesas [i] = (int)(Math.random()*5);
      
    }
    
    while (personas != -1) {
    
      //Muestra las mesas
    
      for (int i = 0; i < 10; i++) {
      
        System.out.printf("┊%-3d ", (i+1));
      }
      System.out.println("┊");
      for (int i = 0; i < 50; i++) {
      
        System.out.printf("─");
      }
      System.out.println();
      for (int i = 0; i < 10; i++) {
      
        System.out.printf("┊%-3d ", mesas[i]);
      }
      System.out.println("┊");   
    
      System.out.println();
      
      System.out.print("Introduzca cuantas personas son (-1 para salir): ");
      personas = s.nextInt();
        
      sitio = false;
      for (int i = 0; i < 10; i++) {
      
        if (mesas[i] == 0) {
        
          mesas[i] = personas;
          System.out.println("Por favor sientense en la mesa " + (i+1));
          i = 70;
          sitio = true;
          lleno = false;
        }
      }
        
      if (sitio == false) {
        lleno = true;
    
        for (int i = 0; i < 10; i++) {
      
          if ((mesas[i]+personas) <= 4) {
        
            mesas[i] = mesas[i] + personas;
            lleno = false;
            System.out.println("Lo sentimos, tendran que compartir mesa " + (i+1));
            i = 70;
            sitio = true;
          }
        }
      }
      if (lleno == true) {
          
        System.out.println("Lo sentimos no queda sitio");
      }
        
      //Muestra las mesas
    
      for (int i = 0; i < 10; i++) {
      
        System.out.printf("┊%-3d ", (i+1));
      }
      System.out.println("┊");
      for (int i = 0; i < 50; i++) {
      
        System.out.printf("─");
      }
      System.out.println();
      for (int i = 0; i < 10; i++) {
      
        System.out.printf("┊%-3d ", mesas[i]);
      }
      System.out.println("┊");   
    
      System.out.println();
      
      }
    
    } 
  }

