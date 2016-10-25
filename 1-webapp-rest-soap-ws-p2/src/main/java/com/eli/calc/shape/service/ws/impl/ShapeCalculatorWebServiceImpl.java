package com.eli.calc.shape.service.ws.impl;

import com.eli.calc.shape.service.ws.ShapeCalculatorWebService;
import com.eli.calc.shape.service.ws.resp.StatusCode;

public class ShapeCalculatorWebServiceImpl implements ShapeCalculatorWebService {

	public StatusCode statusCode() {
		return StatusCode.SUCCESS;
	}

	public StatusCode statusCodeXml() {
		return StatusCode.SUCCESS;
	}

	public StatusCode statusCodeJson() {
		return StatusCode.SUCCESS;
	}

}
