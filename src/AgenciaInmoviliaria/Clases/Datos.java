package AgenciaInmoviliaria.Clases;

public abstract class Datos {
    String nombrePropietario;
    String idInmueble;
    int cedulaPropietario;

    public Datos(String nombrePropietario, String idInmueble, int cedulaPropietario) {
        this.nombrePropietario = nombrePropietario;
        this.idInmueble = idInmueble;
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

    public int getCedulaPropietario() {
        return cedulaPropietario;
    }

    public void setCedulaPropietario(int cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }
}
