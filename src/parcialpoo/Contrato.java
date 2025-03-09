package parcialpoo;

import java.util.Date;

public class Contrato {
    private Date fechaAlta;
    private Date fechaBaja; // null si el contrato es indefinido
    private Categoria categoria;
    private Puesto puesto;

    public Contrato(Date fechaAlta, Categoria categoria, Puesto puesto) {
        this.fechaAlta = fechaAlta;
        this.categoria = categoria;
        this.puesto = puesto;
    }

   
    public double getSueldoBase() {
        return this.categoria.getSueldoBase();
    }

    
    public double getComplementoSalarial() {
        return this.puesto.calcularTotalComplementos();
    }

    
    public double getSueldoTotal() {
        return this.getSueldoBase() + this.getComplementoSalarial();
    }

    public boolean estaActivo() {
        return this.fechaBaja == null; 
    }

    
    public void darDeBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    
    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
}