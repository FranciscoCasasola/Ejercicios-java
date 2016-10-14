/** Ejercicio 11
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int hora, min;
    int medianoche;
    int tiempoRestante;
    
    medianoche = 86400;
    
    System.out.println("Introduce la hora y minutos del dia en el que estas: ");
    
    hora = s.nextInt();
    min = s.nextInt();
    
    hora = (hora*3600);
    min = (min*60);
    
    tiempoRestante = (medianoche - (hora+min) );
    
    System.out.println("Este es el tiempo que queda hasta la medianoche: " + tiempoRestante + " Seg");
    
    
    
  }
}

