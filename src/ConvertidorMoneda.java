public class ConvertidorMoneda {
    public double convertir(double cantidad, Moneda monedaOrigen, Moneda monedaDestino) {
        double cantidadEnDolares = cantidad / monedaOrigen.getTasaCambio();
        double cantidadEnMonedaDestino = cantidadEnDolares * monedaDestino.getTasaCambio();
        return cantidadEnMonedaDestino;
    }
}