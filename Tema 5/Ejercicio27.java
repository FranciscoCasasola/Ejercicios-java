/** Ejercicio 27 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio27 {
  public static void main(String[] args) {
  
    int num,multiplos;
    multiplos = 3;
    
    System.out.print("Introduzca un número: ");
    num = Integer.parseInt(System.console().readLine());
    System.out.println("Estos son los multiplos de 3 comprendidos entre 1 y " + num);
    
    while (multiplos < num) {
      
      System.out.println(multiplos);
      multiplos = multiplos + 3;
    }
  }
}
