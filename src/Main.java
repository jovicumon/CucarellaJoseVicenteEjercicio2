
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int fila;
        int columna;
        int i;
        int j;
        char patron;
        String pintar;

        // Solicitamos el caracter para el patrón.

        System.out.println("Introduce el carácter para el patrón; ");
        patron = scanner.next().charAt(0);
        scanner.nextLine();                         // Limpieza buffer.

        // Solicitamos tamaño para las casillas.

        do {
            System.out.println("Introduce el tamaño de la casilla (entre: 1-15): ");
            while (!scanner.hasNextInt()) {         // Verificamos que el tamaño es un número.
                System.out.println("Dato erróneo, introduce un número entero.");
                scanner.next();                     // Limpieza buffer.
            }
            size = scanner.nextInt();
            if (size < 1 || size > 15) {
                System.out.println("Introduce un valor entre 1 y 15.");
            }
        }while (size < 1 || size > 15) ;

            //Generamos el tablero

        for (j =0; j < (size + 1) * 8 + 1; j++){                    // Primera fila de guiones para nuestro tablero.
            System.out.print("-");
        }
        System.out.println();
            for (fila = 0; fila < 8; fila++) {                      // El tablero tiene un máximo de 8 filas.
                for (i = 0; i < size; i++) {
                    System.out.print("|");                          // Borde izquierdo.
                    for (columna = 0; columna < 8; columna++) {     // El tablero tiene un máximo de 8 columnas.
                       pintar = " ";
                       if ((fila + columna) % 2 !=0){               // Determinamos color de la casilla.
                           pintar = String.valueOf(patron);         // Pinta la casilla negra
                       }
                        for (j =0; j < size; j++){
                            System.out.print(pintar);              // Pintar la casilla blanca.
                        }
                        System.out.print("|");                     // Borde derecho.
                    }
                    System.out.println();
                }
                for(j =0; j < (size+1) * 8 + 1; j++){              // Bucle para separación de filas con -.
                    System.out.print("-");
                }
                System.out.println();
            }
            scanner.close();
        }
    }
