/** Ejercicio 23 Tema 4
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio23 {
  public static void main(String[] args) {
    
    double precio, precioFinal, precioIva;
    double anadeIva, anadePromo;
    String tipoIva;
    String codProm;
    
    precioIva = 0;
    anadePromo = 0;
    
    System.out.print("Introduzca la base imponible del producto: ");
    
    precio = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el tipo de IVA (general, reducido, superreducido) : ");
    
    tipoIva = System.console().readLine().toLowerCase();
    
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5, 5porc : ");
    
    codProm = System.console().readLine().toLowerCase();
    
    System.out.println("Base Imponible " + precio);
    
    switch (tipoIva) {
      
      case "general":
        
        anadeIva = (precio*0.21);
        precioIva = precio + anadeIva;
        
        System.out.println("IVA (21%) : " + (anadeIva));
        System.out.println("Precio con IVA " + (precioIva));
        
        break;
        
      case "reducido":
        
        anadeIva = (precio*0.10);
        precioIva = precio + anadeIva;
        
        System.out.println("IVA (10%) : " + (anadeIva));
        System.out.println("Precio con IVA " + (precioIva));
        
        break;
        
      case "superreducido":
        
        anadeIva = (precio*0.04);
        precioIva = precio + anadeIva;
        
        System.out.println("IVA (4%): " + (precio*0.04));
        System.out.println("Precio con IVA " + (precioIva));
        break;
        
      default :
      
        System.out.println("El iva introducido no es correcto");
      }
      
      
    switch (codProm) {
      
      case "nopro":
      
        System.out.println("Cod. Promo (nopro) " + (-0));
        
        break;
        
      case "mitad":
        
        anadePromo = precioIva / 2;
        System.out.println("Cod. Promo (mitad) " + (-anadePromo));
        
        break;
        
      case "meno5":
      
        anadePromo = precioIva - 5;
        System.out.println("Cod. Promo (meno5) " +  (-anadePromo));
        
        break;
        
      case "5porc":
      
        anadePromo = precioIva*0.05;
        System.out.println("Cod. Promo (5porc) " + (-anadePromo));
        
        break;
        
      default:
      
        System.out.println("No existe el codigo promocional");
        
        
      }
      
      precioFinal = precioIva - anadePromo;
      
      System.out.println("TOTAL " + precioFinal);
      
    }
  }
        
        
        
        
        
        
        
        
        
        
        
        
        
