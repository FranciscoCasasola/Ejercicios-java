/** Ejercicio 2 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio02 {
  public static void main(String[] args) {

    String palo = "";
    String carta = "";
    
    int num = (int)((Math.random()*4)+1);
    
    switch(num) {
      
      case 1: 
        
        palo = "Picas";
        break;
        
      case 2:
      
        palo = "Corazones";
        break;
        
      case 3:
      
        palo = "Diamantes";
        break;
        
      case 4:
      
        palo = "Treboles";
        break;
        
      }
      
    int num2 = (int)((Math.random()*13)+1);
    
    switch (num2) {
      
      case 1:
      
        carta = "A";
        break;
        
      case 11:
      
        carta = "J";
        break;
      
      case 12:
      
        carta = "Q";
        break;
        
      case 13:
      
        carta = "K";
        break;
        
      default:
      
        carta = String.valueOf(num2);
        break;
        
      }
      
      System.out.print("La carta es el " + carta + " de " + palo);
    }
  }
    
