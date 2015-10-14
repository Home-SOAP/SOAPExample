package dev.bay.ws.client;

import dev.bay.ws.SayHello;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {

    public static void main(String[] args) throws MalformedURLException {
        URL    url = new URL("http://localhost:9999/ws/hello?wsdl");
        QName name = new QName("http://ws.bay.dev/","SayHelloImplService");

        Service   service = Service.create(url,name);
        SayHello sayHello = service.getPort(SayHello.class);

        System.out.println( sayHello.hi() );
        sayHello.printOut();
    }
}
