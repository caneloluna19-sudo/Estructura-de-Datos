
//codigo Alberto

public class ListaEnlazada {
    Nodo cabeza;

    public void agregarNodoInicio(String datoNodo){
        Nodo nuevo = new Nodo(datoNodo);
        nuevo.siguienteNodo = cabeza;
        cabeza = nuevo;
    }

    public void recorrido(){
        Nodo actual = cabeza;
        while (actual != null){
            System.out.println(actual.dato);
            actual = actual.siguienteNodo;
        }
    }

    public void agregarFinal(String datoNodo){
        Nodo nuevo = new Nodo(datoNodo);
        if (cabeza == null){
            cabeza = nuevo;
            return;
        }
        Nodo actual = cabeza;
        while(actual.siguienteNodo != null){
            actual = actual.siguienteNodo;
        }
        actual.siguienteNodo = nuevo;
    }

    public boolean eliminarNodo(String datoEliminar){
        if (cabeza == null){
            return false;
        }
        
        // Si el nodo a eliminar es la cabeza
        if (cabeza.dato.equals(datoEliminar)) {
            cabeza = cabeza.siguienteNodo;
            return true;
        }

        Nodo actual = cabeza;
        while (actual.siguienteNodo != null){
            if(actual.siguienteNodo.dato.equals(datoEliminar)){
                actual.siguienteNodo = actual.siguienteNodo.siguienteNodo;
                return true;
            }
            actual = actual.siguienteNodo;
        }
        return false;
    }

    // Devuelve true si encuentra el nodo
    public boolean buscarNodo(String datoBuscar) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(datoBuscar)) {
                return true; 
            }
            actual = actual.siguienteNodo;
        }
        return false; 
    }

    // Devuelve true si encuentra y actualiza el nodo
    public boolean actualizarNodo(String datoBuscar, String nuevoDato) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(datoBuscar)) {
                actual.dato = nuevoDato;
                return true; 
            }
            actual = actual.siguienteNodo;
        }
        return false; 
    }
}