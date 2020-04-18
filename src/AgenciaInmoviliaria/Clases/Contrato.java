package AgenciaInmoviliaria.Clases;

public class Contrato extends Datos{
    //private String nombrePropietario;
    //private int cedulaPropietario;
    private String nombreinqquilino;
    private int cedulaInquilino;
    private String direccionInmueble;
    //private String idInmueble;
    private double precio;
    private int duracion;

    public Contrato(String nombrePropietario, String idInmueble, int cedulaPropietario) {
        super(nombrePropietario, idInmueble, cedulaPropietario);
    }

    public Contrato(String nombrePropietario, int cedulaPropietario,  String nombreinqquilino, int cedulaInquilino, String idInmueble,   String direccionInmueble, double precio, int duracion) {
        super(nombrePropietario, idInmueble, cedulaPropietario);
        this.nombreinqquilino = nombreinqquilino;
        this.cedulaInquilino = cedulaInquilino;
        this.direccionInmueble = direccionInmueble;
        this.precio = precio;
        this.duracion = duracion;
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
