/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import affichage.Fenetre;
import affichage.Jeu;
import affichage.Joueur;
import affichage.Valider;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author HARDY
 */
public class ValideChoix implements MouseListener{
    Valider valide;

    public ValideChoix(Valider valide) {
        this.valide = valide;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        String ch=(String)this.valide.getChoix().getComboBoxValeur().getSelectedItem();
        int numch=0;
        int num=1;
        if(ch.equals("X")){
            numch=1;
            num=0;
        }
        
        Joueur[] joueurs=new Joueur[2];
        joueurs[0]=new Joueur("J1",numch,false);
        joueurs[1]=new Joueur("J2",num,false);
        
        Jeu jeu=new Jeu();
        jeu.setJoueurs(joueurs);
        
        Fenetre.principal.removeAll();
        Fenetre.principal.repaint();
        Fenetre.principal.revalidate();
        
        Fenetre.principal.add(jeu);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
