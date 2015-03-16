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

     
     public Metodos() {

         ConfigurationBuilder cb = new ConfigurationBuilder();
         cb.setDebugEnabled(true)
                 .setOAuthConsumerKey("VnItYt2EEiPAymGQW01huMuXp")
                 .setOAuthConsumerSecret("aE5Dygm2VbzfH9BokMGAvTEPhfIrBPOJX2nRvQFKId1t6rhLAa")
                 .setOAuthAccessToken("779025319-KBKqeCiqBEXh0CqsvP8xL3wsSdmBWXEl2YGEqzQ4")
                 .setOAuthAccessTokenSecret("WJIrTUkKi2LbXMYsax0mRDcxz5PC1olzXKyVzAGTnZVfJ");

         twitter = new TwitterFactory(cb.build()).getInstance();

     }
     
      public void verTL() throws TwitterException {

         List<Status> statuses = twitter.getHomeTimeline();
         System.out.println("Showing home timeline.");
         for (Status status : statuses) {
             System.out.println(status.getUser().getName() + ":"
                     + status.getText());
         }

     }
      public void buscarTrending(String busqueda) throws TwitterException {

         Query query = new Query(busqueda);
         QueryResult result = twitter.search(query);
         for (Status status : result.getTweets()) {
             System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
         }

     }
      
     

    
}
