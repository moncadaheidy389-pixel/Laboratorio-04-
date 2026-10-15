public class CopiarArreglo {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] copia = new int[original.length];

        // Copiar elemento por elemento
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }

        // Modificar la copia para demostrar que es independiente
        copia[0] = 999;

        System.out.println("Arreglo original:");
        for (int valor : original) {
            System.out.print(valor + " ");
        }

        System.out.println("\n\nArreglo copiado (con cambio):");
        for (int valor : copia) {
            System.out.print(valor + " ");
        }
    }
}