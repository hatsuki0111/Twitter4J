import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Sub {

    public Twitter twitter;

    public void doHogeHoge() {
        getTwitter();
        try {
            //先頭に#でハッシュタグ
            twitter.updateStatus("#"+"てすと");
        }catch (TwitterException e){
            e.printStackTrace();
        }
    }

    public void getTwitter () {
        if (twitter == null) {
            ConfigurationBuilder cb = new ConfigurationBuilder();
            cb.setDebugEnabled(true)
                    .setOAuthConsumerKey("dfajnewiw38923njlnrlanlr299p9000n00")
                    .setOAuthConsumerSecret("gjagpgjpoj223992099300029uACoWOVatvuxUj5cdQFxSD")
                    .setOAuthAccessToken("101000020020-ajajipoTijS6VhCFCf8BO8X3UFQI5z8Ff")
                    .setOAuthAccessTokenSecret("jfpoajiefpoa1u218900jfjkljfkapPbSyyJ1M5hKjYxewMxzjUw");
            TwitterFactory tf = new TwitterFactory(cb.build());
            twitter = tf.getInstance();
        }
    }
}
