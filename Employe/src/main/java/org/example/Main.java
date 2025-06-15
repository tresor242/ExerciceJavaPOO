package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employe emp = new Employe(
                "EMP001",
                "dupont",
                "jean",
                LocalDate.of(1990, 5, 20),
                LocalDate.of(2016, 3, 15),
                8000.00
        );

        emp.afficherEmploye();

        System.out.println("\nAugmentation du salaire...");
        emp.augmentationDuSalaire();

        emp.afficherEmploye();
    }
}
