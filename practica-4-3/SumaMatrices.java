public class SumaMatrices {
    public static void main(String[] args) {
        int[][] matrizA = {
            {5, 2},
            {3, 4}
        };
        
        int[][] matrizB = {
            {1, 6},
            {2, 8}
        };
        
        int[][] resultado = new int[2][2];
        
        // Sumar las matrices
        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int col = 0; col < matrizA[fila].length; col++) {
                resultado[fila][col] = matrizA[fila][col] + matrizB[fila][col];
            }
        }
        
        // Mostrar matriz A
        System.out.println("Matriz A:");
        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int col = 0; col < matrizA[fila].length; col++) {
                System.out.print(matrizA[fila][col] + " ");
            }
            System.out.println();
        }
        
        // Mostrar matriz B
        System.out.println("\nMatriz B:");
        for (int fila = 0; fila < matrizB.length; fila++) {
            for (int col = 0; col < matrizB[fila].length; col++) {
                System.out.print(matrizB[fila][col] + " ");
            }
            System.out.println();
        }
        
        // Mostrar resultado
        System.out.println("\nResultado A + B:");
        for (int fila = 0; fila < resultado.length; fila++) {
            for (int col = 0; col < resultado[fila].length; col++) {
                System.out.print(resultado[fila][col] + " ");
            }
            System.out.println();
        }
    }
}