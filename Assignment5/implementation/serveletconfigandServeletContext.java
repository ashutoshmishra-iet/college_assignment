@WebServlet("/config")
public class ConfigServlet extends HttpServlet {
    public void init() throws ServletException {
        String dbUrl = getServletConfig().getInitParameter("dbUrl");
        getServletContext().setAttribute("dbUrl", dbUrl);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dbUrl = (String) getServletContext().getAttribute("dbUrl");
        response.getWriter().println("Database URL: " + dbUrl);
    }
}