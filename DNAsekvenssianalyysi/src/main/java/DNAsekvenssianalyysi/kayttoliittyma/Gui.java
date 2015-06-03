
package DNAsekvenssianalyysi.kayttoliittyma;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *Luokka sisältää graafisen käyttöliittymän.
 */
public class Gui extends JFrame implements ActionListener{ // Herjaa jotakin!!!!!
    
    private JButton lukunappi, kirjoitusnappi, analyysinappi;
    private ButtonGroup SyoteValinta;
    private JRadioButton tekstiSyote, tiedostoSyote;
    private JTextField tekstisyotekentta, tiedostosyotekentta, kohdetiedostokentta;
    private JLabel tekstisyote, tiedostosyote, kohdetiedosto;
    
    public Gui(){     
        JPanel paneeli = (JPanel)this.getContentPane();   
        paneeli.setLayout(new FlowLayout());
        
        this.setTitle("DNA-sekvenssin analysointityökalu");
        this.setSize(500, 500);
        this.setResizable(true);
        this.setLocation(100, 100);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        analyysinappi = new JButton("");
        paneeli.add(analyysinappi);
        analyysinappi.addActionListener(this);
    }
    
    public void ActionPerformed(ActionEvent e){
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
