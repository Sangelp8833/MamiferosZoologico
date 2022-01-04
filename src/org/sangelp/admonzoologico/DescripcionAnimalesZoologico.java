package org.sangelp.admonzoologico;

public class DescripcionAnimalesZoologico {
    public static void main(String[] args) {

        Mamifero[] mamiferos = new Mamifero[2];

        Leon leon = new Leon("Sur Africa", 120.12,3000,160,"Leon",12,70,5,30.65);
        Lobo lobo = new Lobo("Alaska",130,2500, 130,"lobus","Gris",20,12,"Gris");

        mamiferos[0] = leon;
        mamiferos[1] = lobo;

        for(Mamifero m: mamiferos){
            if(m instanceof Leon){
                System.out.println("\n------------- LEON -------------------");
                System.out.println("Habitat: " + m.getHabitat());
                System.out.println("Altura: " + m.getAltura() );
                System.out.println("Largo: " + m.getLargo());
                System.out.println("Peso: " + m.getPeso());
                System.out.println("Nombre Cientifico: " + m.getNombreCientifico());
                System.out.println("Tamaño Garras: " + ((Leon) m).tamañoGarras);
                System.out.println("Velocidad: " + ((Leon) m).getVelocidad()) ;
                System.out.println("Numero manada: " + ((Leon) m).getNumeroManad());
                System.out.println("Potencia Rugido: " + ((Leon) m).getPotenciRugido());
            } else if (m instanceof Lobo){
                System.out.println("\n-------------- LOBO ------------------");
                System.out.println("Habitat: " + m.getHabitat());
                System.out.println("Altura: " + m.getAltura() );
                System.out.println("Largo: " + m.getLargo());
                System.out.println("Peso: " + m.getPeso());
                System.out.println("Nombre Cientifico: " + m.getNombreCientifico());
                System.out.println("Color: " + ((Lobo) m).getColor());
                System.out.println("TamañoColmillos: " + ((Lobo) m).getTamañocolmillos()) ;
                System.out.println("Numero manada: " + ((Lobo) m).getNumerCamada());
                System.out.println("Especie Lobo: " + ((Lobo) m).getEspecieLobo());
            }

        }

    }
}
