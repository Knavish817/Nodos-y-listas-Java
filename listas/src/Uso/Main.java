package lineales;

public class Main {
    public static void main(String[] args) {
        // Crear la lista
        Lista m = new Lista();

        // Agregar elementos
        m.agrega(14);
        m.agrega(42);
        m.agrega(7);
        m.agrega(99);

        // Imprimir lista
        System.out.println("Contenido de la lista:");
        System.out.println(m.imprimirLista());
    }
}

