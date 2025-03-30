import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class LoggingFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println("IP: " + req.getRemoteAddr() + ", Time: " + System.currentTimeMillis() + ", URL: " + req.getRequestURI());
        chain.doFilter(request, response);
    }
}