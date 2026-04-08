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

        // set
        System.out.println("Modificando datos del libro...");

        l1.setTitulo("El principito");
        l1.setAutor("Antoine de Saint-Exupéry");
        l1.setCategoria("Fábula");
        l1.setAnio(1943);
        l1.setCantidadEjemplares(10);

        System.out.println("Libro 1 modificado: " + l1.mostrarInformacion());
    }
}