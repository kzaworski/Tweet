package dao;

import Models.Tweet;

public interface TweetDAO {


    Tweet getTweet(Long id);

    void addTweet(Tweet tweet);

    void updateTweet(Tweet tweet, Long id);

    void deleteTweet(Long id);


}