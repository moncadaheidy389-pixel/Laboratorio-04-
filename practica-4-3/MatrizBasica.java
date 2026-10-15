public class MatrizBasica {
    public static void main(String[] args) {
        // Matriz de 3 filas y 3 columnas
        int[][] numeros = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Valor fila 1, columna 2: " + numeros[0][1]);
        System.out.println("Valor fila 3, columna 3: " + numeros[2][2]);

        System.out.println("\nToda la matriz:");
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int col = 0; col < numeros[fila].length; col++) {
                System.out.print(numeros[fila][col] + " ");
            }
            System.out.println();
        }
    }
}