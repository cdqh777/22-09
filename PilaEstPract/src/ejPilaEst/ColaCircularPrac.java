package ejPilaEst;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColaCircularPrac {
	private Map<String, PilaEstudiante> estudiantes;
    public ColaCircularPrac() {
        this.estudiantes = new HashMap<>();
    }
    
    public void agregarEstudiante(String cc) {
        if (!estudiantes.containsKey(cc)) {
            estudiantes.put(cc, new PilaEstudiante(cc));
        }
    }
    
    public void agregarPractica(String cc, String fecha, String nombre, double nota) {
        if (!estudiantes.containsKey(cc)) {
            agregarEstudiante(cc);
        }
        estudiantes.get(cc).agregarPractica(fecha, nombre, nota);
    }
    
    // a. Cuántas prácticas tiene cada cc
    public Map<String, Integer> practicasPorEstudiante() {
        Map<String, Integer> resultado = new HashMap<>();
        for (PilaEstudiante estudiante : estudiantes.values()) {
            resultado.put(estudiante.getCc(), estudiante.cantidadPracticas());
        }
        return resultado;
    }
    
    // b. Mostrar las prácticas del estudiante x
    public void mostrarPracticasEstudiante(String cc) {
        if (estudiantes.containsKey(cc)) {
            estudiantes.get(cc).mostrarPracticas();
        } else {
            System.out.println("El estudiante " + cc + " no existe");
        }
    }
    
    // c. Llevar las prácticas del estudiante x al estudiante y
    public boolean transferirPracticas(String ccOrigen, String ccDestino) {
        if (!estudiantes.containsKey(ccOrigen)) {
            System.out.println("El estudiante " + ccOrigen + " no existe");
            return false;
        }
        
        if (!estudiantes.containsKey(ccDestino)) {
            agregarEstudiante(ccDestino);
        }
        
        List<Practica> practicasTransferir = estudiantes.get(ccOrigen).obtenerPracticas();
        estudiantes.get(ccDestino).agregarPracticas(practicasTransferir);
        estudiantes.get(ccOrigen).limpiarPracticas();
        
        System.out.println("Prácticas transferidas de " + ccOrigen + " a " + ccDestino);
        return true;
    }
    
    // d. Cuántas prácticas tienen la cc práctica (total de prácticas)
    public int totalPracticas() {
        int total = 0;
        for (PilaEstudiante estudiante : estudiantes.values()) {
            total += estudiante.cantidadPracticas();
        }
        return total;
    }
    
    // e. Mostrar la nota más alta de cada estudiante
    public Map<String, Double> notasMasAltas() {
        Map<String, Double> resultado = new HashMap<>();
        for (PilaEstudiante estudiante : estudiantes.values()) {
            resultado.put(estudiante.getCc(), estudiante.notaMasAlta());
        }
        return resultado;
    }
}

