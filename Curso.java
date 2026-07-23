public class Curso {
    private String clave;
    private String nombre;
    private String docente;
    private int cupoMaximo;
    private int numeroInscritos;

    public Curso(String clave, String nombre, String docente, int cupoMaximo) {
        this.clave = clave;
        this.nombre = nombre;
        this.docente = docente;
        this.cupoMaximo = cupoMaximo;
        this.numeroInscritos = 0;
    }

    public String getClave() { return clave; }
    public String getNombre() { return nombre; }
    public String getDocente() { return docente; }
    public int getCupoMaximo() { return cupoMaximo; }
    public int getNumeroInscritos() { return numeroInscritos; }

    public void setNumeroInscritos(int numeroInscritos) {
        this.numeroInscritos = numeroInscritos;
    }

    @Override
    public String toString() {
        return "Clave: " + clave + " | Curso: " + nombre + " | Docente: " + docente
                + " | Alumnos: " + numeroInscritos + "/" + cupoMaximo;
    }
}
