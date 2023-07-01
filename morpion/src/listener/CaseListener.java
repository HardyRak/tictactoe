/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listener;

import affichage.Case;
import affichage.Fenetre;
import affichage.Jeu;
import affichage.Joueur;
import affichage.PanelChoix;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author hardy
 */
public class CaseListener implements MouseListener{
    Case cases;

    public CaseListener(Case cases) {
        this.cases = cases;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(this.cases.getStatus()!=0){
            ImageIcon imageX=new ImageIcon(Jeu.tours+".png");
            
            JLabel label=new JLabel(imageX);
            this.cases.setImageX(imageX);
            this.cases.add(label);
            this.cases.repaint();
            this.cases.revalidate();
            this.cases.setStatus(0);
            
            if(this.cases.Asvainqueur()){
                Joueur vq=null;
                for(int i=0;i<this.cases.getJeux().getJoueurs().length;i++){
                    if(this.cases.getJeux().getJoueurs()[i].getChoix()==Jeu.tours){
                        vq=this.cases.getJeux().getJoueurs()[i];
                    }
                    
                }
                
                JOptionPane.showMessageDialog(this.cases.getJeux(),"Gagnant "+vq.getNom(),"Vainqueur",JOptionPane.INFORMATION_MESSAGE);
                Jeu.tours=1;
                Fenetre.principal.removeAll();
                Fenetre.principal.add(new PanelChoix());
                Fenetre.principal.repaint();
                Fenetre.principal.revalidate();
            }else{
                if(Jeu.tours==1){
                    Jeu.tours=0;
                }else{
                    Jeu.tours=1;
                }
            }
            
        }else{
            System.out.println("Case deja utlisE");
        }
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
