DNA-sekvenssin analysointityökalun käyttöohjeet


Ohjelmalla voidaan analysoida käyttäjän syöttämää DNA-sekvenssiä ja tallentaa analyysin tulokset tekstitiedostoon.

Valitse syötetäänkö DNA-sekvenssi suoraan sille varattuun tekstikenttään ("Lue tekstikentästä") vai luetaanko se tekstitiedostosta ("Lue tiedostosta").
Vain toinen vaihtoehdoista voi olla kerrallaan valittuna. Jos valintaa ei tehdä, ohjelma ilmoittaa siitä eikä suorita analyysejä.
DNA-sekvenssi voidaan kirjoittaa suoraan sille varattuun tekstikenttään, jossa lukee "Syötä DNA-sekvenssi tähän".
Ohjelma hyväksyy sekä isoilla että pienillä kirjaimilla kirjoitetun sekvenssin.
Luettavan tekstitiedosto tiedostopolun voi kirjoittaa sille varattuun tekstikenttään tai jos tiedoston haluaa valita tietokoneelta,
voi painaa kentän vieressä olevaa "Selaa"-nappia, jolloin ilmestyy ikkuna tiedostojen selaamiseen. 
Ohjelma hyväksyy vain tekstitiedostot, joiden tiedostopääte on ".txt".

Valitse tekstitiedosto (".txt"), johon analyysin tulokset tallennetaan. 
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
Pyrimidiini-puriinisuhde tarkoittaa pyrimidiiniemästen (A ja G) lukumäärän suhdetta puriiniemäksiin (T ja C).
Vastinjuoste tarkoittaa DNA-sekvenssin vastinjuosteen sekvenssiä. 
Lähetti-RNA on DNA-sekvenssiä suoraan vastaava RNA-sekvenssi, eikä ohjelma ota huomioon proteiinisynteesin aikana tapahtuvaa eukaryooteille ominaista intronien poistamista.
Siten myös ohjelman tuottama aminohappoketju on DNA-sekvenssin mukainen eikä huomioi lähetti-RNA:ssa tapahtuvia muutoksia.
Koska aminohapot vastaavat kolmen emäksen kodoneita, lähetti-RNA:sta tarkistetaan sen kolmella jaollisuus.
Jos se ei ole kolmella jaollinen, ylimääräiset emäkset jätetään pois aminohappoketjuksi muutettavasta sekvenssistä. 
Lähetti-RNA-sekvenssi sisältää kuitenkin kaikki emäkset.
Aminohapot on merkitty aminohappoketjuun niiden yksikirjaimisilla tunnuksilla.
Huomioi, että kolmea lopetuskodonia ei vastaa yksikään aminohappo.
Jos tällainen lopetuskodoni on lähetti-RNA:n alussa tai keskellä, ohjelma jatkaa kuitenkin aminohappoketjun rakentamista loppuun asti,
eikä ilmoita mahdollisesta ennenaikaisesta lopetuskodonista, joka todellisuudessa olisi keskeyttänyt aminohappoketjun rakentamisen.


Lopuksi paina "Suorita analyysi"-nappia.
Ohjelma ilmoittaa jos tietojen syöttämisessä kuten tiedostopoluissa on ongelmia. 
Jos näissä ei ole havaittuja ongelmia, suoritetaan analyysi.
Ohjelma ilmoittaa onko analyysiraportti suoritettu onnistuneesti vai onko DNA:n lukemisessa tai raportin kirjoittamisessa ollut ongelmia.
Jos DNA:n lukemisessa on ollut ongelmia (esim. sekvenssissä on muita merkkejä kuin A, T, C ja G) ohjelma tuottaa tyhjän raporttitiedoston.




 