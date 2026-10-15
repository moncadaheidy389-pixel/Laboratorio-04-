public class InvertirArreglo {
    public static void main(String[] args) {
        String[] frutas = {"Manzana", "Banano", "Naranja", "Uva", "Pera"};
        
        System.out.println("Orden original:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println((i + 1) + ". " + frutas[i]);
        }
        
        System.out.println("\nOrden inverso:");
        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println((frutas.length - i) + ". " + frutas[i]);
        }
    }
}