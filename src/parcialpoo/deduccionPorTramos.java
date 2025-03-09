package parcialpoo;

import java.util.List;

public class deduccionPorTramos extends deduccion {
    private List<Tramo> tramos; // Lista de tramos para calcular la deducción

    public deduccionPorTramos(String nombre, List<Tramo> tramos) {
        super(nombre); 
        this.tramos = tramos;
    }

    @Override
    public double calcularMonto(double salarioBruto) {
        double montoTotal = 0.0;
        for (Tramo tramo : tramos) {
            if (salarioBruto > tramo.getLimiteInferior()) {
                double baseCalculo = Math.min(salarioBruto, tramo.getLimiteSuperior()) - tramo.getLimiteInferior();
                montoTotal += baseCalculo * (tramo.getPorcentaje() / 100);
            }
        }
        return montoTotal;
    }
}