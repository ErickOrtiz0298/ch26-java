package org.generation;

public class OperacionesTest {

    //atributos
    //atributos de instancia (non-static fields)
    //atributos de clase (static fields)
    public static void main(String[] args){
        System.out.println("Java 07 Funciones");

        OperacionesMath  operaciones;
        operaciones = new OperacionesMath();

        operaciones.sumaEnterosSinRetorno(35,5);//40
        operaciones.sumaEnterosSinRetorno(3,3);//6

       int resultadoSuma = operaciones.sumaNumeros(10,9);//19
        System.out.println(resultadoSuma);
        System.out.println(operaciones.sumaNumeros(4,5));//9

        System.out.println(operaciones.sumaFlotantes(4.5,5.5));
        System.out.println(operaciones.sumaFlotantes(4.01,5.02));

        System.out.println(operaciones.suma(3,3));
        System.out.println(operaciones.suma(3.5,3.4,true));

        System.out.println(operaciones.raizCuadrada(9.0));
        System.out.println(operaciones.raizCuadrada(9));

        //Usar metodo estático
        System.out.println(operaciones.valorPi());
        System.out.println(OperacionesMath.valorPi());
        System.out.println(OperacionesMath.piPorNumero(3));


    }
}
