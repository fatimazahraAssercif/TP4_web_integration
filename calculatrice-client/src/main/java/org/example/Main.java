package org.example;

import com.example.client.ICalculatrice;
import com.example.client.CalculatriceImpService;

public class Main {
    public static void main(String[] args) {

        CalculatriceImpService service = new CalculatriceImpService();
        ICalculatrice port = service.getCalculatriceImpPort(); 

        System.out.println("50 + 40 = " + port.add(50, 40));
        System.out.println("6 x 7 = " + port.multiply(6, 7));
        System.out.println("100 - 35 = " + port.subtract(100, 35));
        System.out.println("20 / 4 = " + port.divide(20, 4));

        try {
            port.divide(10, 0);
        } catch (Exception e) {
            System.out.println("Erreur division par zero : " + e.getMessage());
        }
    }
}