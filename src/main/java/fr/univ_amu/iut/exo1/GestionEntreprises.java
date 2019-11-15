package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GestionEntreprises {
    public static void main(String[] args) {
        //throw new RuntimeException("Not yet implemented !");

        ArrayList liste = new ArrayList();
        Entreprise Enter = new Entreprise("La casa del Papel", liste);

        Employe fekir = new Employe(00012, "nabitz", "fekir", 5, LocalDate.of(2000, Month.APRIL, 4), LocalDate.of(2019, Month.APRIL, 9), 10, 35);

        Enter.embaucher(fekir);

        System.out.println(Enter.toString());

        Enter.licencier(fekir);

        System.out.println(Enter.toString());
    }
}