package dev.bay.ws.publisher;

import dev.bay.ws.MySoapService;
import dev.bay.ws.SayHelloImpl;
import dev.bay.ws.SayRPCImpl;

import javax.xml.ws.Endpoint;

/**
 * {@link http://dev-bay.net/java/javaee/jax-ws/prostojj-primer-jax-ws-soap/}
 * **************************************************************************
 * Веб-сервис(endpoint) — содержит всю логику с которой вы будете работать, именно через него активируются запросы в базу данных, обработка данных и т.д.
 * Паблишер(publisher)  — сервис который загружает веб-сервис в сеть для общего к нему доступа.
 * Клиент(client)       — сервис который обращается к веб-сервису для получения того или иного результата.
 */
public class Publisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello", new SayHelloImpl());
        Endpoint.publish("http://localhost:9999/ws/rpc", new SayRPCImpl());
        Endpoint.publish("http://localhost:9999/ws/function", new MySoapService());
    }
}
