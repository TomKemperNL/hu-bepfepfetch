package nl.hu.bep.bepfep;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/rauwePost")
public class RauwePostServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Parameteroverview:");

        var names = req.getParameterNames();
        while (names.hasMoreElements()) {
            String name = names.nextElement();
            String value = req.getParameter(name);
            resp.getWriter().println(String.format("%s: %s", name, value));
        }

        String ctype = req.getHeader("Content-Type");

        resp.getWriter().println(String.format("En dat was verstuurd met %s!", ctype));
    }
}
