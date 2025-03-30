@WebServlet("/session")
public class SessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        request.getSession().setAttribute("username", username);
        response.getWriter().println("Session created for user: " + username);
    }
}