public class Moneda {
    private String codigo;
    private String simbolo;
    private double tasaCambio;  // en dolares
    
    Moneda() {
        codigo = "";
        simbolo = "";
        tasaCambio = 0;
    }

    Moneda(String codigo, String simobolo, double tasaCambio) {
        this.codigo = codigo;
        this.simbolo = simobolo;
        this.tasaCambio = tasaCambio;
    }

    // getters
    public String getCodigo() {
        return codigo;
    }
    public String getSimbolo() {
        return simbolo;
    }
    public double getTasaCambio() {
        return tasaCambio;
    }
    // setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    public void setTasaCambio(double tasaCambio) {
        this.tasaCambio = tasaCambio;
    }
}
