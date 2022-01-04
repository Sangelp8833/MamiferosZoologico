package org.sangelp.admonzoologico;

public class Lobo extends Caninos{

    private int numerCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamañocolmillos, int numerCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamañocolmillos);
        this.especieLobo = especieLobo;
        this.numerCamada = numerCamada;
    }

    public int getNumerCamada(){
        return numerCamada;
    }

    public String getEspecieLobo(){
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo " + getColor() + " duerme en las cavernas de " + habitat;
    }

    @Override
    public String dormir() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }

    @Override
    public String comunicarse() {
        return null;
    }
}
