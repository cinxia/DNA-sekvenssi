Aihe: DNA-sekvenssin analysointityökalu

Toteutettavalla ohjelmalla voidaan analysoida käyttäjän syöttämää DNA-sekvenssiä. 
DNA-sekvenssi voidaan syöttää suoraan ohjelmaan tai se voidaan lukea käyttäjän valitsemasta tekstitiedostosta. 
Ohjelma ilmoittaa mahdollisista virhetilanteista.
Ohjelma tarkistaa, että merkkijono on todellakin DNA-sekvenssi ja virheellisestä syötteestä huomautetaan käyttäjää.

DNA-sekvenssistä voidaan laskea sen pituus, emäskoostumus, GC-osuus ('GC content'), pyrimidiini-puriinisuhde, vastinjuosteen sekvenssi, 
vastaavan lähetti-RNA:n sekvenssi ja sitä vastaava aminohappojärjestys.

Analyysin tulokset tallennetaan loppuraportiksi käyttäjän nimeämään tekstitiedostoon. 
Raportin kirjoittamisen onnistumisesta ilmoitetaan käyttäjälle.


Rakenne:

Graafinen käyttöliittymä koostuu yhdestä Gui-luokasta, joka sijaitsee kayttoliittyma-pakkauksessa.
Gui on yhteydessä sovelluslogiikkaa ohjausolion välityksellä.

Logiikka-pakkaus sisältää ohjausolion, joka ohjaa muiden saman pakkauksen luokkien toimintaa.
Näitä ovat luokat DnaSekvenssi, Aminohappomuunnin, Tiedostonlukija ja Tiedostokirjoitin, jotka vastaavat DNA-sekvenssin analysoinnista ja raporttitiedoston luomisesta.


