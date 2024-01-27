// https://www.javatpoint.com/life-cycle-of-a-servlet

// https://javarush.com/groups/posts/2529-chastjh-5-servletih-pishem-prostoe-veb-prilozhenie

import javax.servlet.*;
import javax.servlet.http.*;

public class Servlets extends HttpServlet {


    // life cycle

    // -init() => public void init(ServletConfig config) throws ServletException

    // -service() =>
    // public void service(ServletRequest request, ServletResponse
    // response) throws ServletException, IOException

    // -destroy() => public void destroy()

}

// javax.servlet:

//  - interfaces
//    - Servlet (life cycle)
//    - ServletConfig (initProps)
//    - ServletContext (log Event, info about environment)
//    - ServletRequest (read data from client request)
//    - ServletResponse (write data to client response)
//  - classes
//    - GenericServlet (implement Servlet and ServletConfig interfaces)
//    - ServletInputStream (read request from a client)
//    - ServletOutputStream (write response to a client)
//    - ServletException (indicate the Servlet error)
//    - UnavailableException  (indicate the Servlet is unavailable)