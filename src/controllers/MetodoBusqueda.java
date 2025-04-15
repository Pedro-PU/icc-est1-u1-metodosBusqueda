package controllers;

public class MetodoBusqueda {

    int [] arreglo={2,3,4,9,8,6,15,78,89};

    public int busquedaLineal(int arreglo[], int valor) {
        int pos = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (valor == arreglo[i]) {
                pos = i;
                break;
            }
        }
        return pos;
    }
}
