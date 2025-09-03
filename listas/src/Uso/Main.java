package lineales;

public class Main {
    public static void main(String[] args) {
        // Lista simple
        Lista m = new Lista();
        m.agrega(14);
        m.agrega(42);
        m.agrega(7);
        m.agrega(99);
        System.out.println("Contenido de la lista:");
        System.out.println(m.imprimirLista());

        // Lista doble
        ListaDoble doble = new ListaDoble();
        doble.insertarInicio(10);
        doble.insertarFinal(20);
        doble.insertaEn(1, 15);
        System.out.println("Lista doble:");
        System.out.println(doble.imprimir());
        doble.invertir();
        System.out.println("Lista doble invertida:");
        System.out.println(doble.imprimir());
    }
}
