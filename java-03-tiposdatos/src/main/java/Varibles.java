import java.util.Scanner;
public class Varibles {
    public static void main(String[] args) {
        /*
        Reglas para el nombre de las variables:
        -Se distingue entre mayusculas y minusculas
        -La longitud del nombre es ilimitada
        -Puedes utilizar cualquier caracter unicode
        -La variable puede comenzar con:
            >una letra
            >signo de dolar $
            >caracter de subrayado
        */
        int $myVar; //es valido, pero no se recomienda
        int _myVar;//es valida pero no se recomienda
        // int #myVar; //no es valido.
        int myVarEspañol;//valido pero no se recomienda.
        //int 5comentarios;//no es valido
        int sinC0m3nt4rio0s; //es valido pero no se recomienda

    /*
    En java tendremos los siguientes tipo de variables
    -Variables de instancia (Non static fields): atributos de los objetos
    -Varibales de clase (Static fields):atributos de la clase
    -Variables locales (local variables):variables dentro de las funciones(metodos)
    -Parametros (parameters):Entrada de las funciones
     */

    /*
    Tipos de datos en Java
    -Objetos
    -Datos primitivos
        8 datos primitivos
        >byte
        >short
        >int
        >long
        >float
        >double
        >boolean
        >char

        Para Java un string es un objeto
    */

        //El tipo byte es de 8 bits
        byte myVarByte = 12;
        System.out.println("byte: "+myVarByte);
        //2^8 = 256
        //Obtener el valor maximo y minimo del tipo byte, usando su
        //wrapper(Clase envolvente)Byte.
        System.out.println("Byte, Max value: "+Byte.MAX_VALUE);
        System.out.println("Byte, Max value: "+Byte.MIN_VALUE);

        //El tipo short es de 16 bits, almacena datos numericos enteros.
        //2^16 = 65536
        short myVarShort = 500;
        System.out.println("Short, Max value: "+Short.MAX_VALUE);
        System.out.println("Short, Max value: "+Short.MAX_VALUE);

        //El tipo int es de 32 bits, almacena datos numericos enteros.
        //2^32 = 2147483647
        int myVarInt = 1000;
        System.out.println("int: " + myVarInt);
        //wrapper para int
        System.out.println("Integer, Max value: " + Integer.MAX_VALUE);
        System.out.println("Integer, Max value: " + Integer.MIN_VALUE);

        //El tipo long es de 64 bits, almacena datos numericos enteros.
        //2^64

        //El tipo float es de 32 bits, almacena datos numericos de punto flotante(real)
        float myVarFloat = 1500;
        System.out.println("float: " + myVarFloat);
        System.out.println("Integer, Max value: " + Float.MAX_VALUE);
        System.out.println("Integer, Max value: " + Float.MIN_VALUE);

        //Las literales numericas enteras son de tipo int.
        //Para indicar una literal numerica de tipo long, hay que indicar
        //la literal con la letra l o L
        long myLiteralLong = 2123123L;
        //Para indicar una literal numerica de tipo float,hay que indicar
        //la literal con la letra f o F

        //El tipo double es de 64 bits, almacena datos de punto flotante.
        double myVarDouble = 1500.6523;

        System.out.println("double: " + myVarFloat);
        System.out.println("Integer, Max value: " + Double.MAX_VALUE);
        System.out.println("Integer, Max value: " + Double.MIN_VALUE);



// ---------------------------------------------------------------
        // El tipo boolean solo almacena valores true o false
        boolean myVarBoolean = true;

        // El tipo char solo almacena un caracter, se debe definir la literal
        // entre apostrofes ej. 'a'. Solo almacena caracteres de la tabla unicode(16 bits)
        // puede almacenar del 0 al 65535.

        char losPandillerosDeLaTarde = 'I';
        System.out.println("char: " + losPandillerosDeLaTarde);
        // Podemos definir un char por su código unicode o su valores numérico.
        char letraL = '\u004C'; // L
        System.out.println("La letra L: " + letraL);
        char letraM = 77; // M
        System.out.println("La letra M: " + letraM);

        // ------------------------------------------------------------
        // Formas de representar un número
        // Representación decimal
        System.out.println("Representación decima: " +  26);
        System.out.println("Representación hexadecimal: " + 0x1a);
        System.out.println("Representación binaria: " + 0b11010 );
        // Para las literales numéricas se puede usar el guión bajo _ para separa números
        // No se puede escribir _ al inicio o final de la literal
        // No se puede escribir _ junto a un punto decimal
        // No se puede escribir _ antes de la F o L
        int numeroSeparados = 12_345;
        float numerosFlotalSeparados = 12_345.456_346F;

        // --------------------------------------------------------------------------------
        // Conversión de tipos de datos
        byte coquita600ml = 60;
        // upcasting
        short coquita2000ml = coquita600ml;
        // downcasting
        short pozoleGrande1L = 259;
        byte pozoleBurbuja = (byte) pozoleGrande1L;
        System.out.println("Pozole burbuja: " + pozoleBurbuja);

        // -------------------------------------------------------------------------------
        // Objetos de tipo String.
        // Se definen entre comillas dobles.
        // Si deseas imprimir comillas dobles en el mensaje, se usa el caracter de escape \
        // \b (backspace), \t (tab), \n (line feed), \f (form feed), \r (carriage return),
        // \" (double quote), \' (single quote), and \\ (backslash).
        String myVarString = "Holi \"Crayoli\"";
        System.out.println("Mensaje string: " + myVarString);

// Convertir de string a números
        byte edadMascota = Byte.parseByte("10");
        double edadPlaneta = Double.parseDouble("456.8956");
        System.out.println( edadMascota + " , " + edadPlaneta);
        // Convertir números a String
        String edadString = String.valueOf( 4568 );
        // Obteniendo la longitud de un String
        System.out.println("El número de dígitos en edadString = " + edadString.length());
        // Obteniendo el primer caracter de un String.
        System.out.println("El segundo caracter de "+ edadString + " es : " + edadString.charAt(1));

        // -------------------------------------------------------------------------------
        // Operadores numéricos.
        int opA = (int)5.2;
        int opB = 6;
        int suma = opA + opB;
        int resta = opA - opB;
        int multiplica = (int)( opA * opB * 1.01);
        double multiplicaDouble = opA * opB * 1.01;
        int division = opA / opB;
        double divisionDouble = 1.0 * opA / opB;
        int residuo = opA % 2;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplica);
        System.out.println(multiplicaDouble);
        System.out.println( (0.1 *1000 + 0.2* 1000)/1000 );
        System.out.println(division);
        System.out.println(divisionDouble);
        System.out.println("Residuo de 5%2 = " + residuo );

        int valorInicial = 10;
        System.out.println("Preincremento " + ++valorInicial ); // 11
        System.out.println("Postincremento " + valorInicial++ ); // 11
        System.out.println("Valor final " + valorInicial ); // 12
        valorInicial = 33;
        System.out.println("Predecremento " + --valorInicial ); // 32
        System.out.println("Postdecremento " + valorInicial-- ); // 32
        System.out.println("Valor final " + valorInicial ); //31

        // Operaciones con valores enteros
        byte edadGato = 10;
        short dobleDeEdad = (short)(edadGato * 2);

        // Operadores comparativos
        // El resultado es boolean
        // <, <=, >, >=, ==, !=
        int numEmpleados = 1000;
        System.out.println("Empleados > 1000 " + ( numEmpleados > 1000  ) );
        System.out.println("Empleados >= 1000 " + ( numEmpleados >= 1000  ) );
        System.out.println("Empleados == 1000 " + ( numEmpleados == 1000  ) );
        System.out.println("Empleados != 1000 " + ( numEmpleados != 1000  ) );

        // Operadores lógicos
        // && (AND) retorna true si ambos operadores son true
        // || (OR) retorna true si cualquiera de los operandos es true
        // !  (NOT) invierte el resultado booleano

        System.out.println("Empleados > 0 && Empleados < 2000 " +
                (numEmpleados > 0 && numEmpleados < 2000 ) );
        // System.out.println("Empleados > 0 && Empleados < 2000 " +
        //         ( 2000 > numEmpleados > 0 ) ); No se puede comparar un booleano vs numérico

        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println( (a && b) || (a && c) ); // true
        System.out.println( a || b || c && a ); // true
        System.out.println( !(a || b) && (!a || c) ); // false
        System.out.println( a || b && c || a && b  ); // true

        //---------------------------------------------------------------
        //int divicionPorCero = 45 / 0; En Java ocurre una excepción al realiza / cero

    }
}
