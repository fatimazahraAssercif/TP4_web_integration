package org.example.ws;

import javax.jws.WebService;

// endpointInterface pointe vers l'interface SEI définie ci-dessus
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

    // À COMPLÉTER — Question 7 :
    @Override
    public double subtract(double x, double y) {
        System.out.println("Appel subtract(" + x + ", " + y + ")");
        return x - y;
    }

    @Override
    public double divide(double x, double y) throws ArithmeticException {
        System.out.println("Appel divide(" + x + ", " + y + ")");
        if (y == 0) {
            // On lève une exception explicite plutôt que de retourner NaN
            throw new ArithmeticException("Division par zéro impossible");
        }
        return x / y;
    }
}