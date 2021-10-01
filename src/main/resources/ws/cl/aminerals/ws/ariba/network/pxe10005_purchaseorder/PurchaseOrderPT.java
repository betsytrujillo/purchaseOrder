
package cl.aminerals.ws.ariba.network.pxe10005_purchaseorder;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import cl.aminerals.ws.ariba.orderrequest.CXML;
import cl.aminerals.ws.ariba.orderresponse.Response;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PurchaseOrderPT", targetNamespace = "http://ws.aminerals.cl/Ariba/Network/PXE10005_PurchaseOrder")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    cl.aminerals.ws.ariba.orderrequest.ObjectFactory.class,
    cl.aminerals.ws.ariba.orderresponse.ObjectFactory.class
})
public interface PurchaseOrderPT {


    /**
     * 
     * @param orderRequest
     * @return
     *     returns cl.aminerals.ws.ariba.orderresponse.Response
     */
    @WebMethod(operationName = "PurchaseOrderOp", action = "PurchaseOrderOp")
    @WebResult(name = "Response", targetNamespace = "http://ws.aminerals.cl/Ariba/OrderResponse", partName = "OrderResponse")
    public Response purchaseOrderOp(
        @WebParam(name = "cXML", targetNamespace = "http://ws.aminerals.cl/Ariba/OrderRequest", partName = "OrderRequest")
        CXML orderRequest);

}
