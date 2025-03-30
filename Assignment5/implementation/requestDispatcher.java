@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if (validateUser (username, password)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("welcome");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("login.html?error=Invalid credentials");
        }
    }
    
    private boolean validateUser (String username, String password) {
        // Implement user validation logic
        return true; // Placeholder
    }
}