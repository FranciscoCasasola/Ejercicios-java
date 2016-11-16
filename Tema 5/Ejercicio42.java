/** Ejercicio 42 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio42 {
  public static void main(String[] args) {
  
    long num,temp;
    boolean primo;
    
    System.out.print("Introduce un número entero positivo: ");
    num = Integer.parseInt(System.console().readLine());
    temp = num + 5;
    
    while (num < temp) {
      
      primo = true;
      
      for (long i = 2; num > i; i++) {
        
        if (num % i == 0) {
          
          primo = false;
        }
        
        
      }
      
      if (primo == true) {
        
      System.out.println("El número " + num + " es primo");
    } else {
      System.out.println("El número " + num + " no es primo");
    }
    num++;
    
    }
  }
}
