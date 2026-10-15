public class NotasEstudiantes {
    public static void main(String[] args) {
        // 4 estudiantes, cada uno con 3 notas
        double[][] notas = {
            {4.5, 3.8, 4.2},
            {3.2, 4.0, 3.5},
            {5.0, 4.8, 4.9},
            {2.9, 3.5, 3.0}
        };

        System.out.println("=== Promedios por Estudiante ===");
        
        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            String estado = (promedio >= 3.5) ? "Aprobado" : "Reprobado";
            System.out.println("Estudiante " + (i + 1) + " → Promedio: " + promedio + " " + estado);
        }
    }
}