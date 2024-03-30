package ejercicios_clasesabstractas_interfaces_chatgpt;

public class Bicicleta extends Vehiculo {

    public Bicicleta(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    public Bicicleta() {
    }

    @Override
    public void acelerar() {
        System.out.println("La Bicicleta acelera");
    }

    @Override
    public void frenar() {
        System.out.println("La Bicicleta frena");
    }

}
