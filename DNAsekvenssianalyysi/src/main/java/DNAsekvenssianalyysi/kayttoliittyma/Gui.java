
package DNAsekvenssianalyysi.kayttoliittyma;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

/**
 *Luokka sisältää graafisen käyttöliittymän.
 */
public class Gui extends JFrame implements ActionListener{
    
    private JButton lukunappi, kirjoitusnappi, analyysinappi;
    private ButtonGroup syotevalitsin;
    private JRadioButton tekstivalinta, tiedostovalinta;
    private JTextField tekstisyotekentta, tiedostosyotekentta, raporttitiedostokentta;
    private JLabel syoteteksti, raporttiteksti, analyysiteksti;
    private JCheckBox gcOsuus, pyrPurSuhde, vastinjuoste, lahettiRna, aminohappoketju;
    private JFileChooser tiedostoselain;
    
    public Gui(){     
        JPanel paneeli = (JPanel)this.getContentPane();   
        
        //layout
        GroupLayout layout = new GroupLayout(paneeli);
        paneeli.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        //ikkunan asetukset
        this.setTitle("DNA-sekvenssin analysointityökalu");
        this.setSize(500, 400);
        this.setResizable(true);
        this.setLocation(100, 0);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        syoteteksti = new JLabel("Valitse mistä DNA-sekvenssi luetaan.");
        
        syotevalitsin = new ButtonGroup();
        tekstivalinta = new JRadioButton("Lue tekstikentästä", false);
        tiedostovalinta = new JRadioButton("Lue tiedostosta", false);
        syotevalitsin.add(tekstivalinta);
        syotevalitsin.add(tiedostovalinta);
        
        tekstisyotekentta = new JTextField("Syötä DNA-sekvenssi tähän", 20);
        tiedostosyotekentta = new JTextField("", 20);
        lukunappi = new JButton("Selaa");
        lukunappi.addActionListener(this);
        
        tiedostoselain = new JFileChooser();
        
        raporttiteksti = new JLabel("Valise tiedosto, johon raportti kirjoitetaan.");
        raporttitiedostokentta = new JTextField("");
        kirjoitusnappi = new JButton("Selaa");
        kirjoitusnappi.addActionListener(this);
        
        analyysiteksti = new JLabel("Valitse suoritettavat analyysit.");
        
        gcOsuus = new JCheckBox("GC-osuus");
        pyrPurSuhde = new JCheckBox("Pyrimidiini-puriinisuhde");
        vastinjuoste = new JCheckBox("Vastinjuosteen sekvenssi");
        lahettiRna = new JCheckBox("Lähetti-RNA:n sekvenssi");
        aminohappoketju = new JCheckBox("Lähetti-RNA:ta vastaava aminohappoketju");
        
        
        analyysinappi = new JButton("Suorita analyysi");
        analyysinappi.addActionListener(this);
        
        //horisontaalinen järjestys
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(syoteteksti)
                    .addComponent(tekstivalinta)
                    .addComponent(tekstisyotekentta)
                    .addComponent(tiedostovalinta)
                    .addComponent(tiedostosyotekentta)
                    .addComponent(raporttiteksti)
                    .addComponent(raporttitiedostokentta)
                    .addComponent(analyysiteksti) 
                    .addComponent(gcOsuus)
                    .addComponent(pyrPurSuhde)
                    .addComponent(vastinjuoste)
                    .addComponent(lahettiRna)
                    .addComponent(aminohappoketju)
                    .addComponent(analyysinappi))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lukunappi)
                    .addComponent(kirjoitusnappi))
                
        );
        
        // vertikaalinen järjestys
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(syoteteksti)
                .addComponent(tekstivalinta)
                .addComponent(tekstisyotekentta)
                .addComponent(tiedostovalinta)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(tiedostosyotekentta)
                    .addComponent(lukunappi))
                .addComponent(raporttiteksti)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(raporttitiedostokentta)
                    .addComponent(kirjoitusnappi))
                .addComponent(analyysiteksti)
                .addComponent(gcOsuus)
                .addComponent(pyrPurSuhde)
                .addComponent(vastinjuoste)
                .addComponent(lahettiRna)
                .addComponent(aminohappoketju)
                .addComponent(analyysinappi)
        );
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
            if (e.getSource()==lukunappi){
                int paluuarvo = tiedostoselain.showOpenDialog(null);
                if (paluuarvo == JFileChooser.APPROVE_OPTION){
                    File avattavaTiedosto = tiedostoselain.getSelectedFile();
                    tiedostosyotekentta.setText(avattavaTiedosto.getPath());  
                }
                    
            }
            if (e.getSource()==kirjoitusnappi){
                int paluuarvo = tiedostoselain.showSaveDialog(null);
                if (paluuarvo == JFileChooser.APPROVE_OPTION){
                    File tallennettavaTiedosto = tiedostoselain.getSelectedFile();
                    raporttitiedostokentta.setText(tallennettavaTiedosto.getPath());
                }
            }
            

    
            }
            
    public static void main(String[] args) {
                Gui kayttoliittyma = new Gui();
            }
}
