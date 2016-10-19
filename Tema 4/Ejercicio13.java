/** EJercicio 13
 *
 *
 * @author Francisco Casasola Cano
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    
    int a,b,c;
    
    System.out.print("Introduzca un número entero: ");
    
    a = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca otro número entero: ");
    
    b = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el ultimo número entero: ");
    
    c = Integer.parseInt(System.console().readLine());
    
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
    
       
        
        
        
        
        
        
        
        
        
        
  
        
         

