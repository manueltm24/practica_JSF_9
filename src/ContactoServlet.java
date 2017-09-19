import entidad.Contacto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ContactoServlet", urlPatterns = "/contacto")
public class ContactoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String direccion = req.getParameter("direccion");
        String telefono = req.getParameter("telefono");
        String correo = req.getParameter("correo");

        Contacto contacto = new Contacto(nombre,apellido,direccion,telefono,correo);

        req.getSession(true).setAttribute("contacto", contacto);

        System.out.println("Contacto introducido!");
    }
}