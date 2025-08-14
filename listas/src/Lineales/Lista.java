package lineales;

public class Lista {
    private Nodo principio;

    // Constructor vacío
    public Lista() {
        principio = null;
    }

    // Constructor con dato inicial
    public Lista(int dato) {
        principio = new Nodo(dato);
    }

    public Nodo getPrincipio() {
        return principio;
    }

    public void setPrincipio(Nodo principio) {
        this.principio = principio;
    }

    // Método para agregar un nodo al final
    public void agrega(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (principio == null) {
            principio = nuevo;
        } else {
            Nodo actual = principio;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    // Método para imprimir lista como cadena
    public String imprimirLista() {
        if (principio == null) {
            return "La lista está vacía.";
        }

        String resultado = "";
        Nodo aux = principio;
        while (aux != null) {
            resultado += aux.getDato();
            if (aux.getSiguiente() != null) {
                resultado += ", ";
            }
            aux = aux.getSiguiente();
        }
        return resultado;
    }
}

