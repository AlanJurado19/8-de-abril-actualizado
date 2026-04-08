public class Principal {
    public static void main(String[] args) {
        Libro l1 = new Libro(3, "Carlo Collodi", "Cuento", "Pinocho", 1881);
        Libro l2 = new Libro();

        System.out.println("Libro 1: " + l1.mostrarInformacion());
        System.out.println();

        if (l1.prestar() < 0) {
            System.out.println("No hay ejemplares");
        } else {
            System.out.println("Ejemplar prestado");
        }

        System.out.println("Prestando libro...");

        if (l1.prestar() < 0) {
            System.out.println("No hay ejemplares");
        } else {
            System.out.println("Ejemplar prestado");
        }

        System.out.println("Libro 1: " + l1.mostrarInformacion());
        System.out.println("Libro 2: " + l2.mostrarInformacion());

        l1.setTitulo("El principito");
        System.out.println("Libro 1: " + l1.mostrarInformacion());
    }
}