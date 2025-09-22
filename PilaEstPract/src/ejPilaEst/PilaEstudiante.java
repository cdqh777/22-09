package ejPilaEst;

import java.util.ArrayList;
import java.util.List;

public class PilaEstudiante {
    private String cc;
    private List<Practica> practicas;
    
    public PilaEstudiante(String cc) {
        this.cc = cc;
        this.practicas = new ArrayList<>();
    }
    
    public void agregarPractica(String fecha, String nombre, double nota) {
        practicas.add(new Practica(fecha, nombre, nota));
    }
    
    public int cantidadPracticas() {
        return practicas.size();
    }
    
    public void mostrarPracticas() {
        System.out.println("Prácticas del estudiante " + cc + ":");
        for (Practica practica : practicas) {
            System.out.println(practica);
        }
    }
    
    public List<Practica> obtenerPracticas() {
        return new ArrayList<>(practicas); // Retorna copia para evitar modificación directa
    }
    
    public void agregarPracticas(List<Practica> nuevasPracticas) {
        practicas.addAll(nuevasPracticas);
    }
    
    public double notaMasAlta() {
        if (practicas.isEmpty()) {
            return 0;
        }
        double maxNota = practicas.get(0).getNota();
        for (Practica practica : practicas) {
            if (practica.getNota() > maxNota) {
                maxNota = practica.getNota();
            }
        }
        return maxNota;
    }
    
    public String getCc() {
        return cc;
    }
    
    public void limpiarPracticas() {
        practicas.clear();
    }
}