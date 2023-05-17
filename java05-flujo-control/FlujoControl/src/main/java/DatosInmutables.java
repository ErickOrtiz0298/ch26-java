import java.util.Scanner;

public class DatosInmutables {
    public static void main(String[] args) {
        //Dato inmutable: No se puede modificar.
        int nCuentaBancaria = 678;
        nCuentaBancaria = 999;

        String nombre = "Alex";
        String participante = "Sofi";
        nombre = "Alexis";
        //participante = "Alex";
        participante = new String("Alex");

         //Comparamos referencias!!! El operador == nos compara la referencia en los objetos
        //para comparar el contenido en los Strings, se debe usar el método equals()

        if(participante == "Alex"){
            System.out.println("Los nombres concuerdan");
        }else{
            System.out.println("Los nombres son diferentes");
        }

        if(participante.equals("Alex") ){
            System.out.println("Los nombres concuerdan");
        }else{
            System.out.println("Los nombres son diferentes");
        }
// ------------------------------------------------------------------
        //Clase Scanner
        Scanner myScan; //Scanner sc;
        myScan = new Scanner(System.in);
  /*

        System.out.print("Escribe tu nombre: ");
        String myName = myScan.nextLine();//leer hasta /n salto de linea
        System.out.println("Tu nombre es: " + myName);
        System.out.print("Escribe tu apellido: ");
        String myLastname = myScan.next();
        System.out.println("Tu apellido es: " + myLastname);*/

        System.out.print("Escribe tu edad:");
        //String ageTxt = myScan.nextLine();
        //int age = Integer.parseInt(ageTxt);
        if(myScan.hasNextInt()){
            int age = myScan.nextInt(); //Leer un numero entero
            System.out.println("Tu edad es: " + age);
            System.out.println("Pronto cumpliras: " + (age+1));
            myScan.close(); //cerramos la referencia
        }else{
            System.out.println("Lo siento, no escribiste un numero");
        }

    }
}
