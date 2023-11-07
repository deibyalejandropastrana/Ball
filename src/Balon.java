import javax.swing.*;

public class Balon {
    String nombre;
    String color;
    String textura;
    public static void main(String[] args) {

        Balon balon1 = new Balon();

        balon1.nombre = "micro";
        balon1.color = "verde";
        balon1.textura = "tela";

        System.out.println("el nombre del balon1 es: "+balon1.nombre);
        System.out.println("el color del balon1 es: "+balon1.color);
        System.out.println("la textura del balon1 es: "+balon1.textura);


        Balon balon2 = new Balon();

        balon2.nombre = "baloncesto";
        balon2.color = "zapote";
        balon2.textura = "caucho";

        System.out.println("\nel nombre del balon2 es: "+balon2.nombre);
        System.out.println("el color del balon2 es: "+balon2.color);
        System.out.println("la textura del balon2 es: "+balon2.textura);


        Balon balon3 = new Balon();

        balon3.nombre = "voleibol";
        balon3.color = "blanco";
        balon3.textura = "goma";

        System.out.println("\nel nombre del balon3 es: "+balon3.nombre);
        System.out.println("el color del balon3 es: "+balon3.color);
        System.out.println("la textura del balon3 es: "+balon3.textura);



    }
}