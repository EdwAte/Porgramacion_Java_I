package co.com.ps.c6;

public class Ejercicioc6 {
    public static void main (String [] args) {


    double[] valores = new double[10];


        valores[0] = 1;
        valores[1] = 2;
        valores[2] = 6;
        valores[3] = 4;
        valores[4] = 5;
        valores[5] = 3;
        valores[6] = 7;
        valores[7] = 9;
        valores[8] = 8;
        valores[9] = 10;


        for (double num :valores) {
        System.out.println(num);
    }

        double menor = valores [0];
        double mayor = valores [0];


        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < menor) {
                menor = valores[i];
            }
            if (valores[i] > mayor) {
                mayor = valores[i];
            }
        }
        System.out.println("El número menor es: " + menor);
        System.out.println("El número mayor es: " + mayor);


    }

}
