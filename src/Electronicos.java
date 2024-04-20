public abstract class Electronicos {
    //atributos
    protected String nombre;
    protected float modelo;
    protected String descripcion;
    protected float precio;

    public Electronicos() {
    }

    public static void obtenerPrecio(){
    }

    public Electronicos(String nombre, float modelo, String descripcion, float precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getModelo() {
        return modelo;
    }

    public void setModelo(float modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
