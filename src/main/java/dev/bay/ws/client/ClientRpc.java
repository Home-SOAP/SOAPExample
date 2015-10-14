package dev.bay.ws.client;

import dev.bay.ws.SayRPC;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class ClientRpc {

    public static void main(String[] args) throws MalformedURLException {
        URL    url = new URL("http://localhost:9999/ws/rpc?wsdl");
        QName name = new QName("http://ws.bay.dev/","SayRPCImplService");

        Service service = Service.create(url,name);
        SayRPC   sayRPC = service.getPort(SayRPC.class);

        System.out.println(sayRPC.sayOutLoud());
    }
}
