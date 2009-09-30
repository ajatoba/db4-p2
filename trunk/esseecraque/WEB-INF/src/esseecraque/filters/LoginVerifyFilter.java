package esseecraque.filters;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import esseecraque.bean.Assinante;
import esseecraque.util.Constants;

public class LoginVerifyFilter implements Filter {
	
    public LoginVerifyFilter()
    {
    }

    public void init(FilterConfig filterconfig)
        throws ServletException
    {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
        throws IOException, ServletException
    {
    	
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;
        HttpSession session = request.getSession(true);
        
        Assinante user = null;
        if(session.getAttribute(Constants.ASSINANTE_BEAN) != null)
            user = (Assinante)session.getAttribute(Constants.ASSINANTE_BEAN);
        if(user != null)
        {
        	session.setAttribute(Constants.ASSINANTE_BEAN,user);
            chain.doFilter(req, resp);
        } else
        {   
            request.getRequestDispatcher("../login.jsp").forward(request, response);
        }
    }

    public void destroy()
    {
    }

}
