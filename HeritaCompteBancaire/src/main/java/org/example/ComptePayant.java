package org.example;

public class ComptePayant extends Compte {
    private static final double FRAIS = 5.0;

    public ComptePayant() {
        super();
    }

    public ComptePayant(double soldeInitial) {
        super(soldeInitial);
    }

    @Override
    public void deposer(double montant) {
        if (montant > FRAIS) {
            super.deposer(montant - FRAIS);
        } else {
            System.out.println("Montant trop faible pour couvrir les frais de dépôt.");
        }
    }

    @Override
    public void retirer(double montant) {
        if (montant > 0) {
            super.retirer(montant + FRAIS);
        } else {
            System.out.println("Montant invalide pour retrait.");
        }
    }

    @Override
    public String toString() {
        return "Compte Payant: " + super.toString() + " | Frais par opération: " + FRAIS + " DH";
    }
}
