
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
    private JLabel syoteteksti, raporttiteksti, analyysiteksti;
    
    public Gui(){     
        JPanel paneeli = (JPanel)this.getContentPane();   
       // paneeli.setLayout(new FlowLayout());
        GroupLayout layout = new GroupLayout(paneeli);
        paneeli.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        //ikkunan asetukset
        this.setTitle("DNA-sekvenssin analysointityökalu");
        this.setSize(700, 600);
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
        
        tekstisyotekentta = new JTextField("DNA-sekvenssi", 20);
        tiedostosyotekentta = new JTextField("Luettava tiedosto", 20);
        lukunappi = new JButton("Selaa");
        
        raporttiteksti = new JLabel("Valise tiedosto, johon raportti kirjoitetaan.");
        raporttitiedostokentta = new JTextField("Tallennettava tiedosto");
        kirjoitusnappi = new JButton("Selaa");
        
        analyysiteksti = new JLabel("Valitse suoritettavat analyysit.");
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
                    // lisää checkboxit tähän
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
                // checkboxit tähän
                .addComponent(analyysinappi)
        );
        
        
    }
    
    @Override
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
