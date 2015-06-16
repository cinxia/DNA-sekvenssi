DNA-sekvenssin analysointity�kalun k�ytt�ohjeet


Ohjelmalla voidaan analysoida k�ytt�j�n sy�tt�m�� DNA-sekvenssi� ja tallentaa analyysin tulokset tekstitiedostoon.

Valitse sy�tet��nk� DNA-sekvenssi suoraan sille varattuun tekstikentt��n ("Lue tekstikent�st�") vai luetaanko se tekstitiedostosta ("Lue tiedostosta").
Vain toinen vaihtoehdoista voi olla kerrallaan valittuna. Jos valintaa ei tehd�, ohjelma ilmoittaa siit� eik� suorita analyysej�.
DNA-sekvenssi voidaan kirjoittaa suoraan sille varattuun tekstikentt��n, jossa lukee "Sy�t� DNA-sekvenssi t�h�n".
Ohjelma hyv�ksyy sek� isoilla ett� pienill� kirjaimilla kirjoitetun sekvenssin.
Luettavan tekstitiedosto tiedostopolun voi kirjoittaa sille varattuun tekstikentt��n tai jos tiedoston haluaa valita tietokoneelta,
voi painaa kent�n vieress� olevaa "Selaa"-nappia, jolloin ilmestyy ikkuna tiedostojen selaamiseen. 
Ohjelma hyv�ksyy vain tekstitiedostot, joiden tiedostop��te on ".txt".

Valitse tekstitiedosto (".txt"), johon analyysin tulokset tallennetaan. 
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
Pyrimidiini-puriinisuhde tarkoittaa pyrimidiiniem�sten (A ja G) lukum��r�n suhdetta puriiniem�ksiin (T ja C).
Vastinjuoste tarkoittaa DNA-sekvenssin vastinjuosteen sekvenssi�. 
L�hetti-RNA on DNA-sekvenssi� suoraan vastaava RNA-sekvenssi, eik� ohjelma ota huomioon proteiinisynteesin aikana tapahtuvaa eukaryooteille ominaista intronien poistamista.
Siten my�s ohjelman tuottama aminohappoketju on DNA-sekvenssin mukainen eik� huomioi l�hetti-RNA:ssa tapahtuvia muutoksia.
Koska aminohapot vastaavat kolmen em�ksen kodoneita, l�hetti-RNA:sta tarkistetaan sen kolmella jaollisuus.
Jos se ei ole kolmella jaollinen, ylim��r�iset em�kset j�tet��n pois aminohappoketjuksi muutettavasta sekvenssist�. 
L�hetti-RNA-sekvenssi sis�lt�� kuitenkin kaikki em�kset.
Aminohapot on merkitty aminohappoketjuun niiden yksikirjaimisilla tunnuksilla.
Huomioi, ett� kolmea lopetuskodonia ei vastaa yksik��n aminohappo.
Jos t�llainen lopetuskodoni on l�hetti-RNA:n alussa tai keskell�, ohjelma jatkaa kuitenkin aminohappoketjun rakentamista loppuun asti,
eik� ilmoita mahdollisesta ennenaikaisesta lopetuskodonista, joka todellisuudessa olisi keskeytt�nyt aminohappoketjun rakentamisen.


Lopuksi paina "Suorita analyysi"-nappia.
Ohjelma ilmoittaa jos tietojen sy�tt�misess� kuten tiedostopoluissa on ongelmia. 
Jos n�iss� ei ole havaittuja ongelmia, suoritetaan analyysi.
Ohjelma ilmoittaa onko analyysiraportti suoritettu onnistuneesti vai onko DNA:n lukemisessa tai raportin kirjoittamisessa ollut ongelmia.
Jos DNA:n lukemisessa on ollut ongelmia (esim. sekvenssiss� on muita merkkej� kuin A, T, C ja G) ohjelma tuottaa tyhj�n raporttitiedoston.




 