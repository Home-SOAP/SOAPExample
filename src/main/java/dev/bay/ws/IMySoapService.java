package dev.bay.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Саша on 03.09.2015.
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface IMySoapService {

    @WebMethod
    public String function();
}
