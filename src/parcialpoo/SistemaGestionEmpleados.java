package parcialpoo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaGestionEmpleados {

    private List<Nomina> nominas;

    public SistemaGestionEmpleados() {
        this.nominas = new ArrayList<>();
    }

    public void almacenarNomina(Nomina nomina) {
        if (nomina == null) {
            throw new IllegalArgumentException("La nómina no puede ser nula.");
        }
        this.nominas.add(nomina);
    }

    
    public void eliminarNominasAntiguas() {
        Date fechaActual = new Date();
        long tiempoRetencion = 365L * 24 * 60 * 60 * 1000; // 1 año en milisegundos
        nominas.removeIf(nomina -> fechaActual.getTime() - nomina.getFechaEmision().getTime() > tiempoRetencion);
    }

   
    public List<Nomina> getNominas() {
        return nominas;
    }

    
    public void mostrarNominas() {
        System.out.println("=== Nóminas almacenadas ===");
        for (Nomina nomina : nominas) {
            nomina.mostrarDetalles();
        }
    }
}
