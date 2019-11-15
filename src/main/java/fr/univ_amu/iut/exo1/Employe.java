package fr.univ_amu.iut.exo1;

import java.time.LocalDate;


public class Employe {
    static int indexEmp = 0;
    private int numSecu;
    private int numEmploye;
    private String nomEmploye;
    private String prenomEmploye;
    private int echelon;
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;
    private double base;
    private double nbHeures;
    private double SalaireBrut;
    private double SalaireNet;

    public String getNomEmploye(){
        return this.nomEmploye;
    }

    public String getPrenomEmploye(){
        return this.prenomEmploye;
    }

    public double getSalaireBrut(){
        return this.SalaireBrut;
    }

    public double getSalaireNet(){
        return this.SalaireNet;
    }

    public Employe (int numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double nbHeures) {
        this.numEmploye = ++indexEmp;
        this.numSecu = numSecu;
        this.nomEmploye = nom;
        this.prenomEmploye = prenom;
        this.echelon = echelon;
        this.dateEmbauche = dateEmbauche;
        this.dateNaissance = dateNaissance;
        this.base = base;
        this.nbHeures = nbHeures;

        this.SalaireBrut = this.base * this.nbHeures * 4;
        this.SalaireNet = this.SalaireBrut * 0.8;
    }



}
