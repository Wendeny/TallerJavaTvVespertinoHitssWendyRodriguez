public class Guepardo extends Felino{
    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo '"  + nombreCientifico + "' suelen comer mamíferos medianos, derriban a su presa con el tamaño " + tamanoGarras + " de sus garras para despises asfixiarlas y devorarlas.";
    }

    @Override
    public String dormir() {
        return "Los guepardos buscan un lugar en su habitat " + habitat + " bajo la sombra, durante las horas más calurosas del día.";
    }

    @Override
    public String correr() {
        return "Los guepardos corren usando un tipo de golpe que les permite cazar a grandes velocidades de hasta " + velocidad + "km/h.";
    }

    @Override
    public String comunicarse() {
        return "A diferencia de otro gran felino, los guepardos suelen comunicarse a base de ronroneos, chirridos y maullidos.";
    }
}
