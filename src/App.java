import controllers.MetodoBusqueda;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        MetodoBusqueda metodoBusqueda = new MetodoBusqueda();
        System.out.println("Ingrese el valor a buscar: ");
        int valor = lector.nextInt();
        metodoBusqueda.busquedaLineal(null, valor);

    }
}
