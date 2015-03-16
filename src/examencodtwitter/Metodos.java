package examencodtwitter;

import java.util.List;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author Daniel
 */
public class Metodos {

    Twitter twitter;

    /**
     * El constructor da acceso a la clase
     */
    public Metodos() {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("XXXXXXXXXXXXXXXXXXXXXXXX")
                .setOAuthConsumerSecret("XXXXXXXXXXXXXXXXXXXXXXXX")
                .setOAuthAccessToken("XXXXXXXXXXXXXXXXXXXXXXXX")
                .setOAuthAccessTokenSecret("XXXXXXXXXXXXXXXXXXXXXXXX");

        twitter = new TwitterFactory(cb.build()).getInstance();

    }

    /**
     * Método para ver el TimeLine de tu Twitter, te enseña los útltimos twits
     * publicados por la gente a la que sigues
     */
    public void verTL() throws TwitterException {

        List<Status> statuses = twitter.getHomeTimeline();
        System.out.println("Showing home timeline.");
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":"
                    + status.getText());
        }

    }

    /**
     * Método para buscar una string, le introduces un texto y buscas los twits
     * que incluyen ese texto
     */
    public void buscarTrending(String busqueda) throws TwitterException {

        Query query = new Query(busqueda);
        QueryResult result = twitter.search(query);
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
        }

    }

    /**
     * Metodo para twitear, puedes escibir lo que quieras para que después sea
     * publicado
     */
    public void tweetear(String tweet) throws TwitterException {

        Status status = twitter.updateStatus(tweet);
        System.out.println("Successfully updated the status to [" + status.getText() + "].");

    }

}
