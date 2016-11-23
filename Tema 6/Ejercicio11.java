/** Ejercicio 11 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio11 {
  public static void main(String[] args) {
  
    int num,suspenso,suficiente,bien,notable,sobresaliente;
    String nota = "suspenso";
    suspenso = 0;
    suficiente = 0;
    bien = 0;
    notable = 0;
    sobresaliente = 0;
    
    for (int i = 0; i < 20; i++) {
      
      num = (int)(Math.random()*11);
      
      if (num >= 0 && num < 5) {
      
        nota = "suspenso";
        suspenso++;
        
      } else if (num >= 5 && num < 6) {
        
        nota = "suficiente";
        suficiente++;
      } else if (num >= 6 && num < 7) {
        
        nota = "bien";
        bien++;
        
      } else if (num >= 7 && num < 9) {
        
        nota = "notable";
        notable++;
      } else if (num >= 9 && num <= 10) {
        
        nota = "sobresaliente";
        sobresaliente++;
      }
      
      System.out.println("La nota es: " + nota);
    }
    
    System.out.println("Han habido " + suspenso + " suspensos " + suficiente + " suficiente " + bien + " bien " + notable + " notable " + sobresaliente + " sobresaliente");
    
  }
}
        
          
        
