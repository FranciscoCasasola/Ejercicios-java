/** Ejercicio 34 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio34 {
  public static void main(String[] args) {
  
    int num,num2;
    int temp,temp2,temp3,temp4,contador;
    contador = 10;
    
    System.out.print("Introduzca un número: ");
    num = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca un segundo número de igual tamaño que el primero");
    num2 = Integer.parseInt(System.console().readLine());
    
    temp = num;
    temp4 = num2;
    System.out.print("Este es el número formado por los pares ");
    
    while (num > 0 && num2 > 0) {
      
      temp2 = temp;
      while (temp2 >= contador) {
        
        temp2 = temp2 / 10;
      }
      
      temp3 = temp2 % 10;
      
      if ( temp3 % 2 == 0) {
        
        System.out.print(temp3);
      } else {
        System.out.println();
      }
      
      temp2 = temp4;
      while (temp2 >= contador) {
        
        temp2 = temp2 / 10;
      }
      
      temp3 = temp2 % 10;
      
      if ( temp3 % 2 == 0) {
        
        System.out.print(temp3);
      }
      
      num = num / 10;
      num2 = num2 / 10;
      
      contador = contador*10;
      
      
    }
  }
}
      
      
        
        
      
