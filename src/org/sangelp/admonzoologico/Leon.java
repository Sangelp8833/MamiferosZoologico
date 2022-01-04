package org.sangelp.admonzoologico;

public class Leon extends Felinos{

    private int numeroManad;
    private double potenciRugido;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamañoGarras, int velocidad, int numeroManad, double potenciRugido) {
        super(habitat, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
        this.numeroManad = numeroManad;
        this.potenciRugido = potenciRugido;
    }

    public int getNumeroManad() {
        return numeroManad;
    }

    public double getPotenciRugido() {
        return potenciRugido;
    }

    @Override
    public String comer() {
        return "El león caza junto a su grupo de " + numeroManad + " individuos en las llanuras africanas";
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
