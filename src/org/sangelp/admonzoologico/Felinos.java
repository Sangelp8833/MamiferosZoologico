package org.sangelp.admonzoologico;

abstract public class Felinos extends Mamifero {


    protected double tamañoGarras;
    protected int velocidad;


    public Felinos(String habitat, double altura, double largo, double peso, String nombreCientifico,double tamañoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamañoGarras = tamañoGarras;
        this.velocidad = velocidad;
    }


    public double getTamañoGarras(){
        return tamañoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }


}
