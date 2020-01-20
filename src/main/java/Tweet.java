import twitter4j.*;
import twitter4j.conf.*;
public class Tweet {
    public static void main(String[] args) {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("dayQHbvKvSd5SpiyD5K6JwKLM")
                .setOAuthConsumerSecret("zMHk7665aZmimU7SdGVAsOMLyvFJuACoWOVatvuxUj5cdQFxSD")
                .setOAuthAccessToken("1051757940879765504-p0URTijS6VhCFCf8BO8X3UFQI5z8Ff")
                .setOAuthAccessTokenSecret("Avu95L2CimMA8Zhg7XJOnoxPbSyyJ1M5hKjYxewMxzjUw");
        try {
            TwitterFactory tf = new TwitterFactory(cb.build());
            Twitter twitter = tf.getInstance();
            twitter.updateStatus("テスト at " + (new java.util.Date()));
        }catch (TwitterException e){
            e.printStackTrace();
        }
    }
    }
