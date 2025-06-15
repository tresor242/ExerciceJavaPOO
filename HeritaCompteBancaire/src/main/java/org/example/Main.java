package org.example;

public class Main {
    public static void main(String[] args) {
        // Création des comptes
        Compte compteSimple = new Compte();
        CompteEpargne compteEpargne = new CompteEpargne(1000);
        ComptePayant comptePayant = new ComptePayant(500);

        // Dépôts
        compteSimple.deposer(200);
        compteEpargne.deposer(300);
        comptePayant.deposer(100);

        // Retraits
        compteSimple.retirer(50);
        compteEpargne.retirer(100);
        comptePayant.retirer(50);

        // Calcul d'intérêt sur compte épargne
        compteEpargne.calculerInteret();

        // Affichage des soldes
        System.out.println(compteSimple);
        System.out.println(compteEpargne);
        System.out.println(comptePayant);
    }
}
