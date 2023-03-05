import java.util.Scanner;

public class Main {
    static char[][] tablaArte = new char[10][40];

    public static void main(String[] args) {
        inicializarTablaArte();

        mostrarTablaArte();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Dibujar un carácter");
            System.out.println("2. Dibujar un rectángulo");
            System.out.println("3. Cambiar el color");
            System.out.println("4. Salir");


            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    dibujarCaracter();
                    break;
                case 2:
                    dibujarRectangulo();
                    break;
                case 3:
                    cambiarColor();
                    break;
                case 4:
                    System.out.println("¡Adiós!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida");
            }

            mostrarTablaArte();
        }
    }

    static void inicializarTablaArte() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 40; j++) {
                tablaArte[i][j] = ' ';
            }
        }
    }

    static void mostrarTablaArte() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 40; j++) {
                System.out.print(tablaArte[i][j]);
            }
            System.out.println();
        }
    }

    static void dibujarCaracter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el carácter:");
        char caracter = scanner.next().charAt(0);

        System.out.println("Ingrese la fila:");
        int fila = scanner.nextInt();

        System.out.println("Ingrese la columna:");
        int columna = scanner.nextInt();

        tablaArte[fila][columna] = caracter;
    }

    static void dibujarRectangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el carácter:");
        char caracter = scanner.next().charAt(0);

        System.out.println("Ingrese la fila superior:");
        int filaSuperior = scanner.nextInt();

        System.out.println("Ingrese la columna izquierda:");
        int columnaIzquierda = scanner.nextInt();

        System.out.println("Ingrese la fila inferior:");
        int filaInferior = scanner.nextInt();

        System.out.println("Ingrese la columna derecha:");
        int columnaDerecha = scanner.nextInt();

        for (int i  = filaSuperior; i <= filaInferior; i++) {
            for (int j = columnaIzquierda; j <= columnaDerecha; j++) {
                tablaArte[i][j] = caracter;
            }
        }
    }
    static void cambiarColor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el color:");
        String color = scanner.next();

        System.out.print("\033[0;3" + color + "m");
    }
}