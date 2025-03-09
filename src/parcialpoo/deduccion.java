package parcialpoo;

public abstract class deduccion {
    private String nombre;

    public deduccion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public abstract double calcularMonto(double salarioBruto);
}