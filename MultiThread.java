

package multithread;

import java.util.concurrent.TimeUnit;
import static multithread.TicTacToe.contatore;


public class MultiThread {

    public static void main(String[] args) {
        System.out.println("Main Thread iniziata...");
        long start = System.currentTimeMillis();
        
        Thread tic = new Thread (new TicTacToe("TIC"));
        tic.start();
        
        Thread tac = new Thread(new TicTacToe("TAC"));
        tac.start();
        
        Thread toe = new Thread (new TicTacToe("TOE"));
        toe.start();
           long end = System.currentTimeMillis();
        System.out.println("Main Thread completata! tempo di esecuzione: " + (end - start) + "ms");
        try{
            tic.join();
        }catch(InterruptedException e)
        {System.out.println(e);}
         try{
            tac.join();
        }catch(InterruptedException e)
        {System.out.println(e);}
         try{
            toe.join();
        }catch(InterruptedException e)
        {System.out.println(e);}
         
         System.out.println("Punteggio:  -- >> "+ contatore);
   
    }
    
}

class TicTacToe  implements Runnable {

    
    private String t;
    private String msg;
    private static boolean taC = false;
    public static int contatore = 0;

    public TicTacToe (String s) {
        this.t = s;
    }
    
    @Override 
    
    public void run() {
     for (int i = 10; i > 0; i--) 
        {           
            if("TAC".equals(t))
                taC = true;
                
            msg = "<" + t + "> ";
            int casuale=100+(int)(Math.random()*300); //Tempo casuale tra 100 e 300 millisecondi
             try {
                TimeUnit.MILLISECONDS.sleep(casuale);
            } catch (InterruptedException e) {}
            if("TOE".equals(t) && taC == true)
                contatore++;
            else
                taC = false;
            msg += t + ": " + i;
            
            System.out.println(msg);
    }
            
    }
    
}
