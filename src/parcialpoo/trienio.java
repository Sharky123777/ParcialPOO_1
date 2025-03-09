package parcialpoo;

public class trienio {

    String tiempoEnlaEmpresa;
    Double monto;

    public trienio(String tiempoEnlaEmpresa, Double monto) {
        this.tiempoEnlaEmpresa = tiempoEnlaEmpresa;
        this.monto = monto;
    }

    public String getTiempoEnlaEmpresa() {
        return tiempoEnlaEmpresa;
    }

    public void setTiempoEnlaEmpresa(String tiempoEnlaEmpresa) {
        this.tiempoEnlaEmpresa = tiempoEnlaEmpresa;

        if (tiempoEnlaEmpresa == null || tiempoEnlaEmpresa.isEmpty()) {
            throw new IllegalArgumentException("El tiempo en la empresa no puede estar vacío.");
        }
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

}
