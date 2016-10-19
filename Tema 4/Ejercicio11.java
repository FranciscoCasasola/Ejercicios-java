/** Ejercicio 11
 *
 *
 * @author Francisco Casasola Cano
 */

public class Ejercicio11 {
  public static void main(String[] args) {
    
    
    int hora, min;
    int medianoche;
    int tiempoRestante;
    
    medianoche = 86400;
    
    System.out.print("Introduce la hora dia en la que estas: ");
    
    hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce los minutos: ");
    
    min = Integer.parseInt(System.console().readLine());
    
    hora = (hora*3600);
    min = (min*60);
    
    tiempoRestante = (medianoche - (hora+min) );
    
    System.out.println("Este es el tiempo que queda hasta la medianoche: " + tiempoRestante + " Seg");
    
    
    
  }
}

