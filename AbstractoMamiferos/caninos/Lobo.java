public class Lobo extends Canino{
    private Integer numCamada;
    private String especielobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillos, Integer numCamada, String especielobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especielobo = especielobo;
    }

    @Override
    public String comer() {
        return "El lobo " + especielobo + " suele adaptarse muy rapido a un habitat " + habitat + " llegando a cazar animales medianos o pequeños manteniendo su dieta carnivora.";
    }

    @Override
    public String dormir() {
        return "El lobo " + color + "suele dormir en las cavernas de " + habitat;
    }

    @Override
    public String correr() {
        return "El lobo " + especielobo + " suele correr junto a su grupo, donde cada uno actua como vanguardia.";
    }

    @Override
    public String comunicarse() {
        return "El lobo " + especielobo + "se comunica unicamente usando el maullido para proteger su camada de " + numCamada + " cachorros, o lugar de caza";
    }
}
