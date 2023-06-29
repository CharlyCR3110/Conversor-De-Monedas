import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Definir las opciones para la lista desplegable
        String[] opcionesTipoDeMoneda = {"Colones", "Dolares", "Pesos Mexicanos"}; 

        // Preguntar la moneda de origen
        // Crear el componente JComboBox con las opciones
        JComboBox<String> comboBox = new JComboBox<>(opcionesTipoDeMoneda);
        // Mostrar una ventana emergente con la lista desplegable
        JOptionPane.showMessageDialog(null, comboBox, "Selecciona la moneda de origen", JOptionPane.QUESTION_MESSAGE);
        // Obtener la opción seleccionada
        String monedaOrigen = (String) comboBox.getSelectedItem();

        // Obtener la cantidad que se quiere convertir
        String valor = JOptionPane.showInputDialog("Ingresa un valor para convertir");
        // se hace un parse a double
        double cantidadDeDinero = Double.parseDouble(valor);


        // Mostrar una ventana emergente con la lista desplegable
        JOptionPane.showMessageDialog(null, comboBox, "Seleccione la moneda de destino", JOptionPane.QUESTION_MESSAGE);
        // Obtener la opción seleccionada
        String monedaDestino = (String) comboBox.getSelectedItem();

        // se crean los objetos
        Moneda objMonedaOrigen = Utiles.encontrarMoneda(monedaOrigen);
        Moneda objMonedaDestino = Utiles.encontrarMoneda(monedaDestino);

        // clase encargada de convertir las monedas
        ConvertidorMoneda convertidor = new ConvertidorMoneda();

        float cambio = (float) convertidor.convertir(cantidadDeDinero, objMonedaOrigen, objMonedaDestino);

        String mensajeFinal = "Tiene " + objMonedaDestino.getSimbolo() + cambio + " " + monedaDestino;
        JOptionPane.showMessageDialog(null, mensajeFinal);
    }
}