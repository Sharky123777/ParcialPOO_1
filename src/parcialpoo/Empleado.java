package parcialpoo;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String cuentaBancaria;
    private List<Contrato> contratos;
    private List<trienio> trienios;
    private double limiteTrienios = 10000.0;

    public Empleado(String dni, String nombre, String apellidos, String telefono, String direccion, String cuentaBancaria) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cuentaBancaria = cuentaBancaria;
        this.contratos = new ArrayList<>();
        this.trienios = new ArrayList<>();
    }

    
    public double getSueldoTotal() {
        double sueldoTotal = 0.0;
        for (Contrato contrato : getContratosActivos()) {
            sueldoTotal += contrato.getSueldoTotal();
        }
        return sueldoTotal;
    }

   
    public void agregarTrienio(trienio trienio) {
        if (calcularTotalTrienios() + trienio.getMonto() > limiteTrienios) {
            throw new IllegalArgumentException("No se pueden agregar más trienios. Límite alcanzado.");
        }
        this.trienios.add(trienio);
    }

   
    
    public double calcularTotalTrienios() {
        double total = 0.0;
        for (trienio trienio : trienios) {
            total += trienio.getMonto();
        }
        return total;
    }

  
    public List<Contrato> getContratosActivos() {
        List<Contrato> activos = new ArrayList<>();
        for (Contrato contrato : contratos) {
            if (contrato.estaActivo()) {
                activos.add(contrato);
            }
        }
        return activos;
    }

  
    public void agregarContrato(Contrato contrato) {
        if (contrato == null) {
            throw new IllegalArgumentException("El contrato no puede ser nulo.");
        }
        this.contratos.add(contrato);
    }

  
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
}