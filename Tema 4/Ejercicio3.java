/** Ejercicio 3 Tema 4
 *
 *
 *
 * @author Francisco Casasola Cano
 */
public class Ejercicio3 {
  public static void main(String[] args) {
    
    System.out.print("Escribe un dia de la semana (1-7):");
    int dia = Integer.parseInt(System.console().readLine());
    
    String diaSemana = "lunes";
    
    switch (dia) {
      
      case 1:
        diaSemana = "lunes";
        break;
      case 2:
        diaSemana = "martes";
        break;
      
      case 3:
        diaSemana = "miercoles";
        break;
      case 4:
        diaSemana = "jueves";
        break;
      case 5:
        diaSemana = "viernes";
        break;
      case 6:
        diaSemana = "sabado";
        break;
      case 7:
        diaSemana = "domingo";
        break;
      
      default:
        System.out.println("El dia de la semana introducido no existe");
        
      }
    
    System.out.println("Dia" + dia + ":" + diaSemana);
  }
}
        
