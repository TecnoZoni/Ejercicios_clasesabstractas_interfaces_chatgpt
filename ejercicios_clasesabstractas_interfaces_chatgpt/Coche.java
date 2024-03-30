package ejercicios_clasesabstractas_interfaces_chatgpt;

public class Coche extends Vehiculo implements TransportePublico {

    private int numeroDePuertas;

    public Coche(int numeroDePuertas, String marca, String modelo, int año) {
        super(marca, modelo, año);
        this.numeroDePuertas = numeroDePuertas;
    }

    public Coche() {
    }

    @Override
    public void acelerar() {
        System.out.println("El Coche acelera");
    }

    @Override
    public void frenar() {
        System.out.println("El Coche frena");
    }

    @Override
    public void cobrarTarifa() {
        System.out.println("El Coche cobra la tarifa");
    }

}
