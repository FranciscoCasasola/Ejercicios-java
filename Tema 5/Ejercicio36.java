/** Ejercicio 36 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio36 {
  public static void main(String[] args) {


    long num,temp,volteado;
    volteado = 0;

    System.out.print("Introduzca un número para saber si es capicua o no: ");
    num = Integer.parseInt(System.console().readLine());
    
    temp = num;
    while (temp > 0) {
      
      volteado = (volteado*10) + (temp % 10);
      temp = temp / 10;
    }
    
    if (volteado == num ) {
      
      System.out.print("El número es capicua ");
      
    } else {
      
      System.out.print("El número no es capicua ");
      
    }
  }
}
      
      
      
