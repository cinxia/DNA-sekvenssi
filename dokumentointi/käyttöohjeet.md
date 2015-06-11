DNA-sekvenssin analysointityökalun käyttöohjeet


Ohjelmalla voidaan analysoida DNA-sekvenssiä ja tallentaa analyysin tulokset tekstitiedostoon.

Valitse syötetäänkö DNA-sekvenssi suoraan sille varattuun tekstikenttään ("Lue tekstikentästä") vai luetaanko se tekstitiedostosta ("Lue tiedostosta").
Vain toinen vaihtoehdoista voi olla kerrallaan valittuna. Jos valintaa ei tehdä, ohjelma ilmoittaa siitä eikä suorita analyysejä.
DNA-sekvenssi voidaan kirjoittaa suoraan sille varattuun tekstikenttään, jossa lukee "Syötä DNA-sekvenssi tähän".
Luettavan tekstitiedosto tiedostopolun voi kirjoittaa sille varattuun tekstikenttään tai jos tiedoston haluaa valita tietokoneelta,
voi painaa kentän vieressä olevaa "Selaa"-nappia, jolloin ilmestyy ikkuna tiedostojen selaamiseen. 
Ohjelma hyväksyy vain tekstitiedostot, joiden tiedostopääte on ".txt".

Valitse tekstitiedosto (".txt"-pääte), johon analyysin tulokset tallennetaan. 
Tiedostopolku voidaan kirjoittaa suoraan tekstikenttään tai tiedosto voidaan valita tietokoneelta painamalla "Selaa"-nappia ja valitsemalla haluttu tiedosto.
Raportin tallennukseen käytettävä tiedosto voi olla jo olemassa oleva tiedosto tai sitä varten voidaan luoda uusi tiedosto.
Jos valitaan jo olemassa oleva tekstitiedosto, niin tulosraportti kirjoitetaan tiedoston loppuun.

Valitse analyysit, jotka halutaan laskea. 
Ohjelma tallentaa jokaiseen raporttiin syötetyn DNA-sekvenssin, sen pituuden ja emäsfrekvenssit.
Näiden lisäksi voi valita lisätäänkö raporttiin GC-osuus ('GC content'), pyrimidiini-puriinisuhde, 
DNA-sekvenssin vastinjuosteen sekvenssi, sekvenssiä vastaavan lähetti-RNA:n sekvenssi ja lähetti-RNA:ta vastaava aminohappoketju.
Oletuksena suoritetaan kaikki analyysit.

Analyysien kuvaukset:
Ohjelma hyväksyy sekä pienillä että isoilla kirjaimilla kirjoitetun DNA-sekvenssin.
GC-osuus tarkoittaa guaniini- ja sytosiiniemästen osuutta kaikista emäksistä.
Pyrimidiini-puriinisuhde tarkoittaa pyrimidiiniemästen lukumäärän suhdetta purimidiiniemäksiin.
Vastinjuoste tarkoittaa DNA-sekvenssin vastinjuostetta. 
Lähetti-RNA on DNA-sekvenssiä suoraan vastaava RNA-sekvenssi eikä ota huomioon proteiinisynteesin aikana tapahtuvaa eukaryooteille ominaista intronien poistamista.
Siten myös ohjelman tuottama aminohappoketju on DNA-sekvenssin mukainen eikä huomioi lähetti-RNA:ssa tapahtuvia muutoksia.
Koska aminohapot koostuvat kolmen emäksen kodoneista, lähetti-RNA:sta tarkistetaan sen kolmella jaollisuus.
Jos se ei ole kolmella jaollinen, ylimääräiset emäkset jätetään pois aminohappketjuksi muutettavasta sekvenssistä. 
Lähetti-RNA-sekvenssi sisältää kuitenkin kaikki emäkset.
Aminohapot on merkitty niiden yksikirjaimisilla tunnuksilla.

Lopuksi paina "Suorita analyysi"-nappia. 
Ohjelma ilmoittaa onko raportti suoritettu onnistuneesti vai onko DNA:n lukemisessa tai raportin kirjoittamisessa ollut ongelmia.
Jos DNA:n lukemisessa on ollut ongelmia ohjelma tuottaa tyhjän raporttitiedoston.




 