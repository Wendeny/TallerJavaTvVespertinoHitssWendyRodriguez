public class Empleado extends Persona{
    private double remuneracion;
    private int empleadoID;
    private static int contador = 1;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = contador++;
        this.empleadoID = empleadoID;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    public void aumentarRemuneracion(int porcentaje){
        remuneracion += remuneracion * porcentaje / 100.0;
    }

    @Override
    public String toString() {
        return "Empleado {" +
                "remuneracion= " + remuneracion +
                ", empleadoID= " + empleadoID +
                '}';
    }
}
