/** Ejercicio 19 Tema 4
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio19 {
  public static void main(String[] args) {
    
    int num;
    int cociente1, cociente2, cociente3;
    int pos1, pos2, pos3, pos4, pos5;
    
    System.out.print("Introduce un número entero no mayor de 5 digitos :");
    
    num = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if ( num > -100 && num < 100) {
      
      pos1 = num / 10;
      pos2 = num % 10;
      
      System.out.println("El número se descompone en los siguientes digitos: " + pos1 + " " + pos2);
      
    } else if ( num> -1000 && num < 1000) {
      
      cociente1 = num / 10;
      pos1 = num / 100;
      pos2 = cociente1 % 10;
      pos3 = num % 10;
      
      System.out.println("El número se descompone en los siguientes digitos: " + pos1 + " " + pos2 + " " + pos3);
    } else if ( num > -10000 && num < 10000) {
      
      cociente1 = num / 10;
      cociente2 = cociente1 / 10;
      pos1 = num/1000;
      pos2 = cociente2 % 10;
      pos3 = cociente1 % 10;
      pos4 = num % 10;
      
      System.out.println("El número se descompone en los siguientes digitos: " + pos1 + " " + pos2 + " " + pos3 + " " + pos4);
    } else if ( num > -100000 && num < 100000) {
      
      cociente1 = num/10;
      cociente2 = num/100;
      cociente3 = num/1000;
      pos1 = num/10000;
      pos2 = cociente3 % 10;
      pos3 = cociente2 % 10;
      pos4 = cociente1 % 10;
      pos5 = num % 10;
      
      System.out.println("El número se descompone en los siguientes digitos: " + pos1 + " " + pos2 + " " + pos3 + " " + pos4 + " " + pos5);
    } else {
      
      System.out.println("El número introducido es mayor a 5 digitos");
    }
    
  }
}
      
      
