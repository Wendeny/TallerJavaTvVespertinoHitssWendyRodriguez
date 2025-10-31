public class Cliente extends Persona{
    private int clienteID;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteID) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteID = clienteID;
    }

    public int getClienteID() {
        return clienteID;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "clienteID=" + clienteID +
                '}';
    }
}
