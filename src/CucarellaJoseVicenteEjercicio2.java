
import java.util.Scanner;

public class CucarellaJoseVicenteEjercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        int fila;
        int columna;
        int i;
        int j;
        int tamanoTablero = 8;
        char patron;
        String pintar;
        String textoBlanco = " ";
        String barra = "|";
        String guion = "-";
        boolean datosCorrectos = false;

        // Solicitamos el caracter para el patrón.

        System.out.println("Introduce el carácter, número o símbolo para el patrón; ");
        patron = scanner.next().charAt(0);
        scanner.nextLine();                         // Limpieza buffer.

        // Solicitamos tamaño para las casillas.

        while(!datosCorrectos){
            System.out.println("Introduce el tamaño de la casilla (entre: 1-15): ");
            if(!scanner.hasNextInt()){              // Verificamos que el tamaño es un número.
                System.out.println("Dato erróneo, introduce un número entero.");
                scanner.next();
            }else{
                size = scanner.nextInt();
                if (size < 1 || size > 15) {
                    System.out.println("Introduce un valor entre 1 y 15.");
                }else{
                    datosCorrectos = true;
                }
            }
        }
            //Generamos el tablero

        for (j =0; j < (size + 1) * tamanoTablero + 1; j++){                    // Primera fila de guiones para nuestro tablero.
            System.out.print(guion);
        }
        System.out.println();
            for (fila = 0; fila < tamanoTablero; fila++) {                      // El tablero tiene un máximo de 8 filas.
                for (i = 0; i < size; i++) {
                    System.out.print(barra);                                    // Borde izquierdo.
                    for (columna = 0; columna < tamanoTablero; columna++) {     // El tablero tiene un máximo de 8 columnas.
                       pintar = textoBlanco;
                       if ((fila + columna) % 2 !=0){                           // Determinamos color de la casilla.
                           pintar = String.valueOf(patron);                     // Pinta la casilla negra
                       }
                        for (j =0; j < size; j++){
                            System.out.print(pintar);                           // Pintar la casilla blanca.
                        }
                        System.out.print(barra);                                // Borde derecho.
                    }
                    System.out.println();
                }
                for(j =0; j < (size+1) * tamanoTablero + 1; j++){              // Bucle para separación de filas con -.
                    System.out.print(guion);
                }
                System.out.println();
            }
            scanner.close();
        }
    }
