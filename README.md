# Twitter4J
## Twitter4Jとは?
http://twitter4j.org/ja/index.html#howToUse 

## 使いかた
まずは、TwitterAccountの申請
https://qiita.com/kngsym2018/items/2524d21455aac111cdee⁽1⁾  
その後、アクセスtokenを取得する  

Windows10 inteliJ Maven Java11を使用  
inteliJでFile->New->Projectでmavenを選ぶnext  
GroupId ArtifactIdを決めてnext ProjectNameを決めてFinish  
src->main->javaにmainクラスを適当な名前で作る。このrepositoryではTweetクラス  

### mavenに追加
```<dependencies>
      <dependency>
           <groupId>org.twitter4j</groupId>
           <artifactId>twitter4j-core</artifactId>
           <version>[4.0,)</version>
       </dependency>
   </dependencies>
   ```
   
   
### Tweetクラスのmainに以下を記述する。  

``` 
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
```

""で囲まれている部分にtokenを記入  
ビルドで自分のtwitterで確認する。  
## 参考資料  
(1)Twitter API 登録 (アカウント申請方法) から承認されるまでの手順まとめ　※2019年8月時点の情報　Qiita  
https://blog.unfindable.net/archives/5011  
https://qiita.com/hyperkinoko/items/5554dcb6e5e7140f74aa
