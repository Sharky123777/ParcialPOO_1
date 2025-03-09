package parcialpoo;

import java.util.Date;
import java.util.List;

public class Nomina {

    private double salarioBruto;       // Salario base + complementos
    private double salarioNeto;       // Salario bruto - deducciones
    private double trienios;          // Monto de trienios
    private double complementos;      // Monto de complementos
    private double deducciones;       // Total de deducciones
    private List<deduccion> listaDeducciones; // Lista de deducciones aplicadas
    private Date fechaEmision; // Fecha de emisión de la nómina

    public Nomina(double salarioBruto, double trienios, double complementos, List<deduccion> listaDeducciones) {
        this.salarioBruto = salarioBruto;
        this.trienios = trienios;
        this.complementos = complementos;
        this.listaDeducciones = listaDeducciones;
        this.deducciones = calcularTotalDeducciones();
        this.salarioNeto = salarioBruto + trienios + complementos - deducciones;
        this.fechaEmision = new Date();
    }

   
    public double calcularTotalDeducciones() {
        double total = 0.0;
        for (deduccion deduccion : listaDeducciones) {
            total += deduccion.calcularMonto(salarioBruto);
        }
        return total;
    }

   
    public void mostrarDetalles() {
        System.out.println("=== Detalles de la Nómina ===");
        System.out.println("Fecha de emisión: " + fechaEmision);
        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Trienios: " + trienios);
        System.out.println("Complementos: " + complementos);
        System.out.println("Deducciones: " + deducciones);
        System.out.println("Salario Neto: " + salarioNeto);
        System.out.println("============================");
    }

    
    public Date getFechaEmision() {
        return fechaEmision;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public double getTrienios() {
        return trienios;
    }

    public void setTrienios(double trienios) {
        this.trienios = trienios;
    }

    public double getComplementos() {
        return complementos;
    }

    public void setComplementos(double complementos) {
        this.complementos = complementos;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    public List<deduccion> getListaDeducciones() {
        return listaDeducciones;
    }

    public void setListaDeducciones(List<deduccion> listaDeducciones) {
        this.listaDeducciones = listaDeducciones;
    }
}
