package co.com.ps.c7;

public class Ejercicioc7 {

    public static void main (String [] args) {

        int arreglo[] = {4, 2, 6, 2, 3, 5};


        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length -1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;

                }
            }

        }
        System.out.println(" ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);




}

    }
}










