package org.example.ws;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService  // Déclare cette interface comme contrat d'un Web Service SOAP
public interface ICalculatrice {

    @WebMethod  // Expose cette méthode comme opération SOAP
    double add(@WebParam(name = "nbr1") double x,
               @WebParam(name = "nbr2") double y);
    // @WebParam donne un nom explicite aux paramètres dans le WSDL/XML

    @WebMethod
    double multiply(@WebParam(name = "nbr1") double x,
                    @WebParam(name = "nbr2") double y);

    // À COMPLÉTER — Question 5 du TP :
    @WebMethod
    double subtract(@WebParam(name = "nbr1") double x,
                    @WebParam(name = "nbr2") double y);

    @WebMethod
    double divide(@WebParam(name = "nbr1") double x,
                  @WebParam(name = "nbr2") double y) throws ArithmeticException;
    // throws ArithmeticException = gestion du cas division par zéro
}