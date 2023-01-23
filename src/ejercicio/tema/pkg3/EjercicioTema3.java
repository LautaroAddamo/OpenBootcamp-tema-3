package ejercicio.tema.pkg3;

/**
 *
 * @author Lautaro
 */
public class EjercicioTema3 {

    public static void main(String[] args) {

        System.out.println(suma(2, 3, 5));

        Coche miCoche = new Coche();

        System.out.println("Mi coche tiene: " + miCoche.getPuertas() + " puertas");

        miCoche.setPuertas(incrementarPuertas(miCoche.getPuertas()));

        System.out.println("Mi coche tiene: " + miCoche.getPuertas() + " puertas");
    }

    public static int suma(int a, int b, int c) {
        int resultado = a + b + c;
        return resultado;
    }

    public static int incrementarPuertas(int puertas) {
        int cantidadPuertas = puertas + 1;
        return cantidadPuertas;
    }

}
