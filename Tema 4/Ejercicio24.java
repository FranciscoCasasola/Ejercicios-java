/** Ejercicio 24 Tema 4
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio24 {
  public static void main(String[] args) {
    
    double sueldoBase, sueldoBruto, sueldoNeto;
    double dietas, irpf;
    int cargo, dias, estado;
    sueldoBase = 0;
    irpf = 0;
    dietas = 0;
    sueldoBruto = 0;
    
    System.out.println("1. Programador junior");
    System.out.println("2. Programador senior");
    System.out.println("3. Jefe de proyecto");
    System.out.print("Introduzca el cargo del empleado (1-3): ");
    
    cargo = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca cuantos dias ha estado de viaje visitando clientes?: " );
    
    dias = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca su estado civil (1. Soltero - 2. Casado): ");
    
    estado = Integer.parseInt(System.console().readLine());
    
    switch (cargo) {
      
      case 1:
      
        sueldoBase = 950;
        
      break;
        
      case 2:
      
        sueldoBase = 1200;
        
      break;
      
      case 3:
      
        sueldoBase = 1600;
        
      break;
      
    }
    
    if (dias >= 0) { 
      
      dietas = 30*dias;
      
    } else  {
      
      System.out.println("No existen dias negativos");
      
    }
    
    switch (estado) {
      
      case 1:
      
        irpf = 0.25;
        
      break;
      
      case 2:
      
        irpf = 0.20;
        
      break;
      
      default:
        
        System.out.println("Ese dato no es válido");
        
      }
      
      sueldoBruto = sueldoBase + dietas;
      sueldoNeto = sueldoBruto*irpf;
      
      System.out.println("-----------------------------------------");
      System.out.printf("%-25s          %8.2f    %5s" , "Sueldo base" , sueldoBase , "\n");
      System.out.printf("%-25s          %8.2f ,  %5s" , "Dietas(" + dias + " dias)" , dietas , "\n");
      System.out.println("-----------------------------------------");
      System.out.printf("%-25s          %8.2f    %5s" , "Sueldo bruto" , sueldoBruto , "\n");
      System.out.printf("%-25s          %8.2f    %5s" , "Retención IRPF (" + irpf*100 + "%)" , sueldoBruto*irpf , "\n");
      System.out.println("-----------------------------------------");
      System.out.printf("%-25s          %8.2f" , "Sueldo neto" , sueldoNeto);
      
      
      
    }
  } 
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
