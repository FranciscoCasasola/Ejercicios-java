/** EJercicio 13
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio13 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int a,b,c;
    
    System.out.print("Introduzca tres números enteros separados por un espacio: ");
    
    a = s.nextInt();
    b = s.nextInt();
    c = s.nextInt();
    
    if ( a > b ) {
      
      if ( a > c ) {
         
         System.out.println( a + " Es el mayor");
         
       } else if ( a == c ) {
         
         System.out.println( a + " y " + c + " Son iguales y los mayores ");
       } else {
         
         System.out.println(c + " Es el mayor");
         
       }
     } else if ( a == b && c > a ) {
       
       System.out.println(c + " Es el mayor");
       
     } else if ( a == b && a > c) {
       
       System.out.println( a + " y " + b + " Son iguales y los mayores");
     
     } else if ( a == b && a == c) {
       
       System.out.println( a + " " + b + " " + c + " Son iguales");
       
     } else if ( c > b) {
       
       System.out.println( c + " Es el mayor");
       
    } else {
      
      System.out.println( b + " Es el mayor");
    }
  }
}
    
       
        
        
        
        
        
        
        
        
        
        
  
        
         

