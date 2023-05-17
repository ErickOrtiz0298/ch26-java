package org.generation;

public class Pokemon {
    //atributos de instancia (non-static fields)
    String nombre;
    int alturaCm;
    double peso;
    //atributos de clase (static-fields)
    static String nacimiento = "Oviparos";

    //Metodos constructores
    //Debe tener el mismo nombre de mi Clase
    //los métodos constructores no tienen retorno(return)

    Pokemon(String nombre, int alturaCm, double peso){
        //System.out.println("Has creado un pokemon llamado " + nombre);
        this.nombre = nombre;
        this.alturaCm = alturaCm;
        this.peso = peso;

    }

    //Metodos de instancia
    //Métodos de clase
}
