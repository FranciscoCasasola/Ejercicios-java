/** Francisco Casasola Cano */

public class Ejercicio9 {
  public static void main(String[] args) {

    String linea;

    double altura;
    double radio;
    double radioAlCuadrado;
    double pi = 3.14159;
    double multiplicacion;
    double resultado;
    double unTercio;
    
    unTercio = 0.333333;

    System.out.print("Introduzca la altura:");

    linea = System.console().readLine();
    altura = Double.parseDouble( linea );
    
    System.out.print("Introduzca el radio:");
    
    linea = System.console().readLine();
    radio = Double.parseDouble( linea );
    
    radioAlCuadrado = (radio*radio);
    multiplicacion = (radioAlCuadrado*pi*altura);
    resultado = ( unTercio * multiplicacion);
    
    
        

    System.out.println("El volumen es de:" + resultado);

  }
}
