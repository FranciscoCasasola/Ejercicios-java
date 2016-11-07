/** Ejercicio 26 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio26 {
  public static void main(String[] args) {
    
    int num, digito;
    int temp,temp2,contador,contarNum,temp3;
    contador = 10;
    contarNum = 1;
    
    System.out.print("Introduce un número: ");
    num = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce un dígito: ");
    digito = Integer.parseInt(System.console().readLine());
    
    temp = num;
    
    while (num > 0) {
      
      temp3 = temp;
      while (temp3 >= contador) {
        temp3 = temp3 / 10;
      }
      temp2 = temp3%10;
      if (temp2 == digito) {
        
        System.out.println("El digito esta en la posición / las posiciones " + contarNum);
      }
      num = num / 10;
      contador = contador*10;
      contarNum++;
    }
    
  }
}
      
        
