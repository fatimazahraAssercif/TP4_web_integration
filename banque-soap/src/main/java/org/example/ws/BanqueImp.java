package org.example.ws;

import javax.jws.WebService;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@WebService(endpointInterface = "org.example.ws.IBanque")
public class BanqueImp implements IBanque {

    // Base de données simulée en mémoire
    private Map<String, Compte> comptes = new HashMap<>();

    // Constructeur — on crée 3 comptes de test
    public BanqueImp() {
        comptes.put("C001", new Compte("C001", 5000.0, new Date()));
        comptes.put("C002", new Compte("C002", 12000.0, new Date()));
        comptes.put("C003", new Compte("C003", 800.0, new Date()));
    }

    @Override
    public double consulterSolde(String idCompte) {
        Compte c = comptes.get(idCompte);
        if (c == null) throw new RuntimeException("Compte introuvable : " + idCompte);
        System.out.println("Consultation solde compte " + idCompte + " : " + c.getSolde());
        return c.getSolde();
    }

    @Override
    public boolean retirer(String idCompte, double montant) {
        Compte c = comptes.get(idCompte);
        if (c == null) throw new RuntimeException("Compte introuvable : " + idCompte);
        if (c.getSolde() < montant) {
            System.out.println("Solde insuffisant pour retrait de " + montant);
            return false;
        }
        c.setSolde(c.getSolde() - montant);
        System.out.println("Retrait de " + montant + " sur compte " + idCompte + " → solde : " + c.getSolde());
        return true;
    }

    @Override
    public boolean deposer(String idCompte, double montant) {
        Compte c = comptes.get(idCompte);
        if (c == null) throw new RuntimeException("Compte introuvable : " + idCompte);
        c.setSolde(c.getSolde() + montant);
        System.out.println("Dépôt de " + montant + " sur compte " + idCompte + " → solde : " + c.getSolde());
        return true;
    }

    @Override
    public Compte getCompte(String idCompte) {
        Compte c = comptes.get(idCompte);
        if (c == null) throw new RuntimeException("Compte introuvable : " + idCompte);
        System.out.println("Récupération compte " + idCompte);
        return c;
    }
}