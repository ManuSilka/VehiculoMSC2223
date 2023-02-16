package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {

    public static void main(String[] args) {
        VehiculoSilvestreCaleroManuel2223 miVehiculoSilvestreCaleroManuel2223;
        int stockActual;

        miVehiculoSilvestreCaleroManuel2223 = new VehiculoSilvestreCaleroManuel2223("Seat", 18000, 100);
        operativaVehiculosSilvestreCaleroManuel2223(miVehiculoSilvestreCaleroManuel2223, 50);
        stockActual = miVehiculoSilvestreCaleroManuel2223.obtenerStock();
        System.out.println("El stock actual es" + stockActual);
    }

    private static void operativaVehiculosSilvestreCaleroManuel2223(VehiculoSilvestreCaleroManuel2223 miVehiculoSilvestreCaleroManuel2223, int cantidad) {
        try {
            System.out.println("Venta de Vehiculos");
            miVehiculoSilvestreCaleroManuel2223.vender(20);
        } catch (Exception e) {
            System.out.print("Fallo al vender");
        }

        try {
            System.out.println("Compra de Vehiculos");
            miVehiculoSilvestreCaleroManuel2223.comprar(100);
        } catch (Exception e) {
            System.out.print("Fallo al comprar");
        }
    }

}
