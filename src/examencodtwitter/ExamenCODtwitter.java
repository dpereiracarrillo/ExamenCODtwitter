package examencodtwitter;

import javax.swing.JOptionPane;
import twitter4j.TwitterException;

/**
 *
 * @author Daniel
 */
public class ExamenCODtwitter {

    
    public static void main(String[] args) throws TwitterException {
        String busqueda;
         String tweet;
         int opcion;
         Metodos obj = new Metodos();

         obj.verTL();

          busqueda = JOptionPane.showInputDialog("Introduzca lo que desee buscar en Twitter");
          obj.buscarTrending(busqueda);

          tweet = JOptionPane.showInputDialog("Introduzca lo que desee twittear");
          obj.tweetear(tweet);
    }
    
}
