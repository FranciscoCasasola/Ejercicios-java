/** Ejercicio 10 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio10 {
  public static void main(String[] args) {
    
    int num,media,temp;
    int contador;
    contador = 1;
    media = 0;
    temp = 0;
    
    System.out.print("Introduce números por teclado para saber su media (numero negativo para terminar): ");
    
    num = Integer.parseInt(System.console().readLine());
    
    while (num > 0) {
      
      temp = temp + num;
      
      System.out.print("Introduce otro número (-1 para terminar): ");
      
      num = Integer.parseInt(System.console().readLine());
      
      if (num > 0) {
      
      media = (temp + num);
      contador++;
      
    }
      
    }
    media = media / contador;
    
    System.out.println("La media es de " + media);
  }
}
      
      
      
