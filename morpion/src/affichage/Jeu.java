package affichage;


import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class Jeu extends JPanel {
    Case[][] cases;
    Joueur[] joueurs;
    public static int tours=1;
    
    public Joueur[] getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(Joueur[] joueurs) {
        this.joueurs = joueurs;
    }
    
    public Case[][] getCases() {
        return cases;
    }

    public void setCases(Case[][] cases) {
        this.cases = cases;
    }
    
    public Jeu() {
        setLayout(new GridLayout(3, 3, 5, 5));
        setBackground(Color.GRAY);

        cases = new Case[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Case casePanel = new Case(i,j);
                casePanel.setJeux(this);
                cases[i][j] = casePanel;
                add(casePanel);
            }
        }
    }
    public static Case[] caseLibre(){
        
    }
}