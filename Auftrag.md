Arbeitsauftrag:

Beobachte das Objektspiel zum Second Hand Shop und beantworte folgende Fragen:

1. Wie entwickelt sich die Länge der Datenstruktur? Spielt die Länge der Datenstruktur eine Rolle zur Verwaltung der Elemente?
	
	Die Länge verkürzt sich normalerweise mit der Zeit, solange sich keine neuen Kunden anstellen (Dynamische Länge). Dann würde er sich verlängern. 
	Insgesamt macht die Länge der Datenstruktur keinen Unterschied außer, dass die neueren Befehle erst später ausgeführt werden. Es stellt sich hinten einer an und
	der Erste wird drangenommen.

2. Wie werden neue Elemente hinzugefügt?

	Es gibt einen Befehl vom Verwaltungsobjekt, mit dem neue Elemente ans Ende der Datenstruktur angehängt werden können. Für das erste Element gibt es noch einen 
	Sonderbefehl.

3. Auf welche Elemente wird Zugegriffen?

	Es wird immer auf das erste Element der Struktur zugegriffen - also das, das am weitesten vorne in der Schlange ist. Alle Elemente sind im Beispiel vom gleichen Typen. 

4. Welche Beziehungen der Elemente gibt es untereinander?

	Ein Element kennt das Element, das vor ihm in der Schlange steht (Vorgänger) und/oder seinen Nachfolger (je nachdem was vom Programmierer bevorzugt wird), 
	und seinen Inhalt (Bsp.: Bestellbestätigung).

5. Welche Elemente müsste ein Verwaltungselement kennen?

	Jedes Element? Erstes und letztes kennt das Verwaltungselement auf jeden Fall.
	Das Verwaltungsobjekt kennt den Inhalt eines Elementes nicht.
	Es wird nie die Position aller Elemente benötigt (nur die des Ersten und des Letzten)

6. Nach welchem Prinzip arbeitet die Datenstruktur? Wie nennt man eine solche Datenstruktur?

	- Warteschlange (Queue)
	- FIFO: First In First Out

7. Welche (Verwaltungs)Operationen sind für diese Datenstruktur sinnvoll? 

	- Elemente ans Ende anstellen lassen
	- Das erste Element entfernen
	- prüfen, ob Schlange leer ist
	- aufrücken lassen
	- get-Methode: erstes Element geben



- Vorgänger/Nachfolger wirklich benötigt?
	- Je nach Präferenz nur eines oder beides
- Was müssen Elemente können?
	- Vorgänger geben bzw. Vorgänger ja/nein
	- Nachfolger geben bzw. Nachfolger ja/nein




Durch Zeiger kann man auf Objekte zugreifen. 
Bsp.: Zeiger "Aktiver Spieler" zeigt auf Spieler 1. Der würfelt. Zeiger "Aktiver Spieler" fragt Spieler 1, wer als nächstes kommt. Dasselbe passiert mit Spieler 2. 