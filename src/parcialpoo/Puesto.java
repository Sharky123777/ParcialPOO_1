package parcialpoo;

import java.util.ArrayList;
import java.util.List;

public class Puesto {
    private String nombre;
    private List<Complemento> complementos;

    
    public Puesto(String nombre) {
        this.nombre = nombre;
        this.complementos = new ArrayList<>();
    }

  
    public void agregarComplemento(Complemento complemento) {
        if (complemento == null) {
            throw new IllegalArgumentException("El complemento no puede ser nulo.");
        }
        this.complementos.add(complemento);
    }

 
    public double calcularTotalComplementos() {
        double total = 0.0;
        for (Complemento complemento : complementos) {
            total += complemento.getMonto();
        }
        return total;
    }

   
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