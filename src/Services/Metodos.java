package Services;

import Objets.Coche;

import java.io.*;

public class Metodos {
    public static void escribirCoche (String directorio, Coche coche) {
        File arquivo = new File(directorio);

        try (FileOutputStream fos = new FileOutputStream(arquivo);
             ObjectOutputStream oos = new ObjectOutputStream(fos);){

            oos.writeObject(coche);
            System.out.println("Obxeto serializado con éxito. ");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void leerCoche (String directorio, Coche cVacio) {
        File arquivo = new File(directorio);

        try (FileInputStream fis = new FileInputStream(arquivo);
             ObjectInputStream oos = new ObjectInputStream(fis);){

            Coche pLeido = (Coche) oos.readObject();
            cVacio.setMarca(pLeido.getMarca());
            cVacio.setModelo(pLeido.getModelo());
            cVacio.setAno(pLeido.getAno());
            cVacio.setColor(pLeido.getColor());

            System.out.println("Objeto coche vacio rellenado: " + cVacio);
            //IMPORTATE: Hay que añadir un ClassNotFoundException, ya que es una "Checked Exception" y
            // es obligatorio manejarla
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
