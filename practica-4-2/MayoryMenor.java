public class MayoryMenor {
    public static void main(String[] args) {
        int[] edades = {18, 25, 42, 17, 33, 55, 21, 19};
        
        int mayor = edades[0];
        int menor = edades[0];
        int posicionMayor = 0;
        int posicionMenor = 0;
        
        for (int i = 1; i < edades.length; i++) {
            if (edades[i] > mayor) {
                mayor = edades[i];
                posicionMayor = i;
            }
            if (edades[i] < menor) {
                menor = edades[i];
                posicionMenor = i;
            }
        }
        
        System.out.println("Edades:");
        for (int i = 0; i < edades.length; i++) {
            System.out.print(edades[i] + " ");
        }
        
        System.out.println("\n\nValor mayor: " + mayor + " (posición " + posicionMayor + ")");
        System.out.println("Valor menor: " + menor + " (posición " + posicionMenor + ")");
    }
}