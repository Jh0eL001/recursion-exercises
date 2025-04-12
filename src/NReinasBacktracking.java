// https://www.brainbashers.com/queens.asp?size=8
public class NReinasBacktracking {
    static final int N = 4; // Tamaño del tablero

    // Arreglos para verificar las columnas y las diagonales
    static boolean[] columnas = new boolean[N];
    static boolean[] diagonal1 = new boolean[2 * N - 1]; // Para la diagonal principal
    static boolean[] diagonal2 = new boolean[2 * N - 1]; // Para la diagonal secundaria

    // Método recursivo para resolver el problema de las N reinas
    public static void resolver(int fila, int[] tablero) {
        // Si hemos colocado todas las reinas
        if (fila == N) {
            imprimirSolucion(tablero); // Imprimir la solución encontrada
            return;
        }

        // Intentar colocar una reina en cada columna de la fila actual
        for (int columna = 0; columna < N; columna++) {
            // Verificar si es seguro colocar la reina en (fila, columna)
            if (esValida(fila, columna)) {
                // Colocar la reina (marcar la posición en el arreglo de solución)
                tablero[fila] = columna;

                // Marcar las columnas y diagonales como ocupadas
                columnas[columna] = true;
                diagonal1[fila - columna + N - 1] = true; // Ajuste para el índice negativo
                diagonal2[fila + columna] = true;

                // Llamada recursiva para la siguiente fila
                resolver(fila + 1, tablero);

                // Desmarcar la columna y las diagonales si no se encontró solución
                columnas[columna] = false;
                diagonal1[fila - columna + N - 1] = false;
                diagonal2[fila + columna] = false;
            }
        }
    }

    // Método para verificar si podemos colocar una reina en (fila, columna)
    public static boolean esValida(int fila, int columna) {
        return !columnas[columna] && !diagonal1[fila - columna + N - 1] && !diagonal2[fila + columna];
    }

    // Método para imprimir la solución del tablero
    public static void imprimirSolucion(int[] tablero) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (tablero[i] == j) {
                    System.out.print("Q "); // Reina
                } else {
                    System.out.print("- "); // Espacio vacío
                }
            }
            System.out.println();
        }
        System.out.println("\n//******//\n");
    }

    public static void main(String[] args) {
        // Array para almacenar la solución (qué columna está ocupada por una reina en
        // cada fila)
        int[] tablero = new int[N];

        // Inicializar los arreglos para las columnas y diagonales
        for (int i = 0; i < N; i++) {
            columnas[i] = false;
        }
        for (int i = 0; i < 2 * N - 1; i++) {
            diagonal1[i] = false;
            diagonal2[i] = false;
        }

        // Llamar al resolver comenzando desde la primera fila
        resolver(0, tablero);
    }
}
