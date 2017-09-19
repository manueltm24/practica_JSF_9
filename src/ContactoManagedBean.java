import entidad.Contacto;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
@ViewScoped
public class ContactoManagedBean {
    private List<Contacto> contactoList;
    private Contacto contactoSeleccionado;

    public ContactoManagedBean() {

    }

    @PostConstruct
    public void init() {
        contactoList = new ArrayList<>();
        this.contactoList.add(new Contacto("Gustavo", "Henriquez", "Santiago calle 4", "8094382334", "correo@gmail.com"));
    }

    public void agregarContacto(Contacto contacto) {
        this.contactoList.add(contacto);
    }

    public List<Contacto> getContactoList() {
        return contactoList;
    }

    public Contacto getContactoSeleccionado() {
        return contactoSeleccionado;
    }

    public void setContactoSeleccionado(Contacto contactoSeleccionado) {
        this.contactoSeleccionado = contactoSeleccionado;
    }

    public void salvarContacto(Contacto contacto) {

    }

    public void borrarContacto(Contacto contacto) {

    }

    public void actulizarContacto(Contacto contacto) {

    }

    public Contacto seleccionarContacto(Contacto contacto) {
        return null;
    }

    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Contacto seleccionado", ((Contacto) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Contacto deseleccionado", ((Contacto) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}