package ejercicios_clasesabstractas_interfaces_chatgpt;

public class Ejercicios_clasesAbstractas_interfaces_ChatGPT {

    public static void main(String[] args) {
        Coche coche = new Coche(4, "Renault", "Renauto", 2015);
        Bicicleta bicicleta = new Bicicleta("BMX", "Jumping", 2005);

        System.out.println("Clase Coche:");
        coche.acelerar();
        coche.frenar();
        coche.cobrarTarifa();
        System.out.println("===========================");
        System.out.println("Clase Bicicleta:");
        bicicleta.acelerar();
        bicicleta.frenar();

    }

}
