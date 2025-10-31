public class Tigre extends Felino{
    private String especie;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, Integer velocidad, String especie) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especie = especie;
    }

    @Override
    public String comer() {
        return "El tigre " + especie + " suele comer carne de mamíferos como ciervos o jabalíes, además de presas más pequeñas.";
    }

    @Override
    public String dormir() {
        return "El tigre " + especie + " suele dormir en su habitad " + habitat + ", donde duerme de lado o las patas al aire para demostrar confianza.";
    }

    @Override
    public String correr() {
        return "El tigre " + especie + " corre a una velocidad de " + velocidad + "km para hacer emboscadas y abatir a su presa con la fuerza y usando el tamaño " + tamanoGarras + " de sus garras.";
    }

    @Override
    public String comunicarse() {
        return "El tigre " + especie + " suele comunicarse mediante rugidos, gruñidos o resoplidos y a través del olor.";
    }
}
