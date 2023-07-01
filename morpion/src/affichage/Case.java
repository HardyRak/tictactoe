package affichage;


import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import listener.CaseListener;


public class Case extends JPanel {
    int status;
    ImageIcon imageX;
    int i;
    int j;
    Jeu jeux;

    public Jeu getJeux() {
        return jeux;
    }

    public void setJeux(Jeu jeux) {
        this.jeux = jeux;
    }
    
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
    
    public ImageIcon getImageX() {
        return imageX;
    }

    public void setImageX(ImageIcon imageX) {
        this.imageX = imageX;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
    
    public Case(int i,int j) {
        this.i=i;
        this.j=j;
        ImageIcon imageXx=new ImageIcon(".png");
        this.setImageX(imageXx);
        this.setStatus(1);
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setPreferredSize(new Dimension(100, 100));
        CaseListener mouse=new CaseListener(this);
        this.addMouseListener(mouse);
    }
    
    public boolean Asvainqueur(){
        String sary=this.getImageX().getDescription();
        int ii=this.getI();
        int jj=this.getJ();
        Case[][] cases=this.getJeux().getCases();
        if(cases[ii][0].getImageX().getDescription().equals(sary) &&
           cases[ii][1].getImageX().getDescription().equals(sary) &&
           cases[ii][2].getImageX().getDescription().equals(sary)
        ){
            return true;
        }
        if(cases[0][jj].getImageX().getDescription().equals(sary) &&
           cases[1][jj].getImageX().getDescription().equals(sary) &&
           cases[2][jj].getImageX().getDescription().equals(sary)   
        ){
            return true;
        }
        
        if((ii==jj || ii+jj==2)&&
           cases[0][0].getImageX().getDescription().equals(sary) &&
           cases[1][1].getImageX().getDescription().equals(sary) &&
           cases[2][2].getImageX().getDescription().equals(sary)
        ){
            return true;
        }
        if((ii==2-jj || ii+jj==2)&&
           cases[0][2].getImageX().getDescription().equals(sary) &&
           cases[1][1].getImageX().getDescription().equals(sary) &&
           cases[2][0].getImageX().getDescription().equals(sary)
        ){
            return true;
        }
        return false;
    }
}