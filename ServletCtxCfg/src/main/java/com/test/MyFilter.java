package com.test;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

@WebFilter("/SessionExp")
public class MyFilter extends HttpFilter  {



	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy()");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Before servlet pre filter");
		chain.doFilter(request, response);
		System.out.println("After servlet pre filter");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init()");
	}

}
