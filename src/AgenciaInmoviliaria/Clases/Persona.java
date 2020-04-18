package AgenciaInmoviliaria.Clases;

public class Persona {
    private String nombre;
    private String Apellido;
    private int Cedula;
    private int tipo;

    public Persona(String nombre, String Apellido, int Cedula, int tipo) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.tipo = tipo;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }


}
