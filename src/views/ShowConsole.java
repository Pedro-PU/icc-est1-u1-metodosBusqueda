package views;
import java.util.Scanner;
import controllers.MetodoBusqueda;

public class ShowConsole {
    private Scanner scanner = new Scanner(System.in);
    MetodoBusqueda metodoBusqueda = new MetodoBusqueda();
    
    public void showMenu(){
        System.out.println("Metodo Búsqueda");
    }

    public int getCode(){
        System.out.println("Ingrese codigo");
        int codigo = scanner.nextInt();
        System.out.println("Codigo ingresado: " + codigo);
        return codigo;
    }

    public void showMessage(String message){
        System.out.println(message);
    }

/*
    public void metodoBusqueda1(){
        int [] arreglo={2,3,4,9,8,6,15,78,89};
        System.out.println("Ingrese el valor a buscar: ");
        int valor = scanner.nextInt();
        metodoBusqueda.busquedaLineal(arreglo, valor);
        int posicion = metodoBusqueda.busquedaLineal(arreglo,valor);

        if (posicion != -1) {
            System.out.println("El valor " + valor + " se encontró en la posición " + posicion);
        } else {
            System.out.println("El valor " + valor + " no se encontró en el arreglo.");
        }
    } */
}
