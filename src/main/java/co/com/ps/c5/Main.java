package co.com.ps.c5;

public class Main {
    public static void main(String[] args) {

        int num1 = 1;

        if(num1>3){//SI
            System.out.println("El numero es mayor");
        }else if(num1==0){//SINO SI
            System.out.println("El numero es 0");
        }else  if(num1<0) {
            System.out.println("El numero es negativo");
        }else{//SINO
            System.out.println("El numero es menor");
        }

        /////////////////////////////////////////////////////

        int diaSemana = 1111;
        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Fin de semana");
                break;
        }



    }
}




