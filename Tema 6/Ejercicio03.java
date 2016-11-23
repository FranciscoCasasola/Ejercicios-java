/** Ejercicio 3 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio03 {
  public static void main(String[] args) {
  
    String palo = "";
    String carta = "";
    
    int num = (int)((Math.random()*4)+1);
    
    switch(num) {
      
      case 1: 
        
        palo = "Bastos";
        break;
        
      case 2:
      
        palo = "Espadas";
        break;
        
      case 3:
      
        palo = "Copas";
        break;
        
      case 4:
      
        palo = "Oros";
        break;
        
      }
      
    int num2 = (int)((Math.random()*10)+1);
    
    switch (num2) {
      
      case 1:
      
        carta = "As";
        break;
        
      case 8:
      
        carta = "Sota";
        break;
      
      case 9:
      
        carta = "Reina";
        break;
        
      case 10:
      
        carta = "Rey";
        break;
        
      default:
      
        carta = String.valueOf(num2);
        break;
        
      }
      
      System.out.print("La carta es el " + carta + " de " + palo);
    }
  }
