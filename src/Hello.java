
import java.util.*;
import java.io.*;
import javax.servlet.*;

public class Hello extends GenericServlet {
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("Hello World");
        pw.close();
    }
}