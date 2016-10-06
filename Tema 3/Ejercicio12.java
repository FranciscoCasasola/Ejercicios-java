/** Francisco Casasola Cano */

public class Ejercicio12 {
  public static void main(String[] args) {

    String linea;
    double primerExamen;
    double segundoExamen;
    double nota;
    double resultado;
    double valorPrimerExamen;
    double valorSegundoExamen;

    System.out.print("Introduce la nota del primer examen: ");

    linea = System.console().readLine();
    primerExamen = Double.parseDouble( linea );
    
    System.out.print("¿Que nota quieres sacar en el trimestre?: ");
    
    linea = System.console().readLine();
    nota = Double.parseDouble( linea );

    valorPrimerExamen = primerExamen*0.40;
    valorSegundoExamen = nota - valorPrimerExamen;
    segundoExamen = valorSegundoExamen / 0.60;
    
    

    System.out.println("Para tener un " + nota + " en el trimestre sacar un " + segundoExamen + " en el segundo examen");
  }
}
    
    
