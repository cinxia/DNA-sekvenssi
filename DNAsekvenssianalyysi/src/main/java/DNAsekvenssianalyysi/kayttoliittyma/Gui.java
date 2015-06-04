
package DNAsekvenssianalyysi.kayttoliittyma;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *Luokka sisältää graafisen käyttöliittymän.
 */
public class Gui extends JFrame implements ActionListener{
    
    private JButton lukunappi, kirjoitusnappi, analyysinappi;
    private ButtonGroup syotevalitsin;
    private JRadioButton tekstivalinta, tiedostovalinta;
    private JTextField tekstisyotekentta, tiedostosyotekentta, raporttitiedostokentta;
    private JLabel syotevalinta, raporttitiedosto, analyysivalinta;
    
    public Gui(){     
        JPanel paneeli = (JPanel)this.getContentPane();   
        paneeli.setLayout(new FlowLayout());
        
        //ikkunan asetukset
        this.setTitle("DNA-sekvenssin analysointityökalu");
        this.setSize(700, 500);
        this.setResizable(true);
        this.setLocation(100, 100);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        syotevalinta = new JLabel("Valitse mistä DNA-sekvenssi luetaan.");
        
        syotevalitsin = new ButtonGroup();
        tekstivalinta = new JRadioButton("Lue tekstikentästä", false);
        tiedostovalinta = new JRadioButton("Lue tiedostosta", false);
        syotevalitsin.add(tekstivalinta);
        syotevalitsin.add(tiedostovalinta);
        
        tekstisyotekentta = new JTextField("DNA-sekvenssi", 20);
        tiedostosyotekentta = new JTextField("Luettava tiedosto", 20);
        lukunappi = new JButton("Selaa");
        
        raporttitiedosto = new JLabel("Valise tiedosto, johon raportti kirjoitetaan.");
        raporttitiedostokentta = new JTextField("Tallennettava tiedosto");
        kirjoitusnappi = new JButton("Selaa");
        
        analyysivalinta = new JLabel("Valitse suoritettavat analyysit.");
        analyysinappi = new JButton("Suorita analyysi");
        analyysinappi.addActionListener(this);
        
        //komponenttien sijoittelu ikkunaan
        paneeli.add(syotevalinta);
        paneeli.add(tekstivalinta);
        paneeli.add(tekstisyotekentta);
        paneeli.add(tiedostovalinta);
        paneeli.add(tiedostosyotekentta);
        paneeli.add(lukunappi);
        paneeli.add(raporttitiedosto);
        paneeli.add(raporttitiedostokentta);
        paneeli.add(kirjoitusnappi);
        paneeli.add(analyysivalinta); 
        
        paneeli.add(analyysinappi);
        
    }
    
    public void actionPerformed(ActionEvent e){
        try{
            if (e.getSource()==analyysinappi){
            }
        }
        catch(Exception ex){
                
                }
        }
    
    
    public static void main(String[] args) {
                Gui kayttoliittyma = new Gui();
            }
}
