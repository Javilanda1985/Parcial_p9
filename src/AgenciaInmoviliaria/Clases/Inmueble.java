package AgenciaInmoviliaria.Clases;

public class Inmueble {
    private String nombrePropietario;
    private String idInmueble;
    private String direccion;
    private int cedulaPropietario;

    public Inmueble(String nombrePropietario, String idInmueble, String direccion, int cedulaPropietario) {
        this.nombrePropietario = nombrePropietario;
        this.idInmueble = idInmueble;
        this.direccion = direccion;
        this.cedulaPropietario = cedulaPropietario;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(String idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCedulaPropietario() {
        return cedulaPropietario;
    }

    public void setCedulaPropietario(int cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }




}
