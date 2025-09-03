package lineales;

public class Main {
    public static void main(String[] args) {
        // Uso de nodos simples y dobles
        Nodo nodoSimple = new Nodo(1);
        NodoDoble nodoDoble = new NodoDoble(2);
        System.out.println("Nodo simple: " + nodoSimple.getDato());
        System.out.println("Nodo doble: " + nodoDoble.getDato());

        // Lista simple
        Lista m = new Lista();
        m.agrega(14);
        m.agrega(42);
        m.agrega(7);
        m.agrega(99);
        System.out.println("Contenido de la lista simple:");
        System.out.println(m.imprimirLista());

        // Lista doble
        ListaDoble doble = new ListaDoble();
        System.out.println("¿La lista doble está vacía? " + doble.esVacia());
        doble.insertarInicio(10);
        doble.insertarFinal(30);
        doble.insertaEn(1, 20);
        System.out.println("Lista doble: " + doble.imprimir());
        System.out.println("Buscar 20: " + doble.busca(20));
        System.out.println("Elemento en índice 1: " + doble.obtener(1));
        System.out.println("Elimina inicio: " + doble.eliminaInicio());
        System.out.println("Elimina final: " + doble.eliminaFinal());
        doble.insertarInicio(5);
        doble.insertarFinal(40);
        System.out.println("Elimina en índice 1: " + doble.eliminaEn(1));
        System.out.println("Lista después de eliminaciones: " + doble.imprimir());
        doble.invertir();
        System.out.println("Lista doble invertida: " + doble.imprimir());
        System.out.println("¿La lista doble está vacía? " + doble.esVacia());
    }
}
