public class Leon extends Felino{
    private Integer numManada;
    private double potenciaRugidoDecibel;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, Integer velocidad, Integer numManada, double potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El león caza junto a su manada de " + numManada + " individuos en su habitat " + habitat;
    }

    @Override
    public String dormir() {
        return "El leon suele dormir entre 15 y 20 horas.";
    }

    @Override
    public String correr() {
        return "Los leones suelen correr a una velocidad de " + velocidad + "km/h en distancias cortas.";
    }

    @Override
    public String comunicarse() {
        return "Los leones se comunican mediante rugidos " + potenciaRugidoDecibel + " de tal potencia para marcar territorio o reunir su manada de " + numManada + " habitantes.";
    }
}
