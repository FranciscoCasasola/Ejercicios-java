/** Ejercicio 08 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio08 {
  public static void main(String[] args) {

    int num;
    int contador;
    contador = 1;
    
    System.out.print("Introduzca un número, saldra su tabla de multiplicar: ");
    
    num = Integer.parseInt(System.console().readLine());
    
    while (contador <= 10) {
      
      System.out.println(num*contador);
      contador++;
      
    }
  }
}
