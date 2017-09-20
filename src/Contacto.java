/**
 * Created by manueltm24 on 9/20/2017.
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;
    private Integer id;

    private static int ultimoId = 0;

    public static int getultimoId() {
        return ultimoId;
    }

    public static void setultimoId(int lastId) {
        Contacto.ultimoId = lastId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
