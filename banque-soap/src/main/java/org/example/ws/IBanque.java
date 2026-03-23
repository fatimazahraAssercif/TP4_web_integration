package org.example.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IBanque {

    @WebMethod
    double consulterSolde(@WebParam(name = "idCompte") String idCompte);

    @WebMethod
    boolean retirer(@WebParam(name = "idCompte") String idCompte,
                    @WebParam(name = "montant") double montant);

    @WebMethod
    boolean deposer(@WebParam(name = "idCompte") String idCompte,
                    @WebParam(name = "montant") double montant);

    @WebMethod
    Compte getCompte(@WebParam(name = "idCompte") String idCompte);
}