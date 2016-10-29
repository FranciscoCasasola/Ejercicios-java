/** Ejercicio 03 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio03 {
  public static void main(String[] args) {
    
    int num1,num2;
    int contador;
    num1 = 5;
    contador = 1;
    
    do {
      
      num2 = num1*contador;
      System.out.println(num2);
      
      contador++;
    }while (num2 < 100);
    
    System.out.println("Estos son los multiplos de 5 hasta 100");
    
  }
}
      
      
