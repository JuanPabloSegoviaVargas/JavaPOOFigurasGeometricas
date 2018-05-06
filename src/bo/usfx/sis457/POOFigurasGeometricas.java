 /*
 * Ejemplo del Principio de Encapsulamiento 
 */
package bo.usfx.sis457;

import bo.usfx.sis457.figuras.*;
import java.util.Scanner;

/**
 * Clase principal que instancia objetos de las clases del paquete figuras
 * @author Marcelo
 */
public class POOFigurasGeometricas {
        
    /**
     * Clase principal
     * @param args the command line arguments
     * 
     */

    public static void main(String[] args) {
        // Declaracion de las variables
        Scanner entradaTeclado;
        int opcion;
        int saltar;
        
        do{
            limpiarConsola();
            System.out.println("+==================================================+");
            System.out.println("| Programa: Figuras Geometricas                    |");
            System.out.println("| - Ejemplo de Encapsulamiento                     |");
            System.out.println("+============================================================+");
            System.out.println("| Que desea realizar?                                        |");
            System.out.println("| 1) Calcular el area y perimetro de un Circulo              |");
            System.out.println("| 2) Calcular el area y perimetro de un Cuadrado             |");
            System.out.println("| 3) Calcular el area y perimetro de un Rectangulo           |");
            System.out.println("| 4) Calcular el area y perimetro de un Triangulo Equilatero |");
            System.out.println("| 5) Calcular el area y perimetro de un Pentagono            |");
            System.out.println("| 6) Calcular el area y perimetro de una Elipse              |");
            System.out.println("| 7) Salir                                                   |");
            System.out.println("+============================================================+");
           
            entradaTeclado = new Scanner(System.in);
            opcion = entradaTeclado.nextInt();
            
            switch (opcion) {
                case 1:
                /* Se instancia un objeto de la Clase Círculo y posteriormente se modifica el valor
                   de su propiedad "Radio" a través de un método accesor o setter (setRadio). */
                    Circulo circulo = new Circulo();
                    limpiarConsola();
                    System.out.println("+==================================================+");
                    System.out.println("| SubPrograma: Circulo                             |");
                    System.out.println("+==================================================+");
                    System.out.print("Introduzca el valor del radio: ");
                    float radio = (float)entradaTeclado.nextFloat();
                    circulo.setRadio(radio);
                    System.out.println("El Area del Circulo es: " + circulo.getArea());
                    System.out.println("El Perimetro del Circulo es: " + circulo.getPerimetro());
                    
                    System.out.println(" \ningrese 1 para usar otra funcion");
                    saltar= entradaTeclado.nextInt();
                    break;
                 case 2:
                /* Se instancia un objeto de la Clase Cuadrado y posteriormente se modifica el valor
                   de su propiedad "Lado" a través de un método accesor o setter (setRadio). */
                    Cuadrado cuadrado = new Cuadrado();
                   limpiarConsola();
                    System.out.println("+==================================================+");
                    System.out.println("| SubPrograma: Cuadrado                            |");
                    System.out.println("+==================================================+");
                    System.out.print("Introduzca el valor del lado: ");
                    cuadrado.setLado(entradaTeclado.nextDouble());
                    System.out.println("El Area del Cuadrado es: " + cuadrado.getArea());
                    System.out.println("El Perimetro del Cuadrado es: " + cuadrado.getPerimetro()); 
                    System.out.println(" \n\ningrese 1 para usar otra funcion");
                    saltar= entradaTeclado.nextInt();
                    
                    break;
                case 3:
                /* Se instancia un objeto de la Clase Rectangulo y a la vez se inicilaizan los valores
                   de sus propiedades "Base" y "Altura" a través del método Constructor (Rectangulo). */
                   limpiarConsola();
                    System.out.println("+==================================================+");
                    System.out.println("| SubPrograma: Rectangulo                          |");
                    System.out.println("+==================================================+");
                    System.out.print("Introduzca el valor de la Base: ");
                    double base = entradaTeclado.nextDouble();
                    System.out.print("Introduzca el valor de la Altura: ");
                    double altura = entradaTeclado.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(base, altura);
                    System.out.println("El Area del Rectangulo es: " + rectangulo.getArea());
                    System.out.println("El Perimetro del Rectangulo es: " + rectangulo.getPerimetro());
                    System.out.println(" \n\ningrese 1 para usar otra funcion");
                    saltar= entradaTeclado.nextInt();
                    
                    break;
                case 4:
                
                   limpiarConsola();
                    System.out.println("+=====================================================+");
                    System.out.println("| SubPrograma: Triangulo esquilatero                  |");
                    System.out.println("+=====================================================+");
                    System.out.print("Introduzca el valor de un lado del triangulo equilatero: ");
                    double l = entradaTeclado.nextDouble();
                    TrianguloEquilatero triangulo  = new TrianguloEquilatero(l);
                    System.out.println("El Area del triangulo es: " + triangulo.getArea());
                    System.out.println("El Perimetro del triangulo es: " + triangulo.getPerimetro());
                    System.out.println(" \n\ningrese 1 para usar otra funcion");
                    saltar= entradaTeclado.nextInt();
                    
                    break;
                case 5:
                   limpiarConsola();
                    System.out.println("+=====================================================+");
                    System.out.println("| SubPrograma: Pentagono                              |");
                    System.out.println("+=====================================================+");
                    System.out.print("Introduzca el valor de un lado del pentagono regular: ");
                    double lado = entradaTeclado.nextDouble();
                    Pentagono pentagono  = new Pentagono(lado);
                    System.out.println("El Area del Pentagono es: " + pentagono.getArea());
                    System.out.println("El Perimetro del Pentagono es: " + pentagono.getPerimetro());
                    System.out.println(" \n\ningrese 1 para usar otra funcion");
                    saltar= entradaTeclado.nextInt();
                    
                    break;
                case 6:
                /* Se instancia un objeto de la Clase elipse y a la vez se inicilaizan los valores
                   de sus propiedades "Base" y "Altura" a través del método Constructor (Rectangulo). */
                   limpiarConsola();
                    System.out.println("+==================================================+");
                    System.out.println("| SubPrograma: Elipse                              |");
                    System.out.println("+==================================================+");
                    System.out.println("       ********          ");
                    System.out.println("     *    r|____*");
                    System.out.println("     *        R *");
                    System.out.println("       ********");
                    System.out.print("Introduzca el valor del radio mayor R de la elipse: ");
                    double RadioMayor = entradaTeclado.nextDouble();
                    System.out.print("Introduzca el valor del radio menor r de la elipse: ");
                    double RadioMenor = entradaTeclado.nextDouble();
                    Elipse elipse = new Elipse(RadioMayor, RadioMenor);
                    System.out.println("El Area de la Elipse es: " + elipse.getArea());
                    System.out.println("El Perimetro aproximado de la Elipse es: " + elipse.getPerimetro());
                    System.out.println(" \n\ningrese 1 para usar otra funcion");
                    saltar= entradaTeclado.nextInt();
                    
                    break;    
                default:
                    System.out.println("Salio del programa");
            }
            
        }while(opcion !=7);
    }
    
    /**
     * Método que limpia pantalla de la consola. Funciona fuera de NetBeans.
     */
        public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        }

}
