public class EliminarElemento {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int posicionEliminar = 2; // Eliminar el valor 30
        
        System.out.println("Arreglo original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        
        // Crear arreglo nuevo con un espacio menos
        int[] nuevoArreglo = new int[numeros.length - 1];
        
        // Copiar todo excepto la posición que se elimina
        int indiceNuevo = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i != posicionEliminar) {
                nuevoArreglo[indiceNuevo] = numeros[i];
                indiceNuevo++;
            }
        }
        
        System.out.println("\n\nArreglo después de eliminar:");
        for (int num : nuevoArreglo) {
            System.out.print(num + " ");
        }
    }
}