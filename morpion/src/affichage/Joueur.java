package affichage;

import java.util.Vector;

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
    
    public int[] moveIA(Vector<Integer> xIA,Vector<Integer>yIA,Vector<Integer> xPlay,Vector<Integer>yPlay,Jeu jeu,boolean maximise){
        Case[] libre=jeu.caseLibre();
        int meilleurScore=0;
         int[] bestMove = new int[] { -1, -1 };
        if(maximise){
            meilleurScore=Integer.MIN_VALUE;
            for(int i=0;i<libre.length;i++){
                Case cs=libre[i];
                xIA.add(cs.getI());
                yIA.add(cs.getJ());
                int[] score=moveIA(xIA,yIA,xPlay,yPlay,jeu,false);
                if (score[0] > meilleurScore) {
                    meilleurScore = score[0];
                    bestMove[0] = cs.getI();
                    bestMove[1] = cs.getJ();
                }
                xIA.remove(xIA.size()-1);
                yIA.remove(yIA.size()-1);
            }
        }else{
            meilleurScore=Integer.MAX_VALUE;
            for(int i=0;i<libre.length;i++){
                 Case cs=libre[i];
                 xPlay.add(cs.getI());
                 yPlay.add(cs.getJ());
                 int[] score=moveIA(xIA,yIA,xPlay,yPlay,jeu,true);
                if (score[0] < meilleurScore) {
                    meilleurScore = score[0];
                    bestMove[0] = cs.getI();
                    bestMove[1] = cs.getJ();
                }
                xPlay.remove(xPlay.size()-1);
                yPlay.remove(yPlay.size()-1);
                
            }
        }
        return bestMove;
    }
    
}
