package affichage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hardy
 */
public class Joueur {
    String nom;
    int choix;
    boolean isIA;

    public boolean isIsIA() {
        return isIA;
    }

    public void setIsIA(boolean isIA) {
        this.isIA = isIA;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getChoix() {
        return choix;
    }

    public void setChoix(int choix) {
        this.choix = choix;
    }

    public Joueur(String nom, int choix,boolean isIA) {
        this.nom = nom;
        this.choix = choix;
        this.isIA=isIA;
    }
    
}
