

package multithread;

import java.util.concurrent.TimeUnit; // importo pacchetto 
import static multithread.TicTacToe.contatore;  // importo pacchetto per la visuliazzazione del punteggio 
 

public class MultiThread { // classe MultiThread dichiarata

    public static void main(String[] args) {  // classe principale d esecuzione Main
        System.out.println("Main Thread iniziata...");  // visualizzo output, che il nostro pogramma è inizziato 
        long start = System.currentTimeMillis(); // assegno a start il tempo iniziale in cui è stato eseguito il programma
        
        Thread tic = new Thread (new TicTacToe("TIC")); // creo un nuovo Thread è lo chiamo Tic con output TIC
        tic.start(); // avvio il thread TIC
        
        Thread tac = new Thread(new TicTacToe("TAC")); // creo un nuovo Thread è lo chiamo Toc con output TOC
        tac.start(); // avvio il thread TAC
        
        Thread toe = new Thread (new TicTacToe("TOE")); // creo un nuovo Thread è lo chiamo TOE con output TOE
        toe.start(); // avvio il thread TOE
           long end = System.currentTimeMillis();  // assegno a end il tempo finale in cui è stato eseguito il programma
        System.out.println("Main Thread completata! tempo di esecuzione: " + (end - start) + "ms"); // visualizzo poi alla fine il tempo totale che i thread hanno impiegato a concludere
        try{ // provo 
            tic.join();  // verifico quando tic ha concluso il Thread
        }catch(InterruptedException e) // eccezione
        {System.out.println(e);} // evventuale messaggio di errore
         try{ // provo 
            tac.join();  // verifico quando tac ha concluso il Thread
        }catch(InterruptedException e) // eccezione
        {System.out.println(e);} // evventuale messaggio di errore
         try{ // provo 
            toe.join(); // verifico quando toe ha concluso il Thread
        }catch(InterruptedException e) // eccezione
        {System.out.println(e);} // evventuale messaggio di errore
         
         System.out.println("Punteggio:  -- >> "+ contatore); // visualizzo il punteggio finale 
   
    }
    
}

class TicTacToe  implements Runnable { // implemento la classe 

    
    private String t;  // dichiarazione variabili
    private String msg;
    private static boolean taC = false;
    public static int contatore = 0;

    public TicTacToe (String s) { // costruttore di TicTacToe
        this.t = s;
    }
    
    @Override // Annotazione per il compilatore se facessimo un overloading invece di un override il copilatore ci segnalerebbe l'errore

    
    public void run() { // classe
     for (int i = 10; i > 0; i--)  // ciclo for
        {           
            if("TAC".equals(t)) // se tac è uguale all'output T
                taC = true; // allora taC è uguale a vero
                
            msg = "<" + t + "> ";   // assegno a msg il seguente testo
            int casuale=100+(int)(Math.random()*300); //Tempo casuale tra 100 e 300 millisecondi
             try { // provo
                TimeUnit.MILLISECONDS.sleep(casuale); // tempo random per la viosualizzazione random
            } catch (InterruptedException e) {} // eccezione
            if("TOE".equals(t) && taC == true) // se Toe è uguale a T e taC è uguale a vero 
                contatore++; // allora increamento il punteggio di +1
            else // altrimenti
                taC = false;  // tac diventa falso0
            msg += t + ": " + i;  // assegno a msg il seguente testo
            
            System.out.println(msg);  // visualizzo mesaggio di ouput
    }
            
    }
    
}
