package org.example;

public class Compte {
    private static int compteur = 0;
    private final int code;
    private double solde;

    public Compte() {
        compteur++;
        this.code = compteur;
        this.solde = 0;
    }

    public Compte(double soldeInitial) {
        compteur++;
        this.code = compteur;
        this.solde = soldeInitial;
    }

    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            System.out.println("Montant invalide pour dépôt.");
        }
    }

    public void retirer(double montant) {
        if (montant > 0) {
            solde -= montant;
        } else {
            System.out.println("Montant invalide pour retrait.");
        }
    }

    @Override
    public String toString() {
        return "Compte N°" + code + " - Solde: " + solde + " DH";
    }
}
