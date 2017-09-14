package com.myserv.classes.filters;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Sit on 14.09.2017.
 */
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String testParam = filterConfig.getInitParameter("test-param");
        System.out.println("Param: " + testParam);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String ipAddr = servletRequest.getRemoteAddr();
        System.out.println("ipAddr: " + ipAddr);
    }

    @Override
    public void destroy() {
        System.out.println("Filter has been destroyed!");
    }
}
