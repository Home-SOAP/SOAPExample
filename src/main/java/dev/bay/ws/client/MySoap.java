package dev.bay.ws.client;

import dev.bay.ws.IMySoapService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Саша on 03.09.2015.
 */
public class MySoap {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:9999/ws/function?wsdl");
        QName name = new QName("http://ws.bay.dev/","MySoapServiceService");

        Service service = Service.create(url,name);
        IMySoapService mySoapService = service.getPort(IMySoapService.class);

        System.out.println( mySoapService.function() );
    }

}
