/** Ejercicio 22 Tema 4
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio22 {
  public static void main(String[] args) {
    
    int hora,minutos,minutosFaltan;
    String diaSemana;
    
    System.out.print("Introduce la hora: ");
    
    hora = Integer.parseInt(System.console().readLine());
    
    
    System.out.print("Introduce los minutos: ");
    
    minutos = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el dia de la semana en la que estas: ");
    
    diaSemana = System.console().readLine().toLowerCase();
    
    switch (diaSemana) {
      
      case "lunes":
      
        minutosFaltan = 1440 - ((hora*60) + minutos);
        minutosFaltan = minutosFaltan + 900;
        minutosFaltan = minutosFaltan + 4320;
        
        System.out.println("Quedan " + minutosFaltan + " minutos para el viernes a las 15:00");
        
        break;
        
      case "martes":
      
        minutosFaltan = 1440 - ((hora*60) + minutos);
        minutosFaltan = minutosFaltan + 900;
        minutosFaltan = minutosFaltan + 2880;
        
        System.out.println("Quedan " + minutosFaltan + " minutos para el viernes a las 15:00");
        
        break;
        
      case "miercoles":
      
        minutosFaltan = 1440 - ((hora*60) + minutos);
        minutosFaltan = minutosFaltan + 900;
        minutosFaltan = minutosFaltan + 1440;
        
        System.out.println("Quedan " + minutosFaltan + " minutos para el viernes a las 15:00");
        
        break;
        
      case "jueves":
      
        minutosFaltan = 1440 - ((hora*60) + minutos);
        minutosFaltan = minutosFaltan + 900;
        
        System.out.println("Quedan " + minutosFaltan + " minutos para el viernes a las 15:00");
        
        break;
        
      case "viernes":
      
        minutosFaltan = 900 - ((hora*60) + minutos);
        
        System.out.println("Quedan " + minutosFaltan + " minutos para el viernes a las 15:00");
        
        break;
        
      default:
        
      
      
        
        
      }
    }
  }
      
    
    
