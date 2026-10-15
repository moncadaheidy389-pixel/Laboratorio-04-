public class ContarDuplicados {
    public static void main(String[] args) {
        int[] numeros = {2, 5, 8, 2, 9, 5, 1, 8, 2, 7};
        System.out.println("Arreglo:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        
        System.out.println("\n\nFrecuencia de cada valor:");
        
        // Revisar cada número
        for (int i = 0; i < numeros.length; i++) {
            boolean yaContado = false;
            
            // Verificar si ya contamos este número antes
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    yaContado = true;
                    break;
                }
            }
            
            if (!yaContado) {
                int contador = 0;
                for (int k = 0; k < numeros.length; k++) {
                    if (numeros[k] == numeros[i]) {
                        contador++;
                    }
                }
                System.out.println("Valor " + numeros[i] + " → aparece " + contador + " veces");
            }
        }
    }
}