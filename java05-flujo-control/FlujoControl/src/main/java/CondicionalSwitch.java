import java.sql.SQLOutput;
import java.util.Scanner;

public class CondicionalSwitch {
    public static void main(String[] args) {
        /*
        *Sintaxis:
        * switch(expresion){
        *   case valor1: expresion;
        *                break;
        *   case valor2: expresion;
        *                break;
        *
        *   default: expresion;
        *            break;
        * }
        * La expresion a evaluar debe ser un tipo de dato entero, string o enum.
        * La condicional switch usa el metodo equals para comparar los Strings.
        */
        //----------------------------------------------------------------
        /*
        *Leer usando la clase Scanner un mes (1-12), e indicar el mes en texto.
        * */
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor ingresa tu mes de nacimiento: ");
        int mes = sc.nextInt();
        String mesTxt;
        switch (mes){

            case 1:
                mesTxt = "Enero";
                break;
            case 2:
                mesTxt = "Febrero";
                break;
            case 3:
                mesTxt = "Marzo";
                break;
            case 4:
                mesTxt = "Abril";
                break;
            case 5:
                mesTxt = "Mayo";
                break;
            case 6:
                mesTxt = "Junio";
                break;
            case 7:
                mesTxt = "Julio";
                break;
            case 8:
                mesTxt = "Agosto";
                break;
            case 9:
                mesTxt = "Septiembre";
                break;
            case 10:
                mesTxt = "Octubre";
                break;
            case 11:
                mesTxt = "Noviembre";
                break;
            case 12:
                mesTxt = "Diciembre";
                break;

            default:
                mesTxt = "No es un numero";
                break;
        }
        System.out.println("El mes en que naciste fue: " + mesTxt);

    }
}
