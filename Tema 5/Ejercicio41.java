/** Ejercicio 41 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio41 {
  public static void main(String[] args) {
    
    long num,temp,temp2;
    int pares,impares;
    pares = 0;
    impares = 0;
    
    System.out.print("Introduzca un número: ");
    num = Integer.parseInt(System.console().readLine());
    
    
    temp2 = num;
    while (num > 0) {
      
      temp = num % 10;
      
      if (temp % 2 == 0) {
        
        pares++;
        
      } else {
        
        impares++;
      }
      
      num = num / 10;
      
    }
    
    System.out.print("El número " + temp2 + " contiene " + pares + " digitos pares " + impares + " digitos impares ");
    
  }
}
      
      
