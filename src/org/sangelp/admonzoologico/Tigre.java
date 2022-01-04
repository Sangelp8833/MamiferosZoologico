package org.sangelp.admonzoologico;

public class Tigre extends Felinos{


    private String especie;


    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamañoGarras, int velocidad,String especie) {
        super(habitat, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
        this.especie = especie;
    }

    public String getEspecie(){
        return especie;
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
