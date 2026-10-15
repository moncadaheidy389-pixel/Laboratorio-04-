public class DiagonalPrincipal {
    public static void main(String[] args) {
        int[][] matriz = {
            {10,  2,  5},
            { 3, 20,  7},
            { 4,  6, 30}
        };

        System.out.println("Matriz completa:");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.printf("%4d", matriz[fila][col]);
            }
            System.out.println();
        }

        System.out.println("\nElementos de la diagonal principal:");
        int sumaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            int valor = matriz[i][i]; // fila = columna → diagonal principal
            System.out.println("Posición [" + i + "][" + i + "] = " + valor);
            sumaDiagonal += valor;
        }

        System.out.println("\nSuma total de la diagonal: " + sumaDiagonal);
    }
}