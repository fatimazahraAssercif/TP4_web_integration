package org.example.ws;

import javax.xml.ws.Endpoint;

public class ServeurBanque {
    public static void main(String[] args) {
        String url = "http://localhost:9001/banque";
        System.out.println("Démarrage du serveur Banque...");
        Endpoint.publish(url, new BanqueImp());
        System.out.println("Service SOAP démarré sur : " + url);
        System.out.println("WSDL disponible sur      : " + url + "?wsdl");
    }
}