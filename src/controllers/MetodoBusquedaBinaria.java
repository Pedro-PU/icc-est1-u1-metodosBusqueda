package controllers;
import java.util.Scanner;

import models.Persona;
import views.ShowConsole;
public class MetodoBusquedaBinaria {
    private Persona[] people;
    private ShowConsole pantalla;
    public MetodoBusquedaBinaria(Persona[] personas) {
        this.people = personas;
        this.pantalla = new ShowConsole();
        System.out.println("Clase MBB creada");
        pantalla.showMessage("Metodos de Busqueda Binaria");
    }

    public int findPersonByCode(int code){
        int bajo=0;
        int alto=people.length-1;
        while(bajo<=alto){
            int central= bajo + (alto-bajo)/2;
            //int central= (bajo-alto)/2;
            if(code==people[central].getCode()){
                return central;
            }
            if(code>people[central].getCode()){
                bajo = central + 1;
            }else{
                alto = central - 1;
            }
       }
       return -1; 
    }
    
    public void showPersonByCode(){
        int codeToFinde = pantalla.getCode();
        int indexPerson = findPersonByCode(codeToFinde);
        if(indexPerson==-1){
            pantalla.showMessage("No hay persona con ese código");
        }else{
            pantalla.showMessage("Persona con códito "+codeToFinde+" encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }

    private void sortByName(Persona[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getName().compareToIgnoreCase(people[j + 1].getName()) > 0) {
                    Persona temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }

    private int findPersonByName(String name) {
    sortByName(people); // Primero ordenamos por nombre
    int bajo = 0;
    int alto = people.length - 1;

    while (bajo <= alto) {
        int central = (bajo + alto) / 2;
        int comparacion = name.compareToIgnoreCase(people[central].getName());

        if (comparacion == 0) {
            return central;
        }
        if (comparacion > 0) {
            bajo = central + 1;
        } else {
            alto = central - 1;
        }
    }
    return -1;
}

    public void showPersonByName() {
        pantalla.showMessage("Ingrese el nombre de la persona a buscar:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int index = findPersonByName(name);
        if (index == -1) {
            pantalla.showMessage("No se encontró ninguna persona con el nombre '" + name + "'.");
        } else {
          pantalla.showMessage("Persona encontrada:");
            pantalla.showMessage(people[index].toString());
        }
    }
}
