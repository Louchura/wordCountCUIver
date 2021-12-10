package main;

import java.util.ArrayList;
import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterSearch {

	public List<String> searching(String word) {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("5FOSND2aTW828JmUI1BTptUSP")
		  .setOAuthConsumerSecret("uWbzDwWNRxj09J3FvnV4ICzaMOynVcDpX7VNxVR5Jooyab6veS")
		  .setOAuthAccessToken("838570515862171648-HHPdd88KpOBBYb9PCdh3BlYFs5pDGiE")
		  .setOAuthAccessTokenSecret("xpiBv02sTYsmtcnQVEKIkJHkhGXSdaAlwIwNopps6EONp");
	    TwitterFactory tf = new TwitterFactory(cb.build());
	    //# Twitterクラスのインスタンス生成
	    Twitter twitter = tf.getInstance();

	    Query query=new Query();
	    query.setQuery(word);
	    //1度の検索で取得するツイートの数
	    query.setCount(100);
	    //結果格納用リストを用意。インスタンスの要素としてツイート本文を保持。
	    //つまりこの中身を取り出せば、ツイートの本文を取得できる。
	    List<String> results=new ArrayList<String>();

	    try {
	    	//検索を実行
			QueryResult result=twitter.search(query);
			for(Status tweet:result.getTweets()) {
				results.add(tweet.getText());
			}

		} catch (TwitterException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	    return results;

	}

}
