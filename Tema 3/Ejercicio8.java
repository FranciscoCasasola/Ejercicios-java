/** Francisco Casasola Cano */

public class Ejercicio8 {
  public static void main(String[] args) {
  
    String linea;
    
    double horas;
    double horasCompletas;
    
    System.out.print("Introduce las horas que has trabajado:");
    
    linea = System.console().readLine();
    horas = Double.parseDouble( linea );
    
    horasCompletas = horas*7;
    
    System.out.println("Este es su salario:" + horasCompletas*12 + "euros");
    
  }
}    
    
  
