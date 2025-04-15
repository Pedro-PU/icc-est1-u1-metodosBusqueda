package controllers;
import views.ShowConsole;
import models.Persona;

public class MetodoBusqueda {

    private ShowConsole showConsole;
    private Persona[] people;

    
    

    public MetodoBusqueda() {
    }

    public MetodoBusqueda(Persona[] persons){
        showConsole = new ShowConsole();
        this.people = persons;
        showPersonByCode();
    }

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

    public int findPersonByCode(int code){
        for (int i = 0; i < people.length; i++) {
            if(people[i].getCode() == code){
                return i;
            }
        }
        return -1;
    }

    public void showPersonByCode(){
        int codeToFinde = showConsole.getCode();
        int indexPerson = findPersonByCode(codeToFinde);
        if(indexPerson>=0){
            showConsole.showMessage("Persona encontrada");
            showConsole.showMessage("La persona "+people[indexPerson]+" de la posición "+indexPerson);
        }else{
            showConsole.showMessage("Persona con códito "+codeToFinde+" no encontrada");
        }
    }

}
