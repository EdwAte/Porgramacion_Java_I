package co.com.ps.c4;

public class Test {

    public static void main(String[] args) {
        Persona persona1= new Persona ();
        Persona persona2 = new Persona("La Raza");
        Persona persona3 = new Persona ("1088000", 28);

        persona2.setNombre("Pablo");
        persona3.setEdad(20);

        Ejercicioc4 repuesto1=new Ejercicioc4();
        Ejercicioc4 repuesto2=new Ejercicioc4("Llantas",14);
        Ejercicioc4 repuesto3=new Ejercicioc4(180000);

        repuesto2.setNombre("Bobina");
        repuesto2.setTamano(15);
        repuesto3.setPrecio(45000);


    }

}







