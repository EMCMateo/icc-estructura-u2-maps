import controllers.Mapa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("MATEO EDUARDO MOLINA CHAMBA");
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencilloss
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {

    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
        
    }

    private static void runEjerccios() {


    }
}
