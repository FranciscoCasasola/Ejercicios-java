/** Ejercicio 10
 *
 *
 *
 * @author Francisco Casasola Cano
 */

public class Ejercicio10 {
  public static void main(String[] args) {
    
    int dia,mes;
    
    System.out.print("Introduce el mes de tu nacimiento: ");
    
    mes = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el dia de tu nacimiento: ");
    
    dia = Integer.parseInt(System.console().readLine());
    
    
    if ( mes > 13 || dia > 31 ) {
      
      System.out.println("Ha introducido valores erroneos"); 
    
    } else if ( (mes == 1 && dia >= 21) || (mes == 2 && dia <= 16 )) {
      
      System.out.println("Eres capricornio");
      
    } else if ( ( mes == 2 && dia >= 17) || ( mes == 3 && dia <= 12) ) {
      
      System.out.println("Eres acuario");
      
    } else if ( ( mes == 3 && dia >= 13) || (mes == 4 && dia <= 18) ) {
      
      System.out.println("Eres piscis");
      
    } else if ( ( mes == 4 && dia >= 19) || (mes == 5 && dia <= 14) ) {
      
      System.out.println("Eres aries");
      
    } else if ( ( mes == 5  && dia >= 15) || (mes == 6 && dia <= 21) ) {
      
      System.out.println("Eres tauro");

    } else if ( ( mes == 6 && dia >= 22) || ( mes == 7 && dia <= 20) ) {
      
      System.out.println("Eres geminis");
      
    } else if ( ( mes == 7 && dia >= 21) || ( mes == 8 && dia <= 10) ) {
      
      System.out.println("Eres cancer");
      
    } else if ( ( mes == 8 && dia >= 11) || ( mes == 9 && dia <= 16) ) {
      
      System.out.println("Eres Leo");
      
    } else if ( ( mes == 9 && dia >= 17) || ( mes == 10 && dia <= 31) ) {
      
      System.out.println("Eres Virgo");
      
    } else if ( ( mes == 11 && dia >= 1) || ( mes == 11 && dia <= 23) ) {
      
      System.out.println("Eres Libra");
      
    } else if ( ( mes == 11 && dia >= 24) || (mes == 11 && dia <= 29) ) {
      
      System.out.println("Eres escorpio");
      
    } else if ( ( mes == 11 && dia >= 30) || (mes == 12 && dia <= 18) ) {
      
      System.out.println("Eres ofiuco");
      
    } else if ( ( mes == 12 && dia >= 19) || (mes == 1 && dia <= 20) ) {
      
      System.out.println("Eres sagitario");
      
    }
    

  } 
} 
