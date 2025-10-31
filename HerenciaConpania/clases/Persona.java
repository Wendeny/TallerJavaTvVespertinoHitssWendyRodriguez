public class Persona {
    protected String nombre;
    protected String apellido;
    protected String numeroFiscal;
    protected String direccion;

    public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre= '" + nombre + '\'' +
                ", apellido= " + apellido + '\'' +
                ", numeroFiscal= " + numeroFiscal +
                ", direccion= '" + direccion + '\'' +
                '}';
    }
}
