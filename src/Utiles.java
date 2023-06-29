public class Utiles {
    public static Moneda encontrarMoneda(String nombre) {
        switch (nombre) 
        {
            case "Colones" :
                return new Moneda("CRC", "₡", 542.92);
            case "Dolares" :
                return new Moneda("USD", "$", 1.0);
            case "Pesos Mexicanos" :
                return new Moneda("MXN", "$", 17.3);
            case "Euros" :
                return new Moneda("EUR", "€", 0.85);
            case "Yenes" :
                return new Moneda("JPY", "¥", 109.9);
        }

        throw new RuntimeException("Error: Ninguna moneda ha sido registrada con ese nombre con ese nombre");
    }
}

// podria devolver directamente un objeto moneda