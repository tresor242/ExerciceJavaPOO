package org.example;

public class CompteEpargne extends Compte {
    private double tauxInteret = 6.0;

    public CompteEpargne() {
        super();
    }

    public CompteEpargne(double soldeInitial) {
        super(soldeInitial);
    }

    public CompteEpargne(double soldeInitial, double tauxInteret) {
        super(soldeInitial);
        if (tauxInteret > 0) {
            this.tauxInteret = tauxInteret;
        }
    }

    public void calculerInteret() {
        double interet = getSolde() * tauxInteret / 100;
        deposer(interet);
    }

    @Override
    public String toString() {
        return "Compte Epargne: " + super.toString() + " | Taux: " + tauxInteret + "%";
    }
}
