package examencodtwitter;

import twitter4j.Twitter;
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

    
}
