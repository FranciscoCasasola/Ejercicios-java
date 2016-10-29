/** Ejercicio 09 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio09 {
  public static void main(String[] args) {
    
    int num;
    int contadorCifras;
    contadorCifras = 0;
    
    System.out.print("Introduce un número para saber su número de digitos: ");
    num = Integer.parseInt(System.console().readLine());
    
    
    while (num != 0) {
      
      num = num / 10;
      contadorCifras++;
    }
    
    System.out.println("El número tiene " + contadorCifras + " cifras");
  }
}
    
