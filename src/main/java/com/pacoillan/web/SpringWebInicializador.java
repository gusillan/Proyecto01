package com.pacoillan.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.pacoillan.config.ConfiguracionSpring;

public class SpringWebInicializador implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext contexto = new AnnotationConfigWebApplicationContext();
		contexto.register(ConfiguracionSpring.class);
		contexto.setServletContext(servletContext);
		
		// Servlet controlador frontal y despache peticiones a vistas
		
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispacher", new DispatcherServlet(contexto));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
		
		
	}

	
}
