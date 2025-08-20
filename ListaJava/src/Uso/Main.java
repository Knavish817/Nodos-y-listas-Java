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

        // Imprimir lista inicial
        System.out.println("Contenido de la lista:");
        System.out.println(m.imprimirLista());

        // Eliminar un dato que no está en la lista
        m.elimina(20);
        System.out.println("Después de intentar eliminar 20: " + m.imprimirLista());

        // Eliminar un dato que sí está en la lista
        m.elimina(42);
        System.out.println("Después de eliminar 42: " + m.imprimirLista());

        // Eliminar el primer nodo (14)
        m.elimina(14);
        System.out.println("Después de eliminar 14 (inicio): " + m.imprimirLista());

        Nodo encontrado = m.buscar(7);
        if (encontrado != null) {
            System.out.println("Elemento encontrado: " + encontrado.getDato());
        } else {
            System.out.println("Elemento no encontrado.");
        }

    }
}
