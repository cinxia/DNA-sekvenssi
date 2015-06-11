package DNAsekvenssianalyysi.kayttoliittyma;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import DNAsekvenssianalyysi.logiikka.*;

/**
 * Luokka sisältää graafisen käyttöliittymän.
 */
public class Gui extends JFrame implements ActionListener {

    private JButton lukunappi, kirjoitusnappi, analyysinappi;
    private ButtonGroup syotevalitsin;
    private JRadioButton tekstivalinta, tiedostovalinta;
    private JTextField tekstisyotekentta, tiedostosyotekentta, raporttitiedostokentta;
    private JLabel syoteteksti, raporttiteksti, analyysiteksti;
    private JCheckBox gcOsuus, pyrPurSuhde, vastinjuoste, lahettiRna, aminohappoketju;
    private JFileChooser tiedostoselain;
    private File avattavaTiedosto, tallennettavaTiedosto;

    public Gui() {
        JPanel paneeli = (JPanel) this.getContentPane();

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

        //komponentit sekvenssin lukemiseen
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

        //komponentit tiedostojen selaamiseen
        tiedostoselain = new JFileChooser();
        tiedostoselain.setAcceptAllFileFilterUsed(true);
        FileNameExtensionFilter filtteri = new FileNameExtensionFilter("Tekstitiedosto (*.txt)", "txt");
        tiedostoselain.addChoosableFileFilter(filtteri);

        //komponentit raportin kirjoittamiseen
        raporttiteksti = new JLabel("Valise tiedosto, johon raportti kirjoitetaan.");
        raporttitiedostokentta = new JTextField("");
        kirjoitusnappi = new JButton("Selaa");
        kirjoitusnappi.addActionListener(this);

        //komponentit analyyseihin
        analyysiteksti = new JLabel("Valitse suoritettavat analyysit.");
        gcOsuus = new JCheckBox("GC-osuus", true);
        pyrPurSuhde = new JCheckBox("Pyrimidiini-puriinisuhde", true);
        vastinjuoste = new JCheckBox("Vastinjuosteen sekvenssi", true);
        lahettiRna = new JCheckBox("Lähetti-RNA:n sekvenssi", true);
        aminohappoketju = new JCheckBox("Lähetti-RNA:ta vastaava aminohappoketju", true);
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
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == lukunappi) {
            int paluuarvo = tiedostoselain.showOpenDialog(null);
            if (paluuarvo == JFileChooser.APPROVE_OPTION) {
                avattavaTiedosto = tiedostoselain.getSelectedFile();
                tiedostosyotekentta.setText(avattavaTiedosto.getPath());
            }

        }
        if (e.getSource() == kirjoitusnappi) {
            int paluuarvo = tiedostoselain.showSaveDialog(null);
            if (paluuarvo == JFileChooser.APPROVE_OPTION) {
                tallennettavaTiedosto = tiedostoselain.getSelectedFile();
                raporttitiedostokentta.setText(tallennettavaTiedosto.getPath());
            }
        }
        if (e.getSource() == analyysinappi) {
            if (tekstivalinta.isSelected()) {
                if (tekstisyotekentta.getText().isEmpty()
                        || tekstisyotekentta.getText().equals("Syötä DNA-sekvenssi tähän")) {
                    JOptionPane.showMessageDialog(null, "Et ole syöttänyt DNA-sekvenssiä.");
                } else {
                    if (raporttitiedostokentta.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Kirjoitettavaa tiedostoa ei ole valittu.");
                    } else {
                        if (!raporttitiedostokentta.getText().toLowerCase().endsWith(".txt")) {
                            JOptionPane.showMessageDialog(null, "Tallennettavan tiedoston pääte ei ole .txt-muotoa.");
                        } else {
                            File tallennustiedostoKentasta = new File(raporttitiedostokentta.getText());
                            Ohjausolio kenttaohjaaja = new Ohjausolio(tekstisyotekentta.getText(),
                                    null, tallennustiedostoKentasta);
                            teeRaportti(kenttaohjaaja);
                        }
                    }
                }
            } else {
                if (tiedostovalinta.isSelected()) {
                    if (tiedostosyotekentta.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Luettavaa tiedostoa ei ole valittu.");
                    } else {
                        if (raporttitiedostokentta.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Kirjoitettavaa tiedostoa ei ole valittu.");
                        } else {
                            File tiedostoLuettava = new File(tiedostosyotekentta.getText());
                            if (tiedostoLuettava.exists() && tiedostoLuettava.getPath().toLowerCase().endsWith(".txt")) {
                                if (!raporttitiedostokentta.getText().toLowerCase().endsWith(".txt")) {
                                    JOptionPane.showMessageDialog(null, "Kirjoitettavan tiedoston pääte ei ole .txt-muotoa.");
                                } else {
                                    File tallennustiedostoKentasta = new File(raporttitiedostokentta.getText());
                                    Ohjausolio tiedostoohjaaja = new Ohjausolio("", tiedostoLuettava,
                                            tallennustiedostoKentasta);
                                    teeRaportti(tiedostoohjaaja);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Luettava tiedosto ei kelpaa.");
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Et ole valinnut mistä DNA-sekvenssi luetaan.");
                }
            }

        }

    }

    private void teeRaportti(Ohjausolio ohjaaja) {
        boolean raportinOnnistuminen = true;
        if (!ohjaaja.dnaSekvenssiKunnossa()) {
            JOptionPane.showMessageDialog(null, "DNA-sekvenssissä ongelmia");
            raportinOnnistuminen = false;
        } else {
            if (!ohjaaja.getTiedostonLukuOk()) {
                JOptionPane.showMessageDialog(null, "Tiedoston lukemisessa ongelmia");
                raportinOnnistuminen = false;
            } else {
                if (!ohjaaja.getTiedostonLuontiOk()) {
                    JOptionPane.showMessageDialog(null, "Kirjoitettavan tiedoston luomisessa ongelmia");
                    raportinOnnistuminen = false;
                }
            }
        }
        if (raportinOnnistuminen) {
            raportinOnnistuminen = ohjaaja.lisaaSyoteSekvenssi();
            raportinOnnistuminen = ohjaaja.lisaaSekvenssinPituus();
            raportinOnnistuminen = ohjaaja.lisaaEmasFrekvenssit();
            if (gcOsuus.isSelected()) {
                raportinOnnistuminen = ohjaaja.lisaaGCOsuus();
            }
            if (pyrPurSuhde.isSelected()) {
                raportinOnnistuminen = ohjaaja.lisaaPyrimidiiniPuriiniSuhde();
            }
            if (vastinjuoste.isSelected()) {
                raportinOnnistuminen = ohjaaja.lisaaVastinjuoste();
            }
            if (lahettiRna.isSelected()) {
                raportinOnnistuminen = ohjaaja.lisaaLahettiRna();
            }
            if (aminohappoketju.isSelected()) {
                raportinOnnistuminen = ohjaaja.lisaaAminohappoketju();
            }
            raportinOnnistuminen = ohjaaja.suljeKirjoitin();
        }
        if (raportinOnnistuminen) {
            JOptionPane.showMessageDialog(null, "Raportti tehty onnistuneesti.");
        } else {
            JOptionPane.showMessageDialog(null, "Raportin tekemisessä ongelmia");
        }
    }

    public static void main(String[] args) {
        Gui kayttoliittyma = new Gui();
    }
}
