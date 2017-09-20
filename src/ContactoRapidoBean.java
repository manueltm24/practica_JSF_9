import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@ManagedBean
@SessionScoped
public class ContactoRapidoBean implements Serializable {
    private String nombre;
    private String apellido;
    @ManagedProperty(value="#{contactoBean}")
    private ContactoBean contactoBean;

    public ContactoBean getContactoBean() {
        return contactoBean;
    }

    public void setContactoBean(ContactoBean contactoBean) {
        this.contactoBean = contactoBean;
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




    public void insertarConctacto(){
     Contacto nuevoContacto = new Contacto();
     nuevoContacto.setApellido(this.apellido);
     nuevoContacto.setNombre(this.nombre);
     int id= Contacto.getultimoId() + 1;
     nuevoContacto.setId(id);
     Contacto.setultimoId(id);
     contactoBean.insertarContacto(id, nuevoContacto);
        limpiarCampos();
    }

    private void limpiarCampos(){
        this.nombre = "";
        this.apellido = "";
    }





}