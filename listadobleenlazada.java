public class listadobleenlazada {

    NodoDoble cabeza;

    public void agregarInicio(String dato) {
        NodoDoble nuevo = new NodoDoble(dato);

        if (cabeza != null) {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }

        cabeza = nuevo;
    }

    public void agregarFinal(String dato) {
        NodoDoble nuevo = new NodoDoble(dato);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        NodoDoble actual = cabeza;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevo;
        nuevo.anterior = actual;
    }

    public void mostrar() {
        NodoDoble actual = cabeza;

        if (actual == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }

        System.out.println("NULL");
    }

    public boolean buscar(String dato) {
        NodoDoble actual = cabeza;

        while (actual != null) {
            if (actual.dato.equals(dato)) {
                return true;
            }
            actual = actual.siguiente;
        }

        return false;
    }

    public boolean actualizar(String viejo, String nuevoDato) {
        NodoDoble actual = cabeza;

        while (actual != null) {
            if (actual.dato.equals(viejo)) {
                actual.dato = nuevoDato;
                return true;
            }
            actual = actual.siguiente;
        }

       return false;
    }

    public boolean eliminar(String dato) {

        if (cabeza == null) {
            return false;
        }

        if (cabeza.dato.equals(dato)) {
            cabeza = cabeza.siguiente;

            if (cabeza != null) {
                cabeza.anterior = null;
            }

            return true;
        }

        NodoDoble actual = cabeza;

        while (actual != null && !actual.dato.equals(dato)) {
            actual = actual.siguiente;
        }

        if (actual == null) {
            return false;
        }

        if (actual.siguiente != null) {
            actual.siguiente.anterior = actual.anterior;
        }

        actual.anterior.siguiente = actual.siguiente;

        return true;
    }
}