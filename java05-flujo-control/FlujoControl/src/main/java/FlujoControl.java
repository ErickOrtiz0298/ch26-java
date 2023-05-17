public class FlujoControl {
    public static void main(String[] args) {
        /**
         *  Java 05
         *Sintaxis de la condicional if
         *
         * Si la condicional es verdadera, se ejecuta la instruccion del if
         *
         * if(condicional sentencias;
         *
         * if(condicional){
         *     sentencias;
         * }
         *
         * if(condicional){
         *     sentencias;
         * }else{
         *  sentencia_si_condicional_es_falsa;
         * }
         *-------------------------------------
         *
         * if(condicional)
         *  sentencia
         * else if (nueva_condicional)
         *  sentencia;
         *  .
         *  .
         *  .
         * else if(n_condicion)
         *  sentencia;
         * else
         *  sentencia;
         *
         */

        boolean condicion = true;
        if(condicion)
            System.out.println("La condicion es verdadera");
        else
            System.out.println("La condicion es falsa");

        int edad = 17;
        if(edad >= 18)
            System.out.println("La persona");
        else
            System.out.println("La persona es menor de edad");

        //------------------------------------------------------
        /*
         * De una variable tipo int, evaluar si está en el rango de 1 a 10, si es así
         * desplegar en consola "La seleccion está en el rango"
         * En caso contrario "La selección está fuera de rango".

         */

        int numero = 1;
        if (numero <= 1 || numero >= 10){
            System.out.println("La seleccion está fuera del rango");
        }else {
            System.out.println("La seleccion está dentro del rango");
        }

        numero = 1;
        if (numero >= 1 && numero <= 10){
            System.out.println("La seleccion está dentor del rango");
        }else {
            System.out.println("La seleccion está fuera del rango");
        }

        //---------------------------------------------
        /*
        *Operador ternario
        * Sintaxis
        *       expresion ? respuesta_si_es_true : si_es_false
        */

        numero = 11;
        String texto1= "La seleccion está dentor del rango";
        String texto2= "La seleccion está fuera del rango";
        System.out.println((numero >= 1 && numero <= 10)? texto1:texto2);

    }
}
