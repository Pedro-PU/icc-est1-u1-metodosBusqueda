import controllers.MetodoBusqueda;
import java.util.Scanner;
import models.Persona;
import views.ShowConsole;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        Persona[] personas = new Persona[7];
        personas[0] = new Persona( 101, "Juan");
        personas[1] = new Persona( 102, "María");
        personas[3] = new Persona( 103, "Carlos");
        personas[4] = new Persona( 104, "Ana");
        personas[5] = new Persona( 105, "Luis");
        personas[6] = new Persona( 106, "Sofia");
        personas[7] = new Persona( 107, "Pedro");
        MetodoBusqueda metodoBusqueda = new MetodoBusqueda(personas);
        ShowConsole showConsole = new ShowConsole();
        showConsole.metodoBusqueda1();

    }
}
