DNA-sekvenssin analysointity�kalun k�ytt�ohjeet


Ohjelmalla voidaan analysoida DNA-sekvenssi� ja tallentaa analyysin tulokset tekstitiedostoon.

Valitse sy�tet��nk� DNA-sekvenssi suoraan sille varattuun tekstikentt��n ("Lue tekstikent�st�") vai luetaanko se tekstitiedostosta ("Lue tiedostosta").
Vain toinen vaihtoehdoista voi olla kerrallaan valittuna. Jos valintaa ei tehd�, ohjelma ilmoittaa siit� eik� suorita analyysej�.
DNA-sekvenssi voidaan kirjoittaa suoraan sille varattuun tekstikentt��n, jossa lukee "Sy�t� DNA-sekvenssi t�h�n".
Luettavan tekstitiedosto tiedostopolun voi kirjoittaa sille varattuun tekstikentt��n tai jos tiedoston haluaa valita tietokoneelta,
voi painaa kent�n vieress� olevaa "Selaa"-nappia, jolloin ilmestyy ikkuna tiedostojen selaamiseen. 
Ohjelma hyv�ksyy vain tekstitiedostot, joiden tiedostop��te on ".txt".

Valitse tekstitiedosto (".txt"-p��te), johon analyysin tulokset tallennetaan. 
Tiedostopolku voidaan kirjoittaa suoraan tekstikentt��n tai tiedosto voidaan valita tietokoneelta painamalla "Selaa"-nappia ja valitsemalla haluttu tiedosto.
Raportin tallennukseen k�ytett�v� tiedosto voi olla jo olemassa oleva tiedosto tai sit� varten voidaan luoda uusi tiedosto.
Jos valitaan jo olemassa oleva tekstitiedosto, niin tulosraportti kirjoitetaan tiedoston loppuun.

Valitse analyysit, jotka halutaan laskea. 
Ohjelma tallentaa jokaiseen raporttiin sy�tetyn DNA-sekvenssin, sen pituuden ja em�sfrekvenssit.
N�iden lis�ksi voi valita lis�t��nk� raporttiin GC-osuus ('GC content'), pyrimidiini-puriinisuhde, 
DNA-sekvenssin vastinjuosteen sekvenssi, sekvenssi� vastaavan l�hetti-RNA:n sekvenssi ja l�hetti-RNA:ta vastaava aminohappoketju.
Oletuksena suoritetaan kaikki analyysit.

Analyysien kuvaukset:
Ohjelma hyv�ksyy sek� pienill� ett� isoilla kirjaimilla kirjoitetun DNA-sekvenssin.
GC-osuus tarkoittaa guaniini- ja sytosiiniem�sten osuutta kaikista em�ksist�.
Pyrimidiini-puriinisuhde tarkoittaa pyrimidiiniem�sten lukum��r�n suhdetta purimidiiniem�ksiin.
Vastinjuoste tarkoittaa DNA-sekvenssin vastinjuostetta. 
L�hetti-RNA on DNA-sekvenssi� suoraan vastaava RNA-sekvenssi eik� ota huomioon proteiinisynteesin aikana tapahtuvaa eukaryooteille ominaista intronien poistamista.
Siten my�s ohjelman tuottama aminohappoketju on DNA-sekvenssin mukainen eik� huomioi l�hetti-RNA:ssa tapahtuvia muutoksia.
Koska aminohapot koostuvat kolmen em�ksen kodoneista, l�hetti-RNA:sta tarkistetaan sen kolmella jaollisuus.
Jos se ei ole kolmella jaollinen, ylim��r�iset em�kset j�tet��n pois aminohappketjuksi muutettavasta sekvenssist�. 
L�hetti-RNA-sekvenssi sis�lt�� kuitenkin kaikki em�kset.
Aminohapot on merkitty niiden yksikirjaimisilla tunnuksilla.

Lopuksi paina "Suorita analyysi"-nappia. 
Ohjelma ilmoittaa onko raportti suoritettu onnistuneesti vai onko DNA:n lukemisessa tai raportin kirjoittamisessa ollut ongelmia.
Jos DNA:n lukemisessa on ollut ongelmia ohjelma tuottaa tyhj�n raporttitiedoston.




 