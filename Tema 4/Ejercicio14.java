/** Ejercicio 14
 *
 *
 * @author Francisco Casasola Cano
 */

public class Ejercicio14 {
  public static void main(String[] args) {
    
    int a;
    
    System.out.println("Introduzca un número: ");
    
    a = Integer.parseInt(System.console().readLine());
    
    if ( a%2 == 0 && a%5 == 0) {
      
       System.out.println("El número es par y divisible entre 5");
     } else if ( a%2 != 0 && a%5 == 0){
       
       System.out.println("El número no es par pero si es divisible entre 5");
     } else if ( a%2 == 0 && a%5 != 0){
       
       System.out.println("El número es par pero no es divisble entre 5");
     }
   }
}
