package javaproject.projectjava.controllers;

import java.util.ArrayList;
import java.util.List;

public class PostForm {
    public List<Object> tweets = new ArrayList<>(); 

    public List<Object> getTweet() {
        return tweets;
    }

    public void setTweet(Object tweet) {
        this.tweets.add(tweet);
    }
}
