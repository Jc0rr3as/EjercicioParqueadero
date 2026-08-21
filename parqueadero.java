public class parqueadero {
    private String placa;
    private String propietario;
    private String tipoVehiculo;
    private String plan;
    private double valorPlan;
    private double descuento;
    private double valorTotal;
    
    public parqueadero(String placa, String propietario, String tipoVehiculo, String plan, double valorPlan, double descuento) {
        this.placa = placa;
        this.propietario = propietario;
        this.tipoVehiculo = tipoVehiculo;
        this.plan = plan;
        this.valorPlan = valorPlan;
        this.descuento = descuento;
        calcularValorTotal();
    }
    public String getPlaca() {
        return placa;
    }
    public String getPropietario() {
        return propietario;
    }
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
    public String getPlan() {
        return plan;
    }
    public double getValorPlan() {
        return valorPlan;
    }
    public double getDescuento() {
        return descuento;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void calcularValorTotal() {
        valorTotal = valorPlan - (valorPlan * descuento / 100);
    }
}