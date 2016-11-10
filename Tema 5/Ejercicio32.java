/** Ejercicio 32 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio32 {
  public static void main(String[] args) {
  
    int num,suma;
    int temp,temp2,temp3,contador;
    contador = 10;
    suma = 0;
    
    System.out.print("Introduzca un número: ");
    num = Integer.parseInt(System.console().readLine());
    temp = num;
    
    System.out.print("Digitos pares ");
    while (num > 0) {
      
      temp3 = temp;
      while (temp3 >= contador) {
        temp3 = temp3 / 10;
      }
      temp2 = temp3%10;
      
      if (temp2%2 == 0) {
        
        System.out.print(temp2 + " ");
        suma = suma + temp2;
      }
      
      num = num / 10;
      contador = contador*10;
    }
    
    System.out.println("\nSuma de los dígitos pares " + suma);
    
  }
}
