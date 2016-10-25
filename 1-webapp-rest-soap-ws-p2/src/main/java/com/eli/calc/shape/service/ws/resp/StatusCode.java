package com.eli.calc.shape.service.ws.resp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.XmlType;


//@XmlRootElement(name="StatusCode")
//@XmlType(name = "StatusCode")
//@XmlRootElement(name="StatusCode", namespace="http://model.shape.calc.eli.com/")
//@XmlType(name = "StatusCode", namespace = "http://model.shape.calc.eli.com/")

@XmlRootElement
//@XmlType(name = "StatusCode")       //<----- nope
//@XmlType                          //<----- no workie
//@XmlEnum                          //<----- this by itself did not work
                                    //       also doesnt work inconjunction with
                                    //       @XmlEnumValue()(below)

public enum StatusCode {

	//@XmlEnumValue("SUCCESS")
	SUCCESS,
	//@XmlEnumValue("ERROR")
	ERROR
}
