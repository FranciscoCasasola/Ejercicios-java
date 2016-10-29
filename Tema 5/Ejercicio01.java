/** Ejercicio 1 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio01 {
  public static void main(String[] args) {
    
    int num1,num2;
    int contador;
    num1 = 5;
    num2 = 0;
    
    for (contador = 1; num2 < 100; contador++) {
      
      num2 = num1*contador;
      
      System.out.println(num2);
      
    }
    System.out.println("Esta es la lista de los multiplos de 5 de 0 a 100");
  }
}
      
