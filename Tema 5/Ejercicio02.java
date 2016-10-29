/** Ejercicio 02 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio02 {
  public static void main(String[] args) {
    
    int num1,num2;
    int contador;
    num1 = 5;
    contador = 1;
    num2 = 0;
    
    while (num2 < 100) {
      
      num2 = num1*contador;
      
      System.out.println(num2);
      
      contador++;
      
    }
    System.out.println("Esos son los multiplos de 5 hasta 100");
    
  }
}
