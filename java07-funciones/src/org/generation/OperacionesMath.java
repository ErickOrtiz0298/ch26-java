package org.generation;

import java.util.Date;

public class OperacionesMath {
        void sumaEnterosSinRetorno(int a,int b)
        {
            Date date = new Date();//instanciando un objeto de tipo Date
            System.out.printf("%tT %d + %d = %d %n" ,date,a,b, a+b );
        }
        int sumaNumeros(int a, int b){
            return a + b;
        }

        /**/
        double sumaFlotantes(double a, double b){
            return a + b;
        }

        //sobrecarga de métodos (overload)
        //funciones con el mismo nombre pero con diferentes parametros

        int suma(int a, int b){
            return a+b;
        }
        int suma(short a, short b){
            return a+b;
        }

        double suma(double dataA, double dataB){
            return dataA + dataB;
        }

        double suma(int a, double b){
            return a +b;
        }

        double suma(double a, int b){
            return a +b;
        }
        //Esto no es posible
        // float suma(double dataA, int dataB){
        //     return float(dataA + dataB);
        //}

        double suma(double dataA, double dataB, boolean redondear){
            if(redondear)
                return Math.round(dataA + dataB);
        return dataA + dataB;
        }

        //Sobrecarga de un metodo que realice la raiz cuadrada de un valor. Un metodo lo entrega
        //como int y otro metodo retorna como double.

        int raizCuadrada(int valor){
            return (int) Math.round(Math.sqrt(valor));
        }
    /**
     * Obtener la raiz cuadrada de un numero
     * @param a valor a obtener la raiz cuadrada
     * @return raiz cuadrada redondeada
     */
    double raizCuadrada(double A){
            return Math.sqrt(A);
        }

        //Metodos estaticos (Static Method)
        /*
        *Los metodos estaticos se asocian a la clase en lugar de la instancia.
        *Se pueden invocar sin tener que instanciar un objeto.
        * */

    static double valorPi(){
        return Math.PI;
    }

    static double piPorNumero(int numero){
        return valorPi() * numero; //Invocando un metodo estático dentro de otro metodo estático. Los metodos estáticos no pueden llamar a metodos no estáticos
    }







}
