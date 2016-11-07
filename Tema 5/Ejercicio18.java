/** Ejercicio 18 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio18 {
  public static void main(String[] args) {
    
    int num1,num2,temp;
    int suma;
    temp = 0;
    suma = 0;
    
    
    System.out.print("Introduzca un número como primer valor: ");
    num1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca un número como segundo valor: ");
    num2 = Integer.parseInt(System.console().readLine());
    
    temp = num1;
    
    while (temp < num2) {
      
      System.out.println(temp);
      suma = suma + 7;
      temp = num1 + (suma);
      
      
    }
  }
}
