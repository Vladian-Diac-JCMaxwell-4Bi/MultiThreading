# MultiThreading  TicTacToe
Il programma è basato sull'uso dei threads.
Ci sono 3 threads che partono in ordine prima TIC poi TAC e in fine TOE.
Nel programma possiamo vedere come l'output è casuale infatti TIC, TAC e TOE sono generati in modo puramente casuale, con tempi casuali.
Quando capita TAC e poi TOE il punteggio totale viene incrementato di +1. 

# Istruzioni programma
1. Andare a visualizzare il codice nel file MultiThread.java.
2. Scaricare il file.
3. Aprirlo con Netbeans o qualsiasi altro editor per JAVA.
4. Apportare le opportune modifiche per far funzionare il codice ( come ad esempio modificare il nome del package o del file).
5. Una volta apportate le modifiche si può tranquillamete eseguire il programma ( basta schiacciare sulla freccia verde in alto).
6. Sulla console di output si potrà visualizzare l'esecuzione del programma.
7. Se tutto è giusto è perfetto, se si verificano errori, ripetere tutti i punti.

# Istruzioni per la modifica
Il programma è completamente personalizzabile,  basta solo capire esattamente cosa modificare. Ad esempio alcune delle modifiche che si possono fare, sono la modifica del tempo random per la visualizzazione dell'output e l'aggiunta di altri thread.
Ora vediamo come fare queste due modifiche:

• **Modificare il tempo random** : 
1. Aprire il codice
2. Cercare la linea che contiene: <code>int casuale=100+(int)(Math.random()*300);</code> in questo caso per andare a modificare il tempo basterà specificare i due numeri da prendere in considerazione per l'output. In questo esempio il codice tiene conto di un tempo random che inzia da 100 e finisce a 300. Lui prenderà in considerazione un numero compreso fra questi.
3. ricompilare il programma e vedere se funziona.

• **Aggiungere un thread**:
1.  Aprire il codice
2.  Andare nel main 
3.  Dichiarare il thread usando la seguente sintassi: <code>Thread nuovoThread = new Thread (new TicTacToe("output da visualizzare")); </code>  al posto di nuovoThread metteremo il nome che vogliamo assegnarli e invece al posto di  ("output da visualizzare") metteremo l'output che vogliamo vedere


