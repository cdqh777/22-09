package ejPilaEst;

public class Practica {
    private String fecha;
    private String nombre;
    private double nota;
    
    public Practica(String fecha, String nombre, double nota) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public String getFecha() { return fecha; }
    public String getNombre() { return nombre; }
    public double getNota() { return nota; }
    
    @Override
    public String toString() {
        return "Fecha: " + fecha + ", Nombre: " + nombre + ", Nota: " + nota;
    }
}