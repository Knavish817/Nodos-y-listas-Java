package lineales;

public class ListaDoble {
    private NodoDoble cabeza;
    private NodoDoble cola;
    private int tam;

    public ListaDoble() {
        cabeza = null;
        cola = null;
        tam = 0;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public void insertarInicio(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (esVacia()) {
            cabeza = cola = nuevo;
        } else {
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        }
        tam++;
    }

    public void insertarFinal(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (esVacia()) {
            cabeza = cola = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
        tam++;
    }

    public void insertaEn(int indice, int dato) {
        if (indice < 0 || indice > tam) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        if (indice == 0) {
            insertarInicio(dato);
        } else if (indice == tam) {
            insertarFinal(dato);
        } else {
            NodoDoble actual = cabeza;
            for (int i = 0; i < indice; i++) {
                actual = actual.getSiguiente();
            }
            NodoDoble anterior = actual.getAnterior();
            NodoDoble nuevo = new NodoDoble(dato);
            nuevo.setSiguiente(actual);
            nuevo.setAnterior(anterior);
            anterior.setSiguiente(nuevo);
            actual.setAnterior(nuevo);
            tam++;
        }
    }

    public int eliminaInicio() {
        if (esVacia()) {
            throw new IllegalStateException("Lista vacia");
        }
        int dato = cabeza.getDato();
        cabeza = cabeza.getSiguiente();
        if (cabeza != null) {
            cabeza.setAnterior(null);
        } else {
            cola = null;
        }
        tam--;
        return dato;
    }

    public int eliminaFinal() {
        if (esVacia()) {
            throw new IllegalStateException("Lista vacia");
        }
        int dato = cola.getDato();
        cola = cola.getAnterior();
        if (cola != null) {
            cola.setSiguiente(null);
        } else {
            cabeza = null;
        }
        tam--;
        return dato;
    }

    public int eliminaEn(int indice) {
        if (indice < 0 || indice >= tam) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        if (indice == 0) {
            return eliminaInicio();
        }
        if (indice == tam - 1) {
            return eliminaFinal();
        }
        NodoDoble actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }
        NodoDoble anterior = actual.getAnterior();
        NodoDoble siguiente = actual.getSiguiente();
        anterior.setSiguiente(siguiente);
        siguiente.setAnterior(anterior);
        tam--;
        return actual.getDato();
    }

    public boolean busca(int dato) {
        NodoDoble actual = cabeza;
        while (actual != null) {
            if (actual.getDato() == dato) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public int obtener(int indice) {
        if (indice < 0 || indice >= tam) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        NodoDoble actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getDato();
    }

    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        NodoDoble aux = cabeza;
        while (aux != null) {
            sb.append(aux.getDato());
            if (aux.getSiguiente() != null) {
                sb.append(", ");
            }
            aux = aux.getSiguiente();
        }
        return sb.toString();
    }

    public void invertir() {
        NodoDoble actual = cabeza;
        NodoDoble temp = null;
        NodoDoble viejaCabeza = cabeza;
        while (actual != null) {
            temp = actual.getAnterior();
            actual.setAnterior(actual.getSiguiente());
            actual.setSiguiente(temp);
            actual = actual.getAnterior();
        }
        if (temp != null) {
            cabeza = temp.getAnterior();
        }
        cola = viejaCabeza;
    }
}
