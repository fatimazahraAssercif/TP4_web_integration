package org.example.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "org.example.ws.ICalculatrice")
public class CalculatriceImp implements ICalculatrice {

    @Override
    public double add(double x, double y) {
        System.out.println("Appel add(" + x + ", " + y + ")");
        return x + y;
    }

    @Override
    public double multiply(double x, double y) {
        System.out.println("Appel multiply(" + x + ", " + y + ")");
        return x * y;
    }

    @Override
    public double subtract(double x, double y) {
        System.out.println("Appel subtract(" + x + ", " + y + ")");
        return x - y;
    }

    @Override
    public double divide(double x, double y) throws ArithmeticException {
        System.out.println("Appel divide(" + x + ", " + y + ")");
        if (y == 0) {
            throw new ArithmeticException("Division par zéro impossible");
        }
        return x / y;
    }
}