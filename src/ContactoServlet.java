import entidad.Contacto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ContactoServlet", urlPatterns = "/contacto")
public class ContactoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>" + req.getParameter("nombre") + "</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hola mundo!"+ req.getParameter("nombre") + "</h1>");
            out.print("<img src=\"./logojH.jpg\"></img>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }

//        super.doGet(req, resp);


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