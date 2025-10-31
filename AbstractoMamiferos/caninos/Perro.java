public class Perro extends Canino{
    private Integer fuerzaMordida;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillos, Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "Los perros suelen tener un alimento balanceado teniendo su llamada 'mordida de tijera' con una fuerza de " + fuerzaMordida;
    }

    @Override
    public String dormir() {
        return "Los perros " + nombreCientifico + " suelen dormir indicando su nivel de relajación o seguridad.";
    }

    @Override
    public String correr() {
        return "Los perros " + nombreCientifico + " corren dependiendo a varios factores, raza, edad y condición física.";
    }

    @Override
    public String comunicarse() {
        return "Los perros " + nombreCientifico + " se comunican usando lenguaje corporal o vocalizaciones.";
    }
}
