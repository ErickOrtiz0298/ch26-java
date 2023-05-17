package org.generation;

import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args){
        /*
        * Ciclo While
        * Mientras la condicion sea verdadera, se  realiza un nuevo ciclo
        *
        * Sintaxis:
        *
        *   while(condicion) instruccion;
        *
        *   while(condicion){
        *       instrucciones;
        * }
        *
        *
        *
        * */
        Scanner sc = new Scanner(System.in);
        boolean active =true;
        while(active){
            System.out.println("Bienvenido Alexis");
            System.out.println("Quieres seguir activo?");
            char response = sc.nextLine().toLowerCase().charAt(0);
            if(response != 's') active = false; //break
        }
        System.out.println("Gracias por tu visita");


        do{
            System.out.println("Bienvenida Patito");
            System.out.println("Quires seguir activa(s/n)?");
            char response = sc.nextLine().toLowerCase().charAt(0);
            if(response == 's') active = true;
            else active = false; //break;
        }while (active);
        System.out.println("Gracias por tu visita");

        while(sc.nextLine().toLowerCase().charAt(0) == 's');
        System.out.println("Adios");
        sc.close();

    }
}
