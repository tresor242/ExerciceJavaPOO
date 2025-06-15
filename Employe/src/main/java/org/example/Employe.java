package org.example;
import java.time.LocalDate;
import java.time.Period;

public class Employe {
    // Attributs
    private String matricule;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;
    private double salaire;

    // Constructeur
    public Employe(String matricule, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    // Accesseurs (getters et setters)
    public String getMatricule() { return matricule; }
    public void setMatricule(String matricule) { this.matricule = matricule; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public LocalDate getDateNaissance() { return dateNaissance; }
    public void setDateNaissance(LocalDate dateNaissance) { this.dateNaissance = dateNaissance; }

    public LocalDate getDateEmbauche() { return dateEmbauche; }
    public void setDateEmbauche(LocalDate dateEmbauche) { this.dateEmbauche = dateEmbauche; }

    public double getSalaire() { return salaire; }
    public void setSalaire(double salaire) { this.salaire = salaire; }

    // Méthode pour calculer l'âge
    public int age() {
        return Period.between(dateNaissance, LocalDate.now()).getYears();
    }

    // Méthode pour calculer l'ancienneté
    public int anciennete() {
        return Period.between(dateEmbauche, LocalDate.now()).getYears();
    }

    // Méthode pour augmenter le salaire
    public void augmentationDuSalaire() {
        int ans = anciennete();
        if (ans < 5) {
            salaire *= 1.02;
        } else if (ans < 10) {
            salaire *= 1.05;
        } else {
            salaire *= 1.10;
        }
    }

    // Méthode pour afficher les informations
    public void afficherEmploye() {
        String nomFormate = nom.toUpperCase();
        String prenomFormate = prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase();

        System.out.println("Matricule : " + matricule);
        System.out.println("Nom complet : " + nomFormate + " " + prenomFormate);
        System.out.println("Age : " + age() + " ans");
        System.out.println("Ancienneté : " + anciennete() + " ans");
        System.out.println("Salaire : " + String.format("%.2f", salaire) + " DH");
    }
}

