package co.com.ps.c12;
import java.util.Arrays;
import java.util.stream.IntStream;
public class TrabajoFinal {

        public static void main(String[] args) {
            int arreglo[] = {0, 3, 2, 5, 10, 9, 7, 8, 1, 4};
            int [] miarreglo = Arrays.stream(arreglo)
                    .sorted()
                    .toArray();

            int suma = IntStream.of(miarreglo).sum();
            Mensaje enumSuma = Mensaje.Bienvenida;
            System.out.println(Arrays.toString(miarreglo));
            System.out.println( enumSuma.getMensaje1() + " "+ suma);
        }

}



