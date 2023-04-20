package ua.hillel;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/")
public class DispatcherServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        ResourceConfig config = new ResourceConfig();
        config.packages("com.example.controllers");

        ServletContext context = getServletContext();
        ServletRegistration.Dynamic servletRegistration = context.addServlet("jersey-servlet", (Servlet) new ServletContainer(config));
        servletRegistration.addMapping("/*");
        servletRegistration.setLoadOnStartup(1);
    }
}


