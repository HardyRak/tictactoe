package affichage;

import java.awt.FlowLayout;
import javax.swing.*;
public class PanelChoix extends JPanel {
    JComboBox<String> comboBoxNiveau;
    JComboBox<String> comboBoxValeur;

    public JComboBox<String> getComboBoxNiveau() {
        return comboBoxNiveau;
    }

    public void setComboBoxNiveau(JComboBox<String> comboBoxNiveau) {
        this.comboBoxNiveau = comboBoxNiveau;
    }

    public JComboBox<String> getComboBoxValeur() {
        return comboBoxValeur;
    }

    public void setComboBoxValeur(JComboBox<String> comboBoxValeur) {
        this.comboBoxValeur = comboBoxValeur;
    }

    public PanelChoix() {
        setLayout(new FlowLayout());

        comboBoxNiveau = new JComboBox<>(new String[]{"Facile", "Moyen", "Difficile"});
        add(comboBoxNiveau);

        comboBoxValeur = new JComboBox<>(new String[]{"X", "O"});
        add(comboBoxValeur);

        Valider buttonValider = new Valider(this,"Valider");

        add(buttonValider);
    }
}