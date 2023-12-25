package org.example;

import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;

import java.util.List;

public class ClientWs {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWs().getBanqueServicePort();
        System.out.println(proxy.conversionEuToDH(200));
        Compte cp = proxy.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        System.out.println(cp.getDateCreation());
        List<Compte> lc = proxy.listComptes();
        for(Compte c : lc){
            System.out.println("-------------");
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
            System.out.println(c.getDateCreation());
        }
    }
}
