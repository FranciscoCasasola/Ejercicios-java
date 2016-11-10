/** Ejercicio 30 Tema 5 
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio30 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    int dia,hora,dia2,hora2,temp,temp2;
    
    
    do {
      
    System.out.print("Introduzca la primera hora: ");
    dia = s.nextInt();
    hora = s.nextInt();
    
    System.out.print("Introduzca la segunda hora: ");
    dia2 = s.nextInt();
    hora2 = s.nextInt();
    
    } while (dia > 8 && dia2 > 8 && hora > 25 && hora2 > 25 && dia > dia2 && hora > hora2);
    
    temp = (dia2 - dia)*24;
    temp2 = hora2 - hora;
    
    System.out.println("Hay " + (temp+temp2) + " hora/s de diferencia");
  }
}
      
      
    
    
