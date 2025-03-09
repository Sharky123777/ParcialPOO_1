package parcialpoo;

public class Tramo {
    private double limiteInferior;
    private double limiteSuperior;
    private double porcentaje;

    public Tramo(double limiteInferior, double limiteSuperior, double porcentaje) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.porcentaje = porcentaje;
    }


    public double getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(double limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public double getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(double limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}