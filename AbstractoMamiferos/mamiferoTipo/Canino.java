public abstract class Canino extends Mamifero{
    protected String color;
    protected double tamanoColmillos;

    public Canino(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public double getTamanoColmillos() {
        return tamanoColmillos;
    }
}
