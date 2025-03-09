/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialpoo;

/**
 *
 * @author gameV
 */
public class deduccionFija extends deduccion {
    private double porcentaje;

    public deduccionFija(String nombre, double porcentaje) {
        super(nombre);
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularMonto(double salarioBruto) {
        return salarioBruto * (porcentaje / 100);
    }
}
