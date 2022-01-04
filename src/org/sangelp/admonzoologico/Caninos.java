package org.sangelp.admonzoologico;

abstract public class Caninos extends Mamifero{

    private String color;
    private double tamañocolmillos;

    public Caninos(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamañocolmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamañocolmillos = tamañocolmillos;
    }

    public String getColor(){
        return color;
    }

    public double getTamañocolmillos(){
        return tamañocolmillos;
    }




}

