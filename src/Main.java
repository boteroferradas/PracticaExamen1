import Objets.Coche;
import Services.Metodos;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2020, "Rojo");
        Coche toRead = new Coche();
        Metodos.escribirCoche("coches.txt", coche1);
        Metodos.leerCoche("coches.txt", toRead);
    }
}
