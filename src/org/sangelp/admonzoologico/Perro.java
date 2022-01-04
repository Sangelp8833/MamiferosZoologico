package org.sangelp.admonzoologico;

public class Perro extends Caninos{

    private int mordidaPSI;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamañocolmillos, int mordidaPSI) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamañocolmillos);
        this.mordidaPSI = mordidaPSI;
    }

    @Override
    public String comer() {
        return null;
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
