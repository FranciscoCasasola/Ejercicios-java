/** Ejercicio 15 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio15 {
    public static void main(String[] args) {
      
    int base,exponente;
    int temp;
    temp = 1;
    
    System.out.print("Introduzca un número como base: ");
    base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca un número como exponente: ");
    exponente = Integer.parseInt(System.console().readLine());
    
    while (exponente > 0) {
    
      temp = temp * base;
      exponente--;
      System.out.print(temp + "    ");
    }
    
  }
}
