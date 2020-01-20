import twitter4j.*;
import twitter4j.conf.*;
public class Tweet {
    public static void main(String[] args) {
        Sub tweet = new Sub();
        tweet.doHogeHoge();
        tweet.getTwitter();
    }

    //mainクラス直書き
    /*
         public static void main(String[] args) {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("daokami2938nnmgac0234joppjop32opja30M")
                .setOAuthConsumerSecret("zMakgapjpnagi389202jklp2309003pappk3209FxSD")
                .setOAuthAccessToken("105175794aoa2gare33akg04904r904309ralrarneaQI5z8Ff")
                .setOAuthAccessTokenSecret("Avu95fahfiahfebabaoeo23232hj3njkn9a98989njn3w");
        try {
            TwitterFactory tf = new TwitterFactory(cb.build());
            Twitter twitter = tf.getInstance();
            twitter.updateStatus("テスト at " + (new java.util.Date()));
        }catch (TwitterException e){
            e.printStackTrace();
        }
    }*/
}

