package affichage;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
       public static JPanel principal;
       
       public Fenetre() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
           setResizable(false);
        Fenetre.principal=new JPanel();
        // Création de la fenêtre parente
//        Jeu panelMere = new Jeu();
//        add(panelMere);
        PanelChoix panelChoix = new PanelChoix();
        Fenetre.principal.add(panelChoix,BorderLayout.NORTH);
        
        this.add(Fenetre.principal);
        setVisible(true);
    }
}