package lineales;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        // Agregar elementos
        lista.agrega(10);
        lista.agrega(20);
        lista.agrega(30);

        System.out.println("Lista inicial: " + lista.imprimirLista());

        // Editar un valor
        if (lista.editar(20, 99)) {
            System.out.println("Se editó correctamente.");
        } else {
            System.out.println("No se encontró el valor a editar.");
        }

        System.out.println("Lista después de editar: " + lista.imprimirLista());

        // Eliminar un valor
        lista.elimina(10);
        System.out.println("Lista después de eliminar 10: " + lista.imprimirLista());
    }
}
