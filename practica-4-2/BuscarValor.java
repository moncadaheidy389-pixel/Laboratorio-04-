public class BuscarValor {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 8, 21, 15, 9, 18};
        int valorBuscado = 15;
        int posicion = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorBuscado) {
                posicion = i;
                break; // Detener al encontrarlo
            }
        }

        if (posicion != -1) {
            System.out.println("El valor " + valorBuscado + " está en la posición: " + posicion);
        } else {
            System.out.println("El valor " + valorBuscado + " NO se encontró");
        }
    }
}