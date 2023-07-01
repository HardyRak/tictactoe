/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package affichage;

import javax.swing.JButton;
import listener.ValideChoix;

/**
 *
 * @author HARDY
 */
public class Valider extends JButton{
   PanelChoix choix;

    public PanelChoix getChoix() {
        return choix;
    }

    public void setChoix(PanelChoix choix) {
        this.choix = choix;
    }
   
    public Valider(PanelChoix choix, String text) {
        super(text);
        this.choix = choix;
        ValideChoix mouse=new ValideChoix(this);
        this.addMouseListener(mouse);
    }
   
}
