/** Ejercicio 16 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio16 {
  public static void main(String[] args) {
    
    int num,contador;
    boolean primo;
    primo = true;
    
    System.out.print("Introduzca un número para saber si es primo o no: ");

    num = Integer.parseInt(System.console().readLine());
    contador = num -1;
    
    while (contador > 1) {
      
      if (num % contador == 0) {
        
        primo = false;
    
      }
      contador--;
    }
    
    if (primo == true) {
      System.out.println("El número es primo");
      
    } else {
      System.out.println("El número no es primo");
    }
  }
}
