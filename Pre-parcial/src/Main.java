import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static final Scanner leer=new Scanner(System.in);
    public static ArrayList<Pasajero> pasajeros = new ArrayList<>();
    public static void main(String[] args) {
        int opcion, ciclo = 0;
        do {
            System.out.println("[1] Crear objeto \n[2] Comparar edad");
            opcion = Integer.parseInt(leer.next());
            switch (opcion) {
                case 1:
                    agregarObjeto();
                    break;
                case 2:
                    for (int i = 0; i < 1; i++) {
                        System.out.println(Pasajero.comparar(pasajeros.get(i), pasajeros.get(i)));
                    }
                    break;
                case 3:
                    break;
            }
        } while (ciclo == 0);
    }
    public static void agregarObjeto(){
        String nombres,apellidos,numero_de_pasaporte,asiento;
        Integer edad;
        System.out.println("Ingrese nombre");
        nombres = leer.next();
        System.out.println("Ingrese apellido");
        apellidos = leer.next();
        System.out.println("Ingrese numero de pasaporte");
        numero_de_pasaporte= leer.next();
        System.out.println("Ingrese asiento");
        asiento = leer.next();
        System.out.println("Ingrese edad");
        edad = leer.nextInt();

        Pasajero auxPasajero = new Pasajero(nombres,apellidos,numero_de_pasaporte,asiento,edad);
        pasajeros.add(auxPasajero);
    }
}
