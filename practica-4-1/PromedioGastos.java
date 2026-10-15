public class PromedioGastos {
    public static void main(String[] args) {
        double[] gastos = {30000, 45000, 20000, 10000};
        
        double suma = 0;
        int mayores = 0;
        
        for (int i = 0; i < gastos.length; i++) {
            suma += gastos[i];
            if (gastos[i] > 25000) {
                mayores++;
            }
        }
        
        System.out.println("Total de gastos: $" + suma);
        System.out.println("Cantidad de gastos: " + gastos.length);
        System.out.println("Promedio: $" + (suma / gastos.length));
        System.out.println("Gastos mayores a $25000: " + mayores);
    }
}