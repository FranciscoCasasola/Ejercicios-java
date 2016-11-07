/** Ejercicio 17 Tema 5 
 *
 *
 * @author Francisco Casasola Cano
 */

public class Ejercicio17 {
  public static void main(String[] args) {
    
    int num,temp;
    int contador;
    
    System.out.print("Introduzca un número positivo: ");
    num = Integer.parseInt(System.console().readLine());
    contador = 100;
    temp = 0;
    
    if (num > 0) {
      
      while (contador > 0) {
        
        temp = temp + num;
        System.out.println(num);
        
        contador--;
        num++;
      }
    } else  {
      
      System.out.println("El número introducido no es válido");
    }
  }
}
