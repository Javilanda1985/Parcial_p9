package AgenciaInmoviliaria.Clases;

public class Contrato {
    private String nombrePropietario;
    private int cedulaPropietario;
    private String nombreinqquilino;
    private int cedulaInquilino;
    private String direccionInmueble;
    private String idInmueble;
    private double precio;
    private int duracion;

    public Contrato(String nombrePropietario, int cedulaPropietario, String nombreinqquilino, int cedulaInquilino, String direccionInmueble, String idInmueble, double precio, int duracion) {
        this.nombrePropietario = nombrePropietario;
        this.cedulaPropietario = cedulaPropietario;
        this.nombreinqquilino = nombreinqquilino;
        this.cedulaInquilino = cedulaInquilino;
        this.direccionInmueble = direccionInmueble;
        this.idInmueble = idInmueble;
        this.precio = precio;
        this.duracion = duracion;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public int getCedulaPropietario() {
        return cedulaPropietario;
    }

    public void setCedulaPropietario(int cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }

    public String getNombreinqquilino() {
        return nombreinqquilino;
    }

    public void setNombreinqquilino(String nombreinqquilino) {
        this.nombreinqquilino = nombreinqquilino;
    }

    public int getCedulaInquilino() {
        return cedulaInquilino;
    }

    public void setCedulaInquilino(int cedulaInquilino) {
        this.cedulaInquilino = cedulaInquilino;
    }

    public String getDireccionInmueble() {
        return direccionInmueble;
    }

    public void setDireccionInmueble(String direccionInmueble) {
        this.direccionInmueble = direccionInmueble;
    }

    public String getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(String idInmueble) {
        this.idInmueble = idInmueble;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }




}
