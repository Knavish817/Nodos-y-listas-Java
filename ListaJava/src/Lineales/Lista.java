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

    // Método para eliminar el primer nodo con el dato dado
    public boolean elimina(int dato) {
        if (principio == null) {
            return false; // lista vacía
        }

        // Si el dato está en el primer nodo
        if (principio.getDato() == dato) {
            principio = principio.getSiguiente();
            return true;
        }

        // Recorremos para buscar el nodo previo al que queremos eliminar
        Nodo actual = principio;
        while (actual.getSiguiente() != null && actual.getSiguiente().getDato() != dato) {
            actual = actual.getSiguiente();
        }

        // Si lo encontramos
        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            return true;
        }

        return false; // No se encontró el dato
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

    // Método para buscar un nodo con un valor dado
    public lineales.Nodo buscar(int dato) {
        lineales.Nodo aux = principio; // nodo auxiliar que empieza en el principio

        while (aux != null) {
            if (aux.getDato() == dato) {
                return aux; // se encontró el nodo
            }
            aux = aux.getSiguiente(); // avanzar al siguiente
        }

        return null; // si no se encontró
    }
}
