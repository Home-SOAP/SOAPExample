package dev.bay.ws;

import javax.jws.WebService;

/**
 * Created by Саша on 03.09.2015.
 */
@WebService(endpointInterface = "dev.bay.ws.IMySoapService")
public class MySoapService implements IMySoapService {
    @Override
    public String function() {
        return "This is my service!";
    }
}
