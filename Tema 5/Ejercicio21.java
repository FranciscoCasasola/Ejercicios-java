/** Ejercicio21 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */

public class Ejercicio21 {
  public static void main(String[] args) {

    int num,temp,temp2,contador;
    temp2 = 0;
    temp = 0;
    num = 1;
    contador = 0;
    
    while (num > 0) {
      
      System.out.print("Introduzca números de uno en uno: ");
      num = Integer.parseInt(System.console().readLine());
      
      if (num % 2 == 1) {
        
        temp = temp + num;
        contador++;
      }
      
      if (num % 2 == 0) {
        
        if (num > temp2) {
          
          temp2 = num;
        }
      }
    }
    
    System.out.println("La media de los impares es " + temp/contador);
    System.out.println("El mayor de los positivos es " + temp2);
  }
}
        
