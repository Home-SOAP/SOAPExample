package dev.bay.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "dev.bay.ws.SayHello")
public class SayHelloImpl implements SayHello{
    @Override
    public String hi() {
        return "Hey there, sweety!";
    }

    @Override
    public void printOut() {
        System.out.println("Is that what you wanted to see?");
    }
}
