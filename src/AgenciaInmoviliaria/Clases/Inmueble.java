package AgenciaInmoviliaria.Clases;

public class Inmueble extends Datos{
    private String direccion;

    public Inmueble(String nombrePropietario, String idInmueble, String direccion, int cedulaPropietario) {
        super(nombrePropietario, idInmueble, cedulaPropietario);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
