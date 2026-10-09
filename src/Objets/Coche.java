package Objets;

import java.io.Serializable;

public class Coche implements Serializable {
    private String marca;
    private String modelo;
    private int ano;
    private String color;

    public Coche() {
    }

    public Coche(String marca, String modelo, int ano, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", color='" + color + '\'' +
                '}';
    }
}
