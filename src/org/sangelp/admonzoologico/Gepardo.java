package org.sangelp.admonzoologico;

public class Gepardo extends Felinos{

    public Gepardo(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamañoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
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
