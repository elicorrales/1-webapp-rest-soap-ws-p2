package com.eli.calc.shape.service.ws;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.eli.calc.shape.service.ws.resp.StatusCode;

@WebService       //Needed for SOAP, not for REST 
@Path("/shapecalc") // Needed For REST
					// without it, CXF WADL2JAVA complains of no resources
					// and Swagger will have no resource definitions
public interface ShapeCalculatorWebService {

	@GET
	@Path("/status-code-no-defined")
	StatusCode statusCode();//Enum

	@GET
	@Path("/status-code-xml")
	@Produces(MediaType.APPLICATION_XML)
	StatusCode statusCodeXml();//Enum

	@GET
	@Path("/status-code-json")
	@Produces(MediaType.APPLICATION_JSON)
	StatusCode statusCodeJson();//Enum

}