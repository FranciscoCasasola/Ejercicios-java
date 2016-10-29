/** Ejercicio 11 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio11 {
  public static void main(String[] args) {
    
    double num1,num2;
    int temp;
    int contador;
    contador = 0;
    temp = 0;
    
    
    
    System.out.print("Introduzca 5 números (de uno en uno): ");
    num1 = Double.parseDouble(System.console().readLine());
    
    num2 = num1;
    
    while ( num1 < (num2+5)) {

      System.out.printf("%8.2f         %8.2f          %5s" , (num1*num1) , (num1*num1*num1) , "\n");
      
      num1++;
      
    }
  }
}      
