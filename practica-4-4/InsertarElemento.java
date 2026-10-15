public class InsertarElemento {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 50};
        int valorNuevo = 40;
        int posicionInsertar = 3; // Después del 30, antes del 50

        System.out.println("Arreglo original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        // Crear arreglo más grande
        int[] nuevoArreglo = new int[numeros.length + 1];

        // Copiar manteniendo la posición para el nuevo valor
        for (int i = 0, j = 0; i < numeros.length; i++, j++) {
            if (j == posicionInsertar) {
                nuevoArreglo[j] = valorNuevo;
                j++;
            }
            nuevoArreglo[j] = numeros[i];
        }

        System.out.println("\n\nArreglo con el nuevo valor:");
        for (int num : nuevoArreglo) {
            System.out.print(num + " ");
        }
    }
}