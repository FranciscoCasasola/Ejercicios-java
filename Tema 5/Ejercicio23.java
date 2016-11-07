/** Ejercicio 23 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio23 {
  public static void main(String[] args) {
    
    int num,contadorNumeros,total;
    int temp;

    contadorNumeros = -1;
    total = 0;
    
    for (temp = 0; temp < 10000; contadorNumeros++) {
      
      System.out.print("Introduzca un número: ");
      num = Integer.parseInt(System.console().readLine());
      
       temp = temp + num;
      
      if (temp > 10000) {
        total = temp-num;
      }
    }
    
    System.out.println("Este es el total de la suma de los números introducidos: " + total);
    System.out.println("Esta es la cantidad de números introducidos: " + contadorNumeros);
    System.out.println("Esta es la media de los números " + (total/contadorNumeros));
  }
}
