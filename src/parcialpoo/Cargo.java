package parcialpoo;

import java.util.ArrayList;
import java.util.List;

public class Cargo {
    private String nombre;
    private List<Complemento> complementos;

    public Cargo(String nombre) {
        this.nombre = nombre;
        this.complementos = new ArrayList<>();
    }

    // Método para agregar un complemento al cargo
    public void agregarComplemento(Complemento complemento) {
        if (complemento == null) {
            throw new IllegalArgumentException("El complemento no puede ser nulo.");
        }
        this.complementos.add(complemento);
    }

    // Método para calcular el total de complementos asociados al cargo
    public double calcularTotalComplementos() {
        double total = 0.0;
        for (Complemento complemento : complementos) {
            total += complemento.getMonto();
        }
        return total;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Complemento> getComplementos() {
        return complementos;
    }

    public void setComplementos(List<Complemento> complementos) {
        this.complementos = complementos;
    }
}