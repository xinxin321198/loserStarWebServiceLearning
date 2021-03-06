
package com.loserstar.webservice.base;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TestService", targetNamespace = "http://base.webservice.loserstar.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TestService {


    /**
     * 
     * @param a
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://base.webservice.loserstar.com/", className = "com.loserstar.webservice.base.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://base.webservice.loserstar.com/", className = "com.loserstar.webservice.base.AddResponse")
    @Action(input = "http://base.webservice.loserstar.com/TestService/addRequest", output = "http://base.webservice.loserstar.com/TestService/addResponse")
    public String add(
        @WebParam(name = "a", targetNamespace = "")
        String a);

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "tt", targetNamespace = "http://base.webservice.loserstar.com/", className = "com.loserstar.webservice.base.Tt")
    @ResponseWrapper(localName = "ttResponse", targetNamespace = "http://base.webservice.loserstar.com/", className = "com.loserstar.webservice.base.TtResponse")
    @Action(input = "http://base.webservice.loserstar.com/TestService/ttRequest", output = "http://base.webservice.loserstar.com/TestService/ttResponse")
    public void tt();

}
