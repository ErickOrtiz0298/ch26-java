package org.generation;

public class CicloFor {
    public static void main(String[] args) {



 /*       for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 10; j++) {
                //System.out.println(i+" * " + j + " = "+ (i * j));
                System.out.printf("Tabla %02d * %02d = 0x%d %n",i, j, i*j);
                System.out.printf("Tabla %02d * %02d = 0x%03x %n",i, j, i*j);
            }
        }*/
/*        int iteraciones = 1;
        for( ; ; ){
            if(iteraciones>5) break;
            System.out.println("Iteracion: " + iteraciones);
            iteraciones++;
        }*/

    /*    outerLoop:
        for(int i = 0; i<5;i++){
            for (int j = 0; j < 5; j++) {
                System.out.println(i + " "+j);
                if(i==2 && j==2)break outerLoop;
            }
        }*/
        //Imprimir los numeros impares del 1 al 20 (incluyendo)
        for(int i=1; i<20; i++ ){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
        boolean bandera = false;
        if(bandera = true)
            System.out.println("Banderita,banderita,badnerita tricolor");

    }
}
