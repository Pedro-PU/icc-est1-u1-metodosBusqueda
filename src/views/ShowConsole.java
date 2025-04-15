package views;

import controllers.MetodoBusqueda;

public class ShowConsole {
    public static void main(String[] args) {
        MetodoBusqueda metodoBusqueda = new MetodoBusqueda();
        int [] arreglo={2,3,4,9,8,6,15,78,89};
        int valorABuscar = 15;
        int posicion = metodoBusqueda.busquedaLineal(arreglo,valorABuscar);

        if (posicion != -1) {
            System.out.println("El valor " + valorABuscar + " se encontró en la posición " + posicion);
        } else {
            System.out.println("El valor " + valorABuscar + " no se encontró en el arreglo.");
        }
    }
}
