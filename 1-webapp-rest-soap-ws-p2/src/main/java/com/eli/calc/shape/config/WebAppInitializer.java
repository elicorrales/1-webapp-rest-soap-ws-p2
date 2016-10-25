package com.eli.calc.shape.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;



public class WebAppInitializer implements WebApplicationInitializer {

	private static final Logger logger = LoggerFactory.getLogger(WebAppInitializer.class);
	
    public WebAppInitializer() {
    	logger.debug("\n\n\nConstructor\n\n\n");
    }


	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		logger.debug("\n\n\n\nWeb AppInitializer onStartup() \n\n\n\n");

		AnnotationConfigWebApplicationContext rootCtx = new AnnotationConfigWebApplicationContext();
		rootCtx.register(WebServiceContext.class);
		
		ContextLoaderListener loaderListener = new ContextLoaderListener(rootCtx);

		servletContext.addListener(loaderListener);

/*
		ShapeCalcServletContextListener myServletContextListener = new ShapeCalcServletContextListener(rootCtx);
		servletContext.addListener(myServletContextListener);
*/
		CXFServlet dispatcherServlet = new CXFServlet();
		
		ServletRegistration.Dynamic registration = servletContext.addServlet("cxfServlet",dispatcherServlet);
	
		registration.setLoadOnStartup(1);
		registration.addMapping("/services/*");

		logger.debug("\n\n\n\nEND Web AppInitializer onStartup()\n\n\n\n");

	}

}
