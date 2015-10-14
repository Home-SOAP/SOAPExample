package dev.bay.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "dev.bay.ws.SayRPC")
public class SayRPCImpl implements SayRPC{

    @Override
    public String sayOutLoud() {
        return "I'm in RPC style. Sooo much swaaag!";
    }
}
